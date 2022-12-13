Feature: US26  İletişim Mesajı (Contact messages)

  Scenario: TC_001 Herhangi bir kullanıcı, bilgi almak için "Contact portal" üzerinden istek gönderebilmeli.


          Given Kullanici "medunnaUrl" adresine gider
          Then Kullanici Contact'a tiklar
          Then Location,Email ve Call Bilgileri dogrulanir
          And Kullanici sayfayi kapatir






    Scenario: TC_002 Kullanıcı "Name, Email, Subject, Message" bölümlerine data girebilmeli ve mesajını gönderebilmeli.

      Given Kullanici "medunnaUrl" adresine gider
      Then kullanici 1 saniye bekler
      Then Contect butonuna tiklar
      And  mesaj icin gerekli olan name kutucugu doldurur
      And  mesaj icin gerekli olan email kutucugu doldurur
      And  mesaj icin gerekli olan Subject kutucugu doldurur
      And  mesaj icin gerekli olan Message kutucugu doldurur
      Then Send butonuna taklar
      Then kullanici 3 saniye bekler
      Then Kullanici sayfayi kapatir



  Scenario: TC_003 Kullanici "Name, Email, Subject" kutularini bos birakamaz

    Given Kullanici "medunnaUrl" adresine gider
    Then kullanici 1 saniye bekler
    Then Contect butonuna tiklar
    And  Name bölümünü bos birakir
    Then kullanici 3 saniye bekler
    And  Email bölümünü  bos birakir
    Then kullanici 3 saniye bekler
    And  Subject bölümünü bos birakir
    Then kullanici 3 saniye bekler
    Then Message bölümünü bos birakir
    Then kullanici 3 saniye bekler
    And Name is required yazisini görür
    And Your email is required yazisini görür
    And This field is required yazisini görür
    Then Kullanici sayfayi kapatir










