Feature: test item testi



  @US17_TC_01
  Scenario: /api/c-test-items(get) should return 200 and  return response body in an appropreate schema
    Given send a request
    Then verify that the status code is 200 and  the response body in an approprate schema

  @US17_TC_02
  Scenario: the endpoint /api/c-test-items(get) should return 401 without valid token
    Given send a request with invalid token
    Then verify status code 401 and response body is as expected

  @US17_TC_03
  Scenario: /api/c-test-items/:id(delete) should return 204
    Given send a request for delete
    Then verify status code 204

  @US17_TC_04
  Scenario: the endpoint /api/c-test-items(put) should return 200
    Given send a request with a request body
    Then verify status code 200 and response body is as expected for put

  @US17_TC_05
  Scenario: test item olustur
    Given user sends a post request for test items
    And user gets the test items data and validates
