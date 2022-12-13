Feature: US-10 TC-11 Kullanici DB sorgu ile randevualrini gorebilmeli

  Scenario: TC-11 kullanici DB sorgulama ile randevularini gorur
# lutfen Scenario dan calistirin
    Given Doktor db ile medunnaya baglanti kurar
    And   Doktor sorgu yapar doktor id  301030 baslik "appointment"
    Then  Doktor randevu listesini basliktan "patient_id" gorur
    And   DB sorgu Assert edilir
    And   DB sorgu hastaID 10372 ile assert edilir