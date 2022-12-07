Feature:physician api test

  Scenario: API kullanarak doktorları doğrulayın
    Given Kullanici "330662" id'li doktor verileri icin bir get request gonderir
    When status kodunun "200"oldugunu dogrular
    Then kullanici physician datasini dogrular