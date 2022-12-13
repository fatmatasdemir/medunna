@US24
Feature: Hasta (Patient) hesabına girdiğinde test sonuçlarını görebilmelidir.

  Scenario: Hasta yetkileri ile test sonucu arama

    Given Admin Medunna sayfasina gider
    Then Admin sayfanin sag ust kosesinde yer alan giris ikonuna tiklar
    And Admin dropdown menude Sign in butonuna tiklar
    And Kullanici Username olarak "hastaSckn" girer
    And Kullanici Password olarak "passwordSckn" girer
    And Sign in butonuna tiklar
    And Acilan sayfada MY PAGES sekmesine tiklar
    And Kullanici drop down menuden MyAppointment butonuna tiklar
    And Kullanici teste iliskin randevu satirindaki Show Tests butonuna tiklar
    And Kullanici istenilen test sonuclarini görüntüler


