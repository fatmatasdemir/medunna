Feature: US17 DataBase Test

  @US_17_DB
  Scenario: Test itemleri dogrular
    Given kullanici connection kurar
    And kullanici test item bilgilerini databaseden alir
    Then kullanici test item bilgilerini dogrular