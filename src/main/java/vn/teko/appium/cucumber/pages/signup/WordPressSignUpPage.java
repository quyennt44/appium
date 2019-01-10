package vn.teko.appium.cucumber.pages.signup;


import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import vn.teko.appium.cucumber.pages.base.BasePage;

public class WordPressSignUpPage extends BasePage {

    @SuppressWarnings("rawtypes")
	public WordPressSignUpPage(AndroidDriver driver){
        super(driver);
    }

    private String createAWordPressSiteButton_id = "org.wordpress.android:id/create_site_button";
    
    private String emailAddressInputField_id = "org.wordpress.android:id/email_address";

    private String userNameInputField_id = "org.wordpress.android:id/username";

    private String passwordInputField_id = "org.wordpress.android:id/password";

    private String blogAddressInputField_id = "org.wordpress.android:id/site_url";
    
    private String createAccountButton_id = "org.wordpress.android:id/signup_button";

    public void gotoWPSignUpPage(){
    	  waitVisibility(By.id(createAWordPressSiteButton_id));
          click(By.id(createAWordPressSiteButton_id));
    }

    public void enterSignUpScreenDetails(String email, String userName, String password, String blogAddress){
    	sendText(By.id(emailAddressInputField_id), email);
    	sendText(By.id(userNameInputField_id), userName);
    	sendText(By.id(passwordInputField_id), password);
    	sendText(By.id(blogAddressInputField_id), blogAddress);    	
    }

    public void clickSignUpButton(){
    	try {
    	  waitVisibility(By.id(createAccountButton_id));    	  
          click(By.id(createAccountButton_id));
    	} catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }
}
