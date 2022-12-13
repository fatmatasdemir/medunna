Feature: US-16 TC-12 Admin  Oda olusturma ,Goruntuleme , guncelleme ve silme yapabilmeli

  Scenario: Admin API ile oda olusturur post

  {
  "createdBy": "team02",
  "createdDate": "2022-12-04T22:01:46.183930Z",
  "id": 372460,
  "roomNumber": 63732,
  "roomType": "TWIN",
  "status": true,
  "price": 150,
  "description": "Team02"
  }
    bu odayi guncelleyecegiz(put)


    Given  endpointi api "api" ve rooms "rooms" olan uzantiyi ekler
    Then   bir room olusturur oda tipi "TWIN" oda fiyati 199 oda numarasi 2332 description "buda gecer yaHu"post
    And    status kodunun 201 oldugunu dogrular
    And    Odayi okur
    Then   Oda olusturdugunu gorur



  Scenario: TC-13 Admin API ile oda numaralararini Update eder
  #oda cesitleri DELUXE,TWIN,PREMIUM_DELUXE,DAYCARE,SUITE
  Given  endpointi api "api" ve rooms "rooms" olan uzantiyi ekler
  Then   olusturulan odada id nosu 383526 olan oda tipini "DAYCARE" oda fiyatini 168 , oda numarasini 4533 descriptionu "null"  Update eder
  And    Update yi assert eder


  Scenario: TC-14 Admin API ile kayitli odayi Delete eder


    Given   endpointi api "api" ve rooms "rooms" ve id si 372467 olan uzantiyi ekler
    When    Admin kayitli odayi Delete eder
    And    Deleteyi assert eder




