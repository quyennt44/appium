package vn.teko.appium.cucumber.steps.signup;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vn.teko.appium.common.ThreadLocalDriver;
import vn.teko.appium.common.Utilities;
import vn.teko.appium.cucumber.pages.signup.WordPressSignUpPage;
import vn.teko.appium.cucumber.steps.base.BaseSteps;

public class WordPressSignUpScenarioSteps extends BaseSteps {
	// Instantiations
	WordPressSignUpPage wordPressSignUpPage;
	
	//Page Initialization
	@Before
	public void setupLoginSteps() {
		System.out.println("Cucumber Before-sign up-test-cucumber");
		setupCucumber();
		wordPressSignUpPage = new WordPressSignUpPage(ThreadLocalDriver.getTLDriver());		
	}

	@Given("User is on sign up page")
	public void gotoLoginPage() {
		wordPressSignUpPage.gotoWPSignUpPage();
	}

	@When("User enter valid credentials")
	public void enterInvalidData() {
		wordPressSignUpPage.enterSignUpScreenDetails(Utilities.randomAlphaNumeric(6) + "@gmail.com",
				Utilities.randomAlphaNumeric(7), Utilities.randomAlphaNumeric(8), Utilities.randomAlphaNumeric(5));
	}

	@Then("User click on Sign up button")
	public void signUp() {
		wordPressSignUpPage.clickSignUpButton();
	}

}
