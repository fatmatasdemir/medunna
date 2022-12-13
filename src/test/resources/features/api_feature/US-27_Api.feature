Feature: US-27 Admin mesajlari API ve DB ile mesajlari  dogrualamali ve okumalidir

  Scenario: US-27 TC-17 Admin, API kullanarak ileti oluşturmalidir

    Given Admin endpointi hazirlamak icin API "api" ve messages "c-messages" uzantilarini hazirlar -set the URl-
    When  Admin  post gonderir -send the POST- ve yaniti alir -get the Response-
    Then  HTTP status kodunun 201 oldugunu dogrular
    And   Json formatla assert eder


    Scenario:  US-27 TC-18 Admin  Admin ileti kullanarak okumayi dogrualamalidir

      Given  Admin send the Get data donderir  ve response alir
      Then  HTTP status kodunun 200 oldugunu dogrular
      When   Gelen responsu Txt dosyasina gonderir
      And   Txt dosyasindaki datayi assert eder


