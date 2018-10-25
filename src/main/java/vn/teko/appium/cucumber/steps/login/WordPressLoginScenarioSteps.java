package vn.teko.appium.cucumber.steps.login;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vn.teko.appium.common.ThreadLocalDriver;
import vn.teko.appium.cucumber.pages.login.WordPressLoginPage;
import vn.teko.appium.cucumber.steps.base.BaseSteps;

public class WordPressLoginScenarioSteps  extends BaseSteps {
   //Instantiations
	WordPressLoginPage wordPressLoginPage;

    //Screen Classes Initialization
    @Before
    public void setupLoginSteps () {
        System.out.println("Cucumber Before-login-test-cucumber");
        setupCucumber();
        wordPressLoginPage = new WordPressLoginPage(ThreadLocalDriver.getTLDriver());
    }
	
	@Given("User is on login page")
	public void gotoLoginPage(){
		wordPressLoginPage.clickLogin();	    
	}
        
	@When("Enter invalid credentials")
	public void enterInvalidData(){
		wordPressLoginPage.enterEmailIdWPLoginPage("invalidEmail@mail.com");
	}
	
	@Then("User is shown error message")
	public void checkErrorMessage(){
		wordPressLoginPage.checkErrorMessageShownWPLoginPage();
	}
	
}
