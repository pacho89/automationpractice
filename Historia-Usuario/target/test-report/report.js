$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CP/CP_020.feature");
formatter.feature({
  "line": 1,
  "name": "Change Address",
  "description": "The user is able to change address",
  "id": "change-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Testing change address",
  "description": "",
  "id": "change-address;testing-change-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am in the principal page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I press View my customer account",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Redirec to customer account",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I press MY ADDRESS",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I press delete in MY ADDRESS2",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I press in alert Aceptar",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Dont show MY ADDRESS2",
  "keyword": "And "
});
});