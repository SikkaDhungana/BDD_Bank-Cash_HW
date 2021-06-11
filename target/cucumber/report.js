$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Login_NewAccount_B\u0026C.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 17,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Saving Account",
        "New Account Opening",
        "150000",
        "2345678910",
        "Norah Smith",
        "8719865390",
        "https://www.techfios.com/billing/?ng\u003dadmin/"
      ],
      "line": 18,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21848650400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 1736960600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials-and-open-a-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario"
    },
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User fill up the form entering \"Saving Account\"and \"New Account Opening\"and \"150000\"and \"2345678910\"and \"Norah Smith\"and \"8719865390\"and \"https://www.techfios.com/billing/?ng\u003dadmin/\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "LoginStepDef.user_enters_the_and(String,String)"
});
formatter.result({
  "duration": 699699900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 4756336000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_should_be_able_to_see_the_dashboard()"
});
formatter.result({
  "duration": 98665100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 395825700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 1256768400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Saving Account",
      "offset": 32
    },
    {
      "val": "New Account Opening",
      "offset": 52
    },
    {
      "val": "150000",
      "offset": 77
    },
    {
      "val": "2345678910",
      "offset": 89
    },
    {
      "val": "Norah Smith",
      "offset": 105
    },
    {
      "val": "8719865390",
      "offset": 122
    },
    {
      "val": "https://www.techfios.com/billing/?ng\u003dadmin/",
      "offset": 138
    }
  ],
  "location": "LoginStepDef.user_fill_up_the_form_entering_and_and_and_and_and_and_and_clicks_on_submit(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 2571458400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_should_be_able_to_validate_new_account_created()"
});
formatter.result({
  "duration": 3027029400,
  "status": "passed"
});
formatter.after({
  "duration": 1164857400,
  "status": "passed"
});
});