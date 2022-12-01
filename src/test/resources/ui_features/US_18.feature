Feature: Medunna Room

  Background: Ortak adimlar
    Given admin "medunna_login_url" sayfasina gider
    And ana sayfadaki giris ikonuna tiklar
    And sign in sekmesine tiklar
    When gecerli bir admin_user_name ve sifre girer


  @US18_TC_01
  Scenario:Admin, doktorlarin bilgilerini gorebilmelidir.

    And Acilan sayfada ust menudeki Items&titles sekmesine tiklar
    And Acilan menude Physician secenegini tiklar
    And Acilan sayfada doktor bilgilerinin oldugunu dogrular

  @US18_TC_02
  Scenario:Admin, SSN kimligine gore kayitli bir kişiyi secebilir/arayabilir.

    And Acilan sayfada ust menudeki Items&titles sekmesine tiklar
    And Acilan menude Physician secenegini tiklar
    And  Acilan sayfada Create a new Physician sekmesine tiklar
    And  Use Search kutucuguna tiklar
    And  SSN kismini gecerli bir ssn numarasi girer
    And  ekrandaki User found with search SSN mesajini dogrular

  @US18_TC_03
  Scenario: Admin, Doktorlarin bilgilerini "Edit Butonu" uzerinden duzenleyebilir; firstname, lastname, exam fee, uzmanlik alani

    And Acilan sayfada ust menudeki Items&titles sekmesine tiklar
    And Acilan menude Physician secenegini tiklar
    And Acilan sayfada ilk doktorun edit sekmesine tiklar
    And Acilan sayfada first name kismina bir isim yazar
    And last name kismina bir soyisim girer
    And speciality kisminda Internal_medicine bolumunu secer
    And Bolumun secildigini dogrular
    And Acilan sayfada Choose File kismindan profil resmi atamasi yapar
    And ekranda choose file sekmesi yaninda yukledigi remin adinin oldugunu dogrular
    And exam fee kismina bir fiyat girer (85)
    And Fiyatin girildigini dogrular
    And Save secenegine tiklar
    And ekranda A Physician is updated with identifier yazisinin ciktigini dogrular

  @US18_TC_04
  Scenario:Admin mevcut doktorlari silebilir.
    And Acilan ana sayfada ust menudeki Items&titles sekmesine tiklar
    And Acilan menude Physician secenegini tiklar
    And Acilan sayfada ilk doktorun delete sekmesine tiklar
    And Acilan Confirm delete operation uyarisinda delete butonuna tiklar
    And ekranda "A Physician is deleted with identifier" uyarisinin gorundugunu dogrular



  @US18_TC_05
  Scenario:Admin mevcut kullanicilar arasindan doktoru secmelidir

    And Administration menusunden User management secenegine tiklar
    And islem yapmak istedigi kullanicida edit butonuna tiklar
    And Profiles menusunden Doktor secenegine tiklar
    And Save kismina tiklar
    And A user is updated with identifier mesajini dogrular