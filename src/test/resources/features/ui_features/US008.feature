@us008
Feature: US_008 Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır

  Background: Ortak adimlar
    Given Kullanici "medunna_url" sayfasinda
    Then  sayfanin sag ust kosesinde yer alan giris ikonuna tiklar
    And   Acilan dropdown menude Sign in butonuna tiklarr
    And   Username olarak "staffUser" girerr
    And   Password olarak "staffPassword" girerr
    And   Sign in butonuna tiklar ve sayfaya giris yapar
    And   Sayfanin sag ust kosesinde yer alan giris ikonuna tiklar ve Password butonuna tiklar
    And Kullanici 3 dakika bekler
    And "Current password" sekmesine gecerli bir password girer
    And Kullanici 3 dakika bekler

  @tc001
  Scenario: TC_001 "New password confirmation" onaylanabilmelidir

    And "New password" sekmesine yeni bir password girer
    And Kullanici 3 dakika bekler
    And "New password confirmation" sekmesine "New password" sekmesine girdigi passwordu tekrar girer
    And Kullanici save butonuna tiklar
    And Kullanici 3 dakika bekler
    Then  "Password changed" mesajinin gorunur oldugunu test eder
    And  Kullanici Sayfayi kapatir

  @tc002
  Scenario: TC_002 Daha güçlü şifre için en az 1 küçük harf olmalı ve "Password strength:" seviyesinin değiştiği görülebilmelidir

    And "New password" sekmesine en az 1 kucuk harf iceren yeni bir password girer
    And Kullanici 3 dakika bekler
    Then "Password strength" seviyesinin degistigini ve password strength'in turuncu renkte oldugunu test eder
    And  Kullanici Sayfayi kapatir

  @tc003
  Scenario: TC_003 Şifre en az 1 büyük harf içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir

    And "New password" sekmesine en az 1 buyuk harf iceren yeni bir password girer
    Then "Password strength" seviyesinin degistigini ve password strength'in turuncu renkte oldugunu test eder
    And  Kullanici Sayfayi kapatir

  @tc004
  Scenario: TC_004 Şifre en az 1 rakam içermeli ve "Password strength:" seviyesinin değiştiği görülebilmelidir

    And "New password" sekmesine en az 1 rakam iceren yeni bir password girer
    Then "Password strength" seviyesinin degistigini ve password strength'in acik yesil oldugunu test eder
    And  Kullanici Sayfayi kapatir

  @tc005
  Scenario: TC_005 Şifre en az 1 özel karakter içermeli ve"Password strength:" seviyesinin değiştiği görülebilmelidir

    And "New password" sekmesine en az 1 ozel karakter iceren yeni bir password girer
    Then "Password strength" seviyesinin degistigini ve password strength'in acik yesil oldugunu test ederr
    And  Kullanici Sayfayi kapatir

  @tc006
  Scenario: TC_006 Güçlü bir parola için şifre en az 7 karakterden oluşmalıdır

    And "New password" sekmesine en az 7 karakterden olusan yeni bir password girer
    Then "Password strength" seviyesinin degistigini ve password strength'in koyu yesil oldugunu test eder
    And  Kullanici Sayfayi kapatir

  @tc007
  Scenario: TC_007 Eski şifre kullanılmamalıdır

    And "New password" sekmesine "Current password" sekmesine girdigi passwordu girer
    And "New password confirmation" sekmesine "New password" sekmesine girdigi passwordu girerr
    And Kullanici save butonuna tiklar
    Then Password changed mesajinin gorunurlugunu dogrular
    And  Kullanici Sayfayi kapatir