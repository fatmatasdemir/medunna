package stepDefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import utilities.DatabaseUtility;

import java.util.Map;

public class US005_DB {
   // SoftAssert softAssert=new SoftAssert();
    Map<String, Object> randevuBilgileri;

    @Given("Kullanici connection kurar")
    public void kullanici_connection_kurar() {
        DatabaseUtility.createConnection();

    }
    @Given("Kullanici yeni kayitli randevu bilgilerini database'den alir")
    public void kullanici_yeni_kayitli_randevu_bilgilerini_database_den_alir() {
        String query = "select * from appointment where id=353476";
        randevuBilgileri = DatabaseUtility.getRowMap(query);
        System.out.println("Randevu bilgileri" + randevuBilgileri);


    }
    @Then("Kullanici randevu bilgilerini dogrular")
    public void kullanici_randevu_bilgilerini_dogrular() {
        String actualID = randevuBilgileri.get("id").toString();
        System.out.println("actualID = " + actualID);
        String actualName = randevuBilgileri.get("prescription").toString();
        System.out.println("actualName = " + actualName);
        String actualStart_date = randevuBilgileri.get("start_date").toString();
        System.out.println("actualStart_date = " + actualStart_date);
        String actualStatus = randevuBilgileri.get("status").toString();
        System.out.println("actualStatus = " + actualStatus);


        String expectedID = "353476";
        String expectedName = "dert etme";
        String expectedStartDate = "2022-11-30 00:00:00.0";
        String expectedStatus = "PENDING";

    /*    softAssert.assertEquals(actualName, expectedName, "Name uyusmadi");
        softAssert.assertEquals(actualStart_date, expectedStartDate, "Star Date uyusmadi");
        softAssert.assertEquals(actualID, expectedID, "Id uyusmadi");
        softAssert.assertEquals(actualStatus, expectedStatus, "Status uyusmadi");

        softAssert.assertAll();*/








    }


}
