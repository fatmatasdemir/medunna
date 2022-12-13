Feature: US-10 Physician  randevularini gorebilmeli

  Scenario:  Physician API ile randevularini gorebilir

    Given Kullanici gerekli olan parametre yolunu hazirlar  path params api "api" and "appointments"
    Then  Kullanici  GET Request to the URL gonderir
    And   HTTP Status Code should be 200 olmali medunna
    And   Doktor kendi Id numarasina ait 23 nolu randevularini dogrular
