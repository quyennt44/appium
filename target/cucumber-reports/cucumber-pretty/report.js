$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login/invalid_login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page scenarios",
  "description": "",
  "id": "login-page-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 367386,
  "status": "passed"
});
formatter.before({
  "duration": 238253,
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
  "duration": 958383032,
  "status": "passed"
});
formatter.match({
  "location": "WordPressLoginScenarioSteps.enterInvalidData()"
});
