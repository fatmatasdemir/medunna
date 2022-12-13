Feature: Medunna Room

  Background: Ortak adimlar
    Given admin "medunna_login_url" sayfasina gider

    And ana sayfadaki giris ikonuna tiklar
    And sign in sekmesine tiklar
    When gecerli bir admin_user_name ve sifre girer
    And Acilan sayfada ust menudeki Items&titles sekmesine tiklar
    And Acilan menude Test Item secenegini tiklar

  @US17_TC_01
  Scenario: Admin, "test items; Name, Description, price Default min value ve Default max value olusturabilir ve guncelleyebilir.

    And  Acilan sayfada create a new Test Item sekmesine tiklar
    And  acilan syfada name kismina unique isim yazar
    And  acilan sayfada discription kismina arteriel kan basinci girer
    And  price kismina 10 yazar
    And  Default Min. Value kismina 60 girer
    And  Default Max. Value kismina 140 girer
    And  Save secenegine tiklar
    And  sayfada A new Test Item is created with identifier yazisinin gorundugunu dogrular


  @US17_TC_03
  Scenario: Admin test ogelerini goruntuleyebilir.

    And  Acilan sayfada ilk itemin view butonuna tiklar
    And  test item sayfasinin acildigini back butonunu gorerek dogrular

  @US17_TC_04
  Scenario: Admin test ogelerini guncelleyebilir.

    And Acilan sayfada ilk itemin edit butonuna tiklar
    And Acilan sayfada name kismina farkli bir isim girer
    And price kismina farkli bir fiyat girer
    And Save secenegine tiklar
    And A Test Item is updated with identifier yazisinin gorundugunu dogrular

