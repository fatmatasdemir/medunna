@US009
Feature: US_009 Staff (Personel),
  hasta bilgilerini görebilmeli, düzenleyebilmeli ama silememelidir

  Background: Ortak adimlar

    Given Kullanici "medunna_url" sayfasina gider
    Then Kullanici sayfanin sag ust kosesinde yer alan giris ikonuna tiklar
    And Acilan dropdown menude Sign in butonuna tiklar
    And Username olarak "staffUser" girer
    And Password olarak "staffPassword" girer
    And Sign in butonuna tiklar
    And Acilan sayfada MY PAGES sekmesine tiklar
    And Dropdown menuden Search Patient butonuna tiklar

  Scenario: TC_001 "My Pages" sekmesinden hasta bilgilerini görebilmelidir

    Then Hasta bilgilerinin gorunurlugunu dogrular
    And  Sayfayi kapatir

  Scenario: TC_002 Staff butun hasta bilgilerini duzenleyebilmelidir

    And Kullanici ilk hastanin yanindaki edit butonuna tiklar
    And Kullanici 3 saniye bekler
    Then Staff butun hasta bilgilerini duzenlenebilir oldugunu test eder
    And Kullanici 3 saniye bekler
    And Sayfayi kapatir

  Scenario: TC_003 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir

    And Kullanici Patient SSN kismina hastanin SSN bilgisini girer
    And Kullanici ilgili hastanin yanindaki view butonuna tiklar
    And kullanici  istenilen hastanin bilgilerinin gorunur oldugunu test eder
    And Sayfayi kapatir

  Scenario: TC_006 Kullanıcı herhangi bir hasta bilgisini silebilir

    And Kullanici ilk hastanin yanindaki edit butonuna tiklar
    And  Kullanici kayit bilgilerini siler
    Then  Bilgilerin silinip silinmedigini test eder
    And  Sayfayi kapatir

