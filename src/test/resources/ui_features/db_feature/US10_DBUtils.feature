Feature: US-10 TC-12 DB sorgu degisti

  Scenario: TC-12 DB sorgu degisti
# lutfen Scenario dan calistirin  # lutfen feature ve scenario daki yazilarda degisiklik yapin
    Given Doktor DBUtils ile medunnaya baglanti kurar
    And   Doktor DBUtils ile sorgu yapar doktor id  301030 baslik "appointment"
    Then  Doktor DBUtils ile hasta randevu basliktan "patient_id"  patientID si "9088" olan hastanin kaydini gorur

