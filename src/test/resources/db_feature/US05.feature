Feature: database test

  @US005_DBTest
  Scenario: Hasta randevulari database test
    Given Kullanici connection kurar
    And Kullanici yeni kayitli randevu bilgilerini database'den alir
    Then Kullanici randevu bilgilerini dogrular