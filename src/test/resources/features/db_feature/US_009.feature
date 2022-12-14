Feature: US_009 DB ile hasta bilgilerini dogrulama

  Scenario: Kullanıcının DB'den gelen tüm hasta bilgilerini doğrulamalıdır.

    Given Kullanici connection kurar.
    Then Kullanici database'den tum hasta bilgilerini alir
    And Kullanici tum hasta bilgilerini dogrular