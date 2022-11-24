Feature:US07 Hastalar randevu tarihi oluşturabilmelidir.

  Background:
    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    Then 1 saniye bekler
    And Kullanici gecerli bilgileri girer
    Then 1 saniye bekler


  @US007  @TC01
  Scenario: TC01 Kullanici gelecekteki tarihi girebilmelidir

    Then Appointment DateTime altindaki kutucuga ileri bir tarih girilir
    Then 2 saniye bekler
    And kullanıcı Send an Appointment Request butonuna tıklar
    And kullanıcı sayfayı kapatır


  @US007    @TC02
  Scenario: TC02 Tarih sırası gün/ay/yıl şeklinde olmalıdır.

    Then Appointment DateTime altindaki kutucuga ileri bir tarih girilir
    Then 2 saniye bekler
    And Girilen tarihin gun.ay.yil formatinda oldugu test edilir
    Then 1 saniye bekler
    And kullanıcı Send an Appointment Request butonuna tıklar
    And kullanıcı sayfayı kapatır


  @US007  @TC03
  Scenario: TC03  Kullanici gecmis bir tarih ile Randevu alamamalidir
    Then Kullanici appointment DateTime Gecmis bir tarih girer
    Then 2 saniye bekler
    And Kullanici gecmis bir tarihle randevu alinamayacagini test eder
    Then 1 saniye bekler
    And kullanıcı Send an Appointment Request butonuna tıklar
    And kullanıcı sayfayı kapatır
