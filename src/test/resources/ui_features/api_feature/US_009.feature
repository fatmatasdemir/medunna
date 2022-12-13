Feature: API ile tüm hasta bilgilerini doğrulama

  Scenario: Kullanıcı, API kullanarak tüm hasta bilgilerini doğrulamalıdır.

    Given Kullanici id ile hasta bilgileri icin bir get request gonderir
    Then Kullanici  status kodunu oldugunu dogrulamalidir.
    And Kullanici hasta bilgilerini dogrular