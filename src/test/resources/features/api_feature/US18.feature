Feature:US18 Kullanici Doktor bilgilerini  dogrular
@api18
  Scenario:TC01 Kullanici Doktor bilgilerini  dogrular

   Given Kullanici "330662" id'li doktor verileri icin bir get request gonderir

    Then Kullanici Doktor bilgilerini dogrular

