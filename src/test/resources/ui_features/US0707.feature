Feature: US0707 Hastalar randevu tarihi oluşturabilmelidir

  Background:
    Given kullanıcı "medunnaUrl" sayfasına gider
    Then  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    And Kullanici tüm bilgilerini girer


  @US007  @TC01
  Scenario: TC01-2 Kullanici gelecekteki tarihi girebilmelidir

    Then Appointment DateTime altindaki kutucuga ileri bir tarih girilir
    Then 2 saniye bekler
    And Send an Appointment Request'e tiklanir
    And Kullanici sayfayi kapatir


