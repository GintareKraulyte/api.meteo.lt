$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/tests/MainPage.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Heading",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Ready"
    }
  ]
});
formatter.step({
  "name": "I select \"chrome\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "header is visible",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "heading is visible",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});