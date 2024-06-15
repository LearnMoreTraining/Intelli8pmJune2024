Feature:  Learn More Automation

  @lmti01
  Scenario: login validation
    Given user enter the user name and password
    When user clicks on login button
    Then user validate the error message

  @lmti02
  Scenario: Alert Message validation
    Given user switch to alert and get the text
    When user clic on cancel button
    Then user validate the message in UI