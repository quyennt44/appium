$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("invalid_login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page scenarios",
  "description": "",
  "id": "login-page-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 360212,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User is not allowed to login with invalid credentials",
  "description": "",
  "id": "login-page-scenarios;user-is-not-allowed-to-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User is shown error message",
  "keyword": "Then "
});
formatter.match({
  "location": "WordPressLoginScenarioSteps.gotoLoginPage()"
});
formatter.result({
  "duration": 2062677298,
  "status": "passed"
});
formatter.match({
  "location": "WordPressLoginScenarioSteps.enterInvalidData()"
});
formatter.result({
  "duration": 7146241994,
  "status": "passed"
});
formatter.match({
  "location": "WordPressLoginScenarioSteps.checkErrorMessage()"
});
formatter.result({
  "duration": 2601588709,
  "status": "passed"
});
});