Feature: US17 DataBase Test

  @US_28_DB
  Scenario: Ulkeleri DB ile dogrular
    Given kullanici connection kurar
    And kullanici country bilgilerini databaseden alir
    Then kullanici country bilgilerini dogrular