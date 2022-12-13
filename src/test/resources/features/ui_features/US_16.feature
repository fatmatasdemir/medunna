Feature: Medunna Room

  Background: Ortak adimlar
    Given admin "medunna_login_url" sayfasina gider

    And ana sayfadaki giris ikonuna tiklar
    And sign in sekmesine tiklar
    When gecerli bir admin_user_name ve sifre girer
    And Acilan sayfada ust menudeki Items&titles sekmesine tiklar
    And Acilan menude room secenegini tiklar

  @US16_TC_01
  Scenario: Oda olusturulurken "Room Number" mutlaka olmali



    And Acilan sayfada create a new room sekmesine tiklar
    And Save secenegine tiklar
    Then Room Number kisminda This field is required yazisinin gorunur oldugunu dogrular



  @US16_TC_02
  Scenario: "Room Type"; TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE olmali


    And Acilan sayfada create a new room sekmesine tiklar
    And Room Type sekmesine tiklar
    Then Acilan menude "TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE" yazilarinin gorundugunu dogrular

  @US16_TC_03
      Scenario: Oda icin "Status" ayarlanabilir olmali.

        And Acilan sayfada create a new room sekmesine tiklar
        And Acilan sayfada Status check box'a tiklar
        Then Check box'in isaretlenmis oldugunu dogrular

  @US16_TC_04
  Scenario: Fiyat eklenebilir olmali

    And Acilan sayfada create a new room sekmesine tiklar
    And Room number kismina unique bir oda numarasi girer
    And price kismina bir fiyat yazar
    And Save secenegine tiklar
    Then Acilan Room sayfasinda A new Room is created with identifier yazisinin gorunur oldugunu test eder


  @US16_TC_05
  Scenario: Fiyat bos birakilamamali

    And Acilan sayfada create a new room sekmesine tiklar
    And Save secenegine tiklar
    Then Price kisminda This field is required yazisinin gorunur oldugunu dogrular


  @US16_TC_06
  Scenario: "Description" istege bagli olarak doldurulmali. negatif senaryo

    And Acilan sayfada create a new room sekmesine tiklar
    And Room number kismina unique bir oda numarasi girer
    And price kismina bir fiyat yazar
    And Save secenegine tiklar
    Then Acilan Room sayfasinda A new Room is created with identifier yazisinin gorunur oldugunu test eder

  @US16_TC_07
  Scenario: "Description" istege bagli olarak doldurulmali. pozitif senaryo

    And Acilan sayfada create a new room sekmesine tiklar
    And Room number kismina unique bir oda numarasi girer
    And price kismina bir fiyat yazar
    And description kismina bir tanim yazar
    And Save secenegine tiklar
    Then Acilan Room sayfasinda A new Room is created with identifier yazisinin gorunur oldugunu test eder

  @US16_TC_08
  Scenario: "Created Date" Ay/Gun/Yil şeklinde olmali.

    And Acilan sayfada create a new room sekmesine tiklar
    And tarihin istenen formatta oldugunu dogrular

  @US16_TC_09
  Scenario: "Created Date" gecmis tarih secilememeli.

    And Acilan sayfada create a new room sekmesine tiklar
    And Room number kismina unique bir oda numarasi girer
    And price kismina bir fiyat yazar
    And tarih kisminda yil kismini "10/10/2020" yapar
    And Save secenegine tiklar
    And Acilan Room sayfasinda A new Room is created with identifier yazisinin gorunur oldugunu test eder
    And Acilan room sayfasinda son sayfaya gider
    And kaydedilen odanin tarihinin kaydedilen tarih degil de guncel oldugunu onaylar

  @US16_TC_10
  Scenario: Admin mevcut odalari duzenleyebilir ve güncelleyebilir.

    And sayfadaki ilk odanin edit secenegine tiklar
    And Acilan sayfada Status check box'a tiklar
    And price kismina bir fiyat yazar
    And Save secenegine tiklar
    Then Acilan Room sayfasinda A Room is updated with identifier yazisinin gorunur oldugunu test eder

  @US16_TC_11
  Scenario: Admin ayni tur odalari gorebilir.

    And acilan sayfada room type ust basligina tiklar
    And sayfadaki ilk 3 odanin TWIN turde oldugunu dogrular
    And acilan sayfada room type ust basligina tiklar
    And ilk 3 odanin DAYCARE turunde oldugunu dogrular