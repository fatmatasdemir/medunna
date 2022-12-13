Feature: US05 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  @us005tc01
  Scenario Outline: US005 TC001 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz

    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    Then 1 saniye bekler
    And kullanıcı bir "<FirstName>" yazar ve bu alanı boş bırakamaz
    Then 1 saniye bekler
    And kullanıcı sayfayı kapatır

    Examples:
      |FirstName|
      |Derya|


  @us005tc02  @all
  Scenario Outline: US005 TC002 Kullanıcı SSN numarası girer  (kayıtlı SSN) ve bu kısım boş bırakılamaz.

    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    Then 1 saniye bekler
    Then kullanıcı kayıtlı "<SSN>" yazar ve bu alanı boş bırakamaz
    Then 1 saniye bekler
    And Your SSN is invalid yazısının olmadığı test edilir.
    Then 1 saniye bekler
    And kullanıcı sayfayı kapatır



    Examples:
      |SSN|
      |646-12-1240|


  @us005tc03  @all
  Scenario Outline: US005 TC003 Kullanıcının herhangi bir karakter içeren "Last Name" yazması gerekir ve boş bırakılamaz

    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    Then 1 saniye bekler
    Then kullanıcı LastName kısmına bir "<LastName>" yazar ve bu alanı boş bırakamaz
    Then 1 saniye bekler
    And Last Name kısmının altında Your "<LastName>" is required. yazısının olmadığı  test edilir.
    And kullanıcı sayfayı kapatır


    Examples:
      | LastName|
      |Hayalmutsuz|



  @us005tc04  @all
  Scenario Outline: US005 TC004 Kullanıcı "." ve "@" içeren e-mail adresi girmeli ve bualanı boş bırakamaz.

    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    Then 1 saniye bekler
    Then kullanıcı email kısmına bir "<Email>" yazar ve bu alanı boş bırakamaz
    Then 1 saniye bekler
    And Email kısmının altında Your "<Email>" is required. yazısının olmadığı  test edilir.
    And kullanıcı sayfayı kapatır


    Examples:
      | Email|
      |team02@gmail.com|



  @us005tc05  @all
  Scenario Outline: US005 TC005 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını girer ve bu alanı boş bırakamaz.

    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    Then 1 saniye bekler
    Then kullanıcı telefon numarası kısmına bir 3. ve 6. rakamdan sonra "-" olan 10 rakamlı "<PhoneNumber>" girer ve bu alanı boş bırakamaz
    Then 1 saniye bekler
    And telefon numarasının altında Your "<PhoneNumber>" is required. yazısının olmadığı  test edilir.
    Then 1 saniye bekler
    And kullanıcı Send an Appointment Request butonuna tıklar
    And kullanıcı sayfayı kapatır

    Examples:
      |PhoneNumber|
      |632-273-9871|


  @us005tc06  @all
  Scenario Outline: US005 TC001 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz

    Given kullanıcı "medunnaUrl" sayfasına gider
    And  kullanıcı sayfanın sag ust kısmındaki kullanıcı logosuna tıklar
    Then 1 saniye bekler
    Then  kullanıcı acilan menude Sign in butonuna tiklar
    Then 1 saniye bekler
    And  kullanıcı username kısmına "<username>"  girer.
    Then 1 saniye bekler
    Then  kullanıcı password kısmına "<password>" girer.
    Then 1 saniye bekler
    And  kullanıcı sayfaya gidebilmek icin Sign in butonuna tıklar.
    Then 1 saniye bekler
    Then  kullanıcı sayfanin sağ ust kismindaki My Pages butonuna tiklar.
    Then 1 saniye bekler
    And kullanıcı My Appointments butonuna tıklar
    Then 1 saniye bekler
    Then kullanıcı randevusunu oluşturduğunu görür
    And kullanıcı sayfayı kapatır


    Examples:
      |username|password|
      |fatmademir|Team02@12345.|


  @us005tc07

  Scenario Outline: Hasta gecersiz bilgilerle randevu olusturamamali

    Given kullanıcı "medunnaUrl" sayfasına gider
    And 1 saniye bekler
    When kullanıcı anasayfadaki Make an Appointment butonuna tıklar
    And 1 saniye bekler
    And kullanıcı bir "<firstName>" yazar
    And 1 saniye bekler
    And kullanıcı LastName kısmına bir "<lastName>" yazar
    And 1 saniye bekler
    And kullanıcı kayıtlı "<SSNN>" yazar
    And 1 saniye bekler
    And kullanıcı email kısmına bir "<email>" yazar
    And 1 saniye bekler
    And kullanıcı telefon numarası kısmına 10 rakamlı "<phoneNumber>" girer
    And 1 saniye bekler
    And Kullanici randevu tarihini  secer
    And 3 saniye bekler
    And kullanıcı Send an Appointment Request butonuna tıklar
    And 3 saniye bekler
    Then Kullanici ekranda Appointment registration saved mesajini gorememeli

    Examples:
      |firstName| SSNN| lastName|email| phoneNumber|
      |Vuslat |646-12-1240| Candemir|team02@gmail.com|8522739871|

