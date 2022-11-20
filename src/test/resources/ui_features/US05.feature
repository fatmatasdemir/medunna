Feature: US05 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  @us005tc01
  Scenario Outline: US005 TC001 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz

    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    Then kullanıcı bir "<FirstName>" yazar ve bu alanı boş bırakamaz
    And Your "<FirstName>" is required. yazısının olmadığı test edilir.
    Then kullanıcı sayfayı kapatır


    Examples:
      |FirstName|
      |fatma|

