Feature: Registration should be available using SSN, Firstname and Lastname
  @Dene-me
  Scenario:
    Given User goes to Medunna url
    When  user navigates the register in page
    And user waits 2 seconds
    And  user sees the register button and clicks  on the register button
    And user waits 2 seconds
    Then User enters a 9 digit number in the SSN box on the page
    And user waits 2 seconds
    And  After the 3rd and 5th digits, there must be a "-"
    And user waits 2 seconds
Scenario Outline:
  Given User goes to Medunna url
  When  user navigates the register in page
  And user waits 2 seconds
  And  user sees the register button and clicks  on the register button
  And user waits 2 seconds
  Then User enters a "<INVALIDSSN>"in the SSN box on the page
  And user waits 2 seconds
  And User sees your SSN is invalid
  Examples:
    |INVALIDSSN|
    |123-234542|
    |12345-8765|
    |123-45-567|
    |123-45-54321|
