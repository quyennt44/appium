package vn.teko.appium.cucumber.test.runners.base;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import vn.teko.appium.common.FileReaderManager;
import vn.teko.appium.common.ThreadLocalDriver;

public class BaseTest {

    public WebDriverWait wait;    

    @SuppressWarnings("rawtypes")
	@BeforeMethod
    @Parameters({"deviceName", "platformVersion", "udid"})
    public void setup (String deviceName, String platformVersion, String udid) throws IOException {
        System.out.println("TestNG Before");

        //Unlock the device if it is locked.
//        final Runtime rt = Runtime.getRuntime();
//        rt.exec("adb shell input keyevent 224");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("udid", udid);
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("appPackage", "org.wordpress.android");
//        caps.setCapability("appActivity","org.wordpress.android.ui.WPLaunchActivity");
//        caps.setCapability("noReset","true");
//        
//        ThreadLocalDriver.setTLDriver(new AndroidDriver (new URL("http://localhost:4444/wd/hub"),caps));
        
        caps.setCapability("platformName", FileReaderManager.getInstance().getConfigReader().getPlatformName());
        caps.setCapability("appPackage", FileReaderManager.getInstance().getConfigReader().getAppPackage());
        caps.setCapability("appActivity",FileReaderManager.getInstance().getConfigReader().getAppActivity());
        caps.setCapability("noReset",FileReaderManager.getInstance().getConfigReader().getNoReset());
//        caps.setCapability("automationName","UiAutomator2");
        
        ThreadLocalDriver.setTLDriver(new AndroidDriver (new URL(FileReaderManager.getInstance().getConfigReader().getGridServerUrl()),caps));
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 30);   
    }

    @AfterMethod
    public synchronized void teardown(){    	
    	try {
//    		ThreadLocalDriver.getTLDriver().closeApp();
//    		ThreadLocalDriver.getTLDriver().quit();
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    }

}
