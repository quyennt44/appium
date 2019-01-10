package vn.teko.appium.cucumber.steps.base;

import org.openqa.selenium.support.ui.WebDriverWait;

import vn.teko.appium.common.ThreadLocalDriver;

public class BaseSteps {
	protected WebDriverWait wait;
	
    //Screen Classes Initialization
    protected void setupCucumber () {
        System.out.println("Cucumber Base Test Before-login-test-cucumber");
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);       
        /*//Unlock the device if it is locked.
        final Runtime rt = Runtime.getRuntime();
        try {
            rt.exec("adb shell input keyevent 224");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    protected void teardown(){
//        ThreadLocalDriver.getTLDriver().quit();
    }
}
