Feature: DB kullarak staff dogrulayin

  Scenario: TC06 Admin DB baglanarak Staff bilgilerini dogrular
    Given kullanici connection kurar
    And kullanici DB ile "staff" tablosundaki "id" 346151 olan staff'in verilerini alir
    And kullanici DB ile staff verilerini okur
    Then Kullanici DB ile alinan datalari dogrular