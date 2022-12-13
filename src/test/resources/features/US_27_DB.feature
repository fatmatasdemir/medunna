Feature: US-27 Admin mesajlari API ve DB ile dogrulayabilmeli

  Scenario: US-27 TC-19 Admin mesajlari DB ile dogrular.

    Given Admin database e baglanir
    When  Admin id nosu 404352 olan query olusturur
    And   Gelen mesaji assert eder
