Feature: US013 Doktor test sonuc islemleri yapabilmeli

  Background:
    Given US013 kullanici "medunna" anasayfasina gider
    Then US013 kullanici Sign in butonuna tiklar
    And US013 kullanici Username ve Password girer
    And US013 kullanici doktor hesabi ile giris yapar

  Scenario: US013 TC001 doktor test sonuc bilgilerini gorebilmeli
    Then US013 kullanici randevulu hastalari goruntuler
    And US013 kullanici hasta duzenleye tiklar
    And US013 kullanici 2 saniye bekler
    And US013 kullanici test sonuclarini goruntuler
    And US013 kullanici test sonucunu gorur
    And US013 kullanici 2 saniye bekler
    And US013 kullanici sayfayi kapatir

  Scenario: US013 TC002 doktor yatili tedavi isteginde bulunabilmeli
    Then US013 kullanici randevulu hastalari goruntuler
    And US013 kullanici hasta duzenleye tiklar
    And US013 kullanici 2 saniye bekler
    And US013 kullanici hastaya yatis talep eder
    And US013 kullanici sayfayi kapatir