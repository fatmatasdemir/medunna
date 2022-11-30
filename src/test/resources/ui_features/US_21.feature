Feature: US_21 Show appointments  Functionality

  Background:
    Given Navigate to medunna
    When  Enter username and password and click login button
    And Staff clicks on My Pages and Search Patient
    Then Staff clicks Show Appointments
  @US19_20_21
  Scenario: Tc_1 staff can make update

    And Staff click on edit
    Then Staff clicks on the status
    Then Staff clicks on the status and on appointments pending
    And Staff Clicks on Physician and doctor chooses
    And  Click the save button
  @US19_20_21
  Scenario: Tc_2 Staff cannot make it COMPLETED

    When Staff click on edit
    Then Staff clicks on the status
    And Staff clicks on appointments pending or cancelled
    Then Staff can't click Complete
    And Click the save button
  @US19_20_21
  Scenario: Tc_3 Staff does not need to provid

    When Staff click on edit
    Then staff should not be able to enter data about Anamnesis
    And staff should not be able to enter data about Treatment
    Then staff should not be able to enter data about Diagnosis

  @US19_20_21
  Scenario:  Tc_4 select the Doctor
    When Staff click on edit
    And Staff Clicks on Physician and doctor chooses
    And Click the save button

  @US19_20_21
    Scenario: Tc_5 the patients test results
      When Staff clickd on Show Tests


