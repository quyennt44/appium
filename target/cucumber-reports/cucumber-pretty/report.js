$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sign_up.feature");
formatter.feature({
  "line": 1,
  "name": "Sign up page scenarios",
  "description": "",
  "id": "sign-up-page-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 470089,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User inputs credentials to create account",
  "description": "",
  "id": "sign-up-page-scenarios;user-inputs-credentials-to-create-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on sign up page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on Sign up button",
  "keyword": "Then "
});
formatter.match({
  "location": "WordPressSignUpScenarioSteps.gotoLoginPage()"
});
formatter.result({
  "duration": 1080510822,
  "status": "passed"
});
formatter.match({
  "location": "WordPressSignUpScenarioSteps.enterInvalidData()"
});
