Feature: "My Appointments" Physician (Doctor) tarafından düzenlenebilmeli

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

   Scenario:  US-11_TC-03  Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir.

    And  Doktor  Create or edit an appointment işlemlerini yapabilmeli

   Scenario:  US-11_TC-04 Doktor randevuyu  güncellendiğinde; "id", "start and end date", "Status", "physician and patient" bilgilerini gormelidir

    And    Doktor  Create or edit an appointment işlemlerini yapabilmeli
    And    Doktor randevuyu guncellediginde id "304443", startDate "18/11/22 01:00", endDate "endDate", status "PENDING", physcian "physician" bilgilerini gormelidir

   Scenario Outline:  US-11_TC-05 (pozitif senaryo) Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarını doldurmak zorundadır.

     And     Doktor editIki alanini tiklar
     And     kullanici 2 saniye bekler
     And     Doktor  anamnesis"<Anamnesis>" alaninini doldurur
     And     kullanici 2 saniye bekler
     And     Doktor  treatment "<Treatment>" alanini doldurur
     And     kullanici 2 saniye bekler
     And     Doktor  diagnosis "<Diagnosis>" doldurur
     And     kullanici 2 saniye bekler
     And     Doktor save yi tiklar
     And     kullanici 2 saniye bekler


     Examples:

       |Anamnesis||Treatment||Diagnosis|
       | deneme  || deneme  ||deneme   |



  Scenario Outline:  US-11_TC-06 (negatif senaryo) Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarını doldurmak zorundadır.

    And     Doktor editBir alanini tiklar
    And     kullanici 2 saniye bekler
    And     Doktor  anamnesis"<Anamnesis>" alanini bos birakir
    And     kullanici 2 saniye bekler
    And     Doktor  treatment "<Treatment>" alanini bos birakir
    And     kullanici 2 saniye bekler
    And     Doktor  diagnosis "<Diagnosis>" alanini bos birakir
    And     kullanici 2 saniye bekler
    And     Doktor save yi tiklar
    And     kullanici 2 saniye bekler


    Examples:

      |Anamnesis||Treatment||Diagnosis|
      |         ||         ||         |

  Scenario Outline:  US-11_TC-07 (negatif senaryo) Doktor  "Anamnesis, Treatment ve Diagnosis" alanlarını doldurmak zorundadır.

    And      Doktor editBir alanini tiklar
    And     kullanici 2 saniye bekler
    And     Doktor  anamnesis"<Anamnesis>" alaninini doldurur
    And     kullanici 2 saniye bekler
    And     Doktor  treatment "<Treatment>" alanini doldurur
    And     kullanici 2 saniye bekler
    And     Doktor  diagnosis "<Diagnosis>" doldurur
    And     kullanici 2 saniye bekler
    And     Doktor  prescription "<Presciption>" alanini doldurur
    And     kullanici 2 saniye bekler
    And     Doktor  description "<Description>" alanini  doldurur
    And     kullanici 2 saniye bekler
    And     Assert edilir

    Examples:

      |Anamnesis||Treatment||Diagnosis||Presciption||Description|
      | Deneme  ||Deneme   ||Deneme   ||           ||           |

   Scenario:  US-11_TC-08 "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmelidir.

    And     Doktor editBir alanini tiklar
    And     kullanici 2 saniye bekler
    And     Doktor Status alaninini "PENDING" olarak degistirir

   Scenario:  US-11_TC-09 "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmelidir.

    And      Doktor editBir alanini tiklar
    And     kullanici 2 saniye bekler
    And     Doktor Status alaninini "COMPLETED" olarak degistirir


   Scenario:  US-11_TC-10 "Status" doktor tarafından "PENDING, COMPLETED veya CANCELLED" olarak seçilebilmelidir.

    And     Doktor editBir alanini tiklar
    And     kullanici 2 saniye bekler
    And     Doktor Status alaninini "CANCELLED" olarak degistirir


