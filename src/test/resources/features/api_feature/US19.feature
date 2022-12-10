Feature:US18 Kullanici Staff bilgilerini  dogrular
  @api18
  Scenario:TC01 Kullanici Staff bilgilerini  dogrular

    Given Kullanici "346151" id'li Staff verileri icin bir get request gonderir
    Then Kullanici  Status kodunu oldugunu dogrulamalidir
    Then Kullanici Staff bilgilerini dogrular