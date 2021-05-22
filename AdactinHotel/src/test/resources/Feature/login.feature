Feature: verify Adactin Details
  Scenario: Verify Adactin login with valid credentials
    Given user should be in adactin page
    When user should enter "sudar123" , "sudar"
   
    And user should click login
    Then user need to validate error message

