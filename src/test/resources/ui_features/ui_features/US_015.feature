Feature: US15 Admin tarafından hasta oluşturma ve düzenleme
  Scenario: TC_001 admin tarafindan hasta olusturma

    Given Admin Medunna sayfasina gider
    Then Admin sayfanin sag ust kosesinde yer alan giris ikonuna tiklar
    And Admin dropdown menude Sign in butonuna tiklar
    And Kullanici Username olarak "adminSckn" girer
    And Kullanici Password olarak "passwordSckn" girer
    And  Sign in butonuna tiklar
    And Acilan sayfada ADMINISTRATION sekmesine tiklar
    And Dropdown menuden USER MANAGEMENT butonuna tiklar
    Then Kullanici Create_A_New_User butonuna tiklar
    Then Kullanici Login alanina gecerli bir kullanici adi girer
    Then Kullanici first_name alanina gecerli bir isim girer
    Then Kullanici last_name alanina gecerli bir soyisim girer
    Then Kullanici email alanina gecerli bir emailAdresi girer
    Then Kullanici ssn alanina gecerli bir ssnNo girer
    Then Kullanici language alanina English girer
    Then Kullanici profiles alanina gecerli bir role_admin girer
    Then Kullanici save butonuna tiklar
    Then Kellanici 1 saniye bekler
    And Kullanici kayit isleminin basarili oldugunu onaylar