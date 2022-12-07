Feature: DB kullarak doktorlari dogrulayin

  Scenario: TC06 Admin DB baglanarak doktor bilgilerini dogrular
    Given Kullanici connection kurar
    And kullanici DB ile "physician" tablosundaki "id" 330662 olan doktorun verilerini alir
    And kullanici DB ile doktorun verileri okur
    Then kullanici DB ile alinan datalari dogrular