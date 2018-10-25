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
    @Parameters({"deviceName", "platformVersion"})
    public void setup (String deviceName, String platformVersion) throws IOException {
        System.out.println("TestNG Before");

        //Unlock the device if it is locked.
        final Runtime rt = Runtime.getRuntime();
        rt.exec("adb shell input keyevent 224");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("platformName", FileReaderManager.getInstance().getConfigReader().getPlatformName());
        caps.setCapability("appPackage", FileReaderManager.getInstance().getConfigReader().getAppPackage());
        caps.setCapability("appActivity",FileReaderManager.getInstance().getConfigReader().getAppActivity());
        caps.setCapability("noReset",FileReaderManager.getInstance().getConfigReader().getNoReset());
        
        ThreadLocalDriver.setTLDriver(new AndroidDriver (new URL(FileReaderManager.getInstance().getConfigReader().getGridServerUrl()),caps));
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);   
    }

    @AfterMethod
    public synchronized void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }

}
