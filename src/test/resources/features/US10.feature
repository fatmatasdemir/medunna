Feature: US-10  Doktor randevularini duzenleyebilmeli

    Background:
    Given Doctor "medunna_login_url" anasayfasina gider
    And   ikonu tiklar
    And   ilk sayfa sign in butonunu tiklar
    Then  kullanici adini girer
    And   Sifreyi girer
    And   Signin butonuna tiklar
    And   kullanici 2 saniye bekler
    When  Mypages butonuna tiklar
    And   kullanici 2 saniye bekler
    And   My appointments i tiklar
    And   kullanici 2 saniye bekler


  Scenario:  US-10_TC-01  Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

      And   Appoitments  sayfasinda  bulunan hastalarin randevu listesini ve zaman dilimlerini assert eder

 Scenario:  US-10_TC-02  Doktor "patient id, start date, end date, status" bilgilerini görebilmeli

      And Doktor patientID "10439", start date "25/11/22 01:00", end date "25/11/22 02:00", status "PENDING" bilgilerini görebilmeli


