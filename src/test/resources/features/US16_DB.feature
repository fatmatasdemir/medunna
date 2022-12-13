Feature: US-10 TC-11 Kullanici DB sorgu ile randevualrini gorebilmeli

  Scenario: TC-11 kullanici DB sorgulama ile randevularini gorur
# lutfen Scenario dan calistirin
    Given  Admin db ile medunnaya baglanti kurar Room olusturma
    When   Admin id nosu 401756 olan roomun query kismini olusturur
    And    Oda numarasini 2332 assert eder




