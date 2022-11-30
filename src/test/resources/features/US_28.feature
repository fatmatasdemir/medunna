Feature: Medunna Room

  Background: Ortak adimlar
    Given admin "medunna_login_url" sayfasina gider

    And ana sayfadaki giris ikonuna tiklar
    And sign in sekmesine tiklar
    When gecerli bir admin_user_name ve sifre girer
    And Acilan sayfada ust menudeki Items&titles sekmesine tiklar


  @US28_TC_01
  Scenario:Kullanici yeni bir ulke olusturabilir
    And Acilan menude Country secenegini tiklar
    And Acilan sayfada "create a new Country" sekmesine tiklar
    And name kismina bir ulke ismi girer
    And save tusuna tiklar
    And ekranda A new Country is created with identifier mesajinin gorundugunu dogrular

