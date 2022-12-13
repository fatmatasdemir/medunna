@US23
Feature: Personel (Staff) hastanin id'si ile arama yapabilir

  Scenario: Personel yetkileri ile hasta arama

    Given Admin Medunna sayfasina gider
    Then Admin sayfanin sag ust kosesinde yer alan giris ikonuna tiklar
    And Admin dropdown menude Sign in butonuna tiklar
    And Kullanici Username olarak "adminSckn" girer
    And Kullanici Password olarak "passwordSckn" girer
    And Sign in butonuna tiklar
    And Kullanici Items Titles butonuna tiklar
    And Kullanici drop down menuden Appointment butonuna tiklar
    And Kullanici Create A New Appointment butonuna tiklar
    And Kullanici randevu formunu doldurur ve kaydeder


