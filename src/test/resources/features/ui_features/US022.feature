@US22
  Feature: Personel (Staff) hastanin id'si ile arama yapabilir

    Scenario: Personel yetkileri ile hasta arama


      Given Admin Medunna sayfasina gider
      Then Admin sayfanin sag ust kosesinde yer alan giris ikonuna tiklar
      And Admin dropdown menude Sign in butonuna tiklar
      And Kullanici Username olarak "personelSckn" girer
      And Kullanici Password olarak "passwordSckn" girer
      And  Sign in butonuna tiklar
      And Acilan sayfada Mypages sekmesine tiklar
      And Dropdown menuden Search Patient sekmesine tiklar
      And Kullanici  Patient SSN bölümüne "ssnSckn" bilgisini girer
      And Kullanici Show appointment butonuna tiklar
      And Kullanici test istenen bir randevuya ait Show Test butonuna tiklar
      And Kullanici View Results butonuna tiklar
      And Kullanici test sonuc sayfasinda "ID" ibarisinin oldugunu dogrular
      And Kullanici test sonuc sayfasinda "Name" ibarisinin oldugunu dogrular
      And Kullanici test sonuc sayfasinda "Result" ibarisinin oldugunu dogrular
      And Kullanici test sonuc sayfasinda "Default Min. Value" ibarisinin oldugunu dogrular
      And Kullanici test sonuc sayfasinda "Default Max. Value" ibarisinin oldugunu dogrular
      And Kullanici test sonuc sayfasinda "Test" ibarisinin oldugunu dogrular
      And Kullanici test sonuc sayfasinda "Description" ibarisinin oldugunu dogrular
      And Kullanici test sonuc sayfasinda "Date" ibarisinin oldugunu dogrular

