@us009
Feature: US_004 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır

  Background: Ortak adimlar

    Given Kullanici "medunna_url" sayfasina gider
    Then Kullanici sayfanin sag ust kosesinde yer alan giris ikonuna tiklar
    And Acilan dropdown menude Sign in butonuna tiklar
    And Username olarak "staffUser" girer
    And Password olarak "staffPassword" girer

  Scenario: TC_001 Giriş yapmak için başarı mesajını doğrulayan, geçerli bir kullanıcı adı ve şifre olmalıdır

    And Sign in butonuna tiklar
    Then Basari mesajinin gorunurlugunu test eder
    And Sayfayi kapatir

  Scenario: TC_002 Kullanıcının mevcut kimlik bilgilerini her zaman kullanabileceği, "Remember me" seçeneği olmalıdır

    Then "Remember me" seceneginin gorunurlugunu test eder
    And Sayfayi kapatir


  Scenario: TC_003 Eğer şifre unutulursa diye "Did you forget your password?" seçeneği olmalıdır.

    Then Did you forget your password? seceneginin gorunurlugunu test eder
    And Sayfayi kapatir


  Scenario: TC_004 "You don't have an account yet? Register a new account" seçeneği olmalıdır.

    Then You don't have an account yet? Register a new account seceneginin gorunur oldugunu test eder
    And Sayfayi kapatir


  Scenario: TC_005 "Cancel" seçeneği olmalıdır.

    Then Cancel seceneginin gorunurlugunu test eder
    And Sayfayi kapatir




