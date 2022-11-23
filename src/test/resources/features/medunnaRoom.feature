Feature: Medunna Room


  @z
  Scenario: Oda olusturulurken "Room Number" mutlaka olmali

    Given admin "medunna_login_url" sayfasina gider
    When admin 2 saniye bekler
    And ana sayfadaki giris ikonuna tiklar
    When admin 1 saniye bekler
    And sign in sekmesine tiklar
    When admin 1 saniye bekler
    When gecerli bir admin_user_name ve sifre girer
    When admin 1 saniye bekler
    And Acilan sayfada ust menudeki Items&titles sekmesine tiklar
    When admin 1 saniye bekler
    And Acilan menude room secenegini tiklar
    When admin 1 saniye bekler
    And Acilan sayfada create a new room sekmesine tiklar
    When admin 1 saniye bekler
    And Save secenegine tiklar
    When admin 1 saniye bekler
    Then Room Number kisminda This field is required yazisinin gorunur oldugunu dogrular










