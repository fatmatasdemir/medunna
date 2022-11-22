Feature: US07 Hastalar randevu tarihi oluşturabilmelidir.

  Background:
    Given Hasta Kullanici "medunnaUrl" gider
    When Kullanici anasayfadaki account-menu ye tiklar
    And Kullanici sign in butonuna tiklar
    Then Kullanici gecerli isim girisi yapar
    And Kullanici gecerli sifre girisi yapar
    And Kullanici ikinci sign in butonuna tiklar
    When Kullanici acilan sayfadaki MY PAGES(PATIENT) bolumune gelir
    And Make an Appointment'i tiklar
    And Kullanici gecerli Phone numarasini girer
    Then 1 saniye bekler



  @US007  @TC01
  Scenario: TC01-2 Kullanici gelecekteki tarihi girebilmelidir

    Then Appointment DateTime altindaki kutucuga ileri bir tarih girilir
    Then 2 saniye bekler
    And Send an Appointment Request'e tiklanir
    And Kullanici sayfayi kapatir


  @US007    @TC02
  Scenario: TC02 Tarih sırası gün/ay/yıl şeklinde olmalıdır.

    Then Appointment DateTime altindaki kutucuga ileri bir tarih girilir
    Then 2 saniye bekler
    And Girilen tarihin gun.ay.yil formatinda oldugu test edilir
    Then 1 saniye bekler
    And Send an Appointment Request'e tiklanir
    And Kullanici sayfayi kapatir


    @US007  @TC03
    Scenario:Kullanici gecmis bir tarih ile Randevu alamamalidir
      Then Kullanici appointment DateTime Gecmis bir tarih girer
      Then 2 saniye bekler
      And Kullanici gecmis bir tarihle randevu alinamayacagini test eder
      Then 1 saniye bekler
      And Send an Appointment Request'e tiklanir
      And Kullanici sayfayi kapatir

