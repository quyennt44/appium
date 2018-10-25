package vn.teko.appium.cucumber.pages.login;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import vn.teko.appium.cucumber.pages.base.BasePage;

public class WordPressLoginPage extends BasePage {

    @SuppressWarnings("rawtypes")
	public WordPressLoginPage(AndroidDriver driver) {
        super(driver);
    }

    //Mobile Elements
    private String loginButton_id = "org.wordpress.android:id/login_button";
    private String emailAddressField_xpath = "//android.widget.EditText";
    private String logInPageNextButton_id = "org.wordpress.android:id/primary_button";
    private String logInPageInvalidEmailErrorMessage_id = "org.wordpress.android:id/textinput_error";

    public void clickLogin () {
        waitVisibility(By.id(loginButton_id));
        click(By.id(loginButton_id));
    }
    
    public void enterEmailIdWPLoginPage(String email) {
        sendText(By.xpath(emailAddressField_xpath), email);
    }
    
    public void checkErrorMessageShownWPLoginPage () {
        waitVisibility(By.id(logInPageNextButton_id));
        click(By.id(logInPageNextButton_id));
        assertContains(getText(By.id(logInPageInvalidEmailErrorMessage_id)), "is not registered on WordPress.com");
    }
}
