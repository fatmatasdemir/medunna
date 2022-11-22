Feature: Registration should be available using SSN, Firstname and Lastname
  @Deneme
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
