Feature: US06 Kullanıcı bilgisi sekmesi (Setting) Ana Sayfada düzenlenebilir olmalıdır.


  Scenario: TC001 Kullanıcı bilgileri "firstname, lastname, email " girerken doldurulan kullanıcı bilgileri olmalıdır.

    Given kullanıcı "medunnaUrl" sayfasına gider
    And Kullanici giris ikonuna tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli username ve password ile girisi yapar
    Then Kullanici giris ikonuna tiklar
    And Kullanici settings butonuna tiklar
    Then 1 saniye bekler
    Then First Name bilgisinin dogrulugunu kontrol eder
    Then 1 saniye bekler
    And Last Name bilgisinin dogrulugunu kontrol eder
    Then 1 saniye bekler
    And Email bilgisinin dogrulugunu kontrol eder
    Then 1 saniye bekler
    And Kullanici Save butonuna tiklar
    Then Settings Saved yazisi gorundugu dogrulanir
    And kullanıcı sayfayı kapatır



  Scenario: TC002 "Firstname"güncelleme seçeneği olmalıdır.

    When kullanıcı "medunnaUrl" sayfasına gider
    And Kullanici giris ikonuna tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli username ve password ile girisi yapar
    Then Kullanici giris ikonuna tiklar
    And Kullanici settings butonuna tiklar
    And Kulanici farkli isim girer
    Then 1 saniye bekler
    And Kullanici Save butonuna tiklar
    Then Settings Saved yazisi gorundugu dogrulanir
    And kullanıcı sayfayı kapatır


  Scenario: TC003 "Lastname"güncelleme seçeneği olmalıdır.

    When kullanıcı "medunnaUrl" sayfasına gider
    And Kullanici giris ikonuna tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli username ve password ile girisi yapar
    Then Kullanici giris ikonuna tiklar
    And Kullanici settings butonuna tiklar
    And Kulanici farkli soyisim girer
    Then 1 saniye bekler
    And Kullanici Save butonuna tiklar
    Then Settings Saved yazisi gorundugu dogrulanir
    And kullanıcı sayfayı kapatır


  Scenario: TC004 "Email"güncelleme seçeneği olmalıdır.

    When kullanıcı "medunnaUrl" sayfasına gider
    And Kullanici giris ikonuna tiklar
    And Kullanici Sign in butonuna tiklar
    And Kullanici gecerli username ve password ile girisi yapar
    Then Kullanici giris ikonuna tiklar
    And Kullanici settings butonuna tiklar
    And Kulanici farkli email girer
    Then 1 saniye bekler
    And Kullanici Save butonuna tiklar
    Then Settings Saved yazisi gorundugu dogrulanir
    And kullanıcı sayfayı kapatır


