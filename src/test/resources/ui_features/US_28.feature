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

  @US28_TC_02
  Scenario:Kullanici ulkeleri silebilmelidir.
    And Acilan menude Country secenegini tiklar
    And Acilan sayfada ilk ulkenin delete butonuna tiklar
    And gelen onay uyarisinda delete secenegini tiklar
    And Ekranda A Country is deleted with identifier mesajinin gorundugunu dogrular


  @US28_TC_03
  Scenario:

    And Acilan menude State/City secenegini tiklar
    And create a new State/City sekmesine tiklar
    And name kismina bir isim girer
    And State/City kisminda istedigi ulkeyi secer
    And save secenegine tiklar
    And A new State/City is created with identifier mesajini dogrular