Feature: US_19   Create new Staff Functionality
  Background:
    Given Navigate to medunna
    When username and password and click login button
    And Admin, clicks Item and Titles and clicks staff button

  Scenario: US_19  Login with valid username and password

    When Admin, clicks add new staff.
    And click the use search button.
    Then Enter the SSN information and click the search user button.
    And Verify    message


  Scenario: US_19  TC_02 All their information should be populated

    When Admin, clicks add new staff.
    And click the use search button.
    Then Enter the SSN information and click the search user button.
    And All personnel information is filled in.
    And  Click the save button
    And Verify    message

  Scenario: US_19 TC_03 User (Admin) can select a user from the existing users

    And  Admin clicks the id of a user from among the existing users
    And Verify    message

  Scenario: US_19 TC_04 User can edit their info

    Then Admin edits Personnel information
    Then Click the save button
    And Verify    message


  Scenario: US_19 TC_05 User can delete their info

    Then Admin deleted Personnel information
    And Verify    message


