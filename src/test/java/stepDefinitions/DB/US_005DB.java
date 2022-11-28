package  stepDefinitions.DB;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import utilities.DatabaseUtility;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class US_005DB {

    SoftAssert softAssert=new SoftAssert();
    Map<String, Object> randevuBilgileri;


    @Given("Kullanici connection kurar")
    public void kullaniciConnectionKurar() {
        DatabaseUtility.createConnection();



    }

    @And("Kullanici yeni kayitli randevu bilgilerini database'den alir")
    public void kullaniciYeniKayitliRandevuBilgileriniDatabaseDenAlir() {
        String query = "select * from appointment where id=353476";
        randevuBilgileri = DatabaseUtility.getRowMap(query);
        System.out.println("Randevu bilgileri" + randevuBilgileri);


    }

    @Then("Kullanici randevu bilgilerini dogrular")
    public void kullaniciRandevuBilgileriniDogrular() {
        String actualID = randevuBilgileri.get("id").toString();
        System.out.println("actualID = " + actualID);
        String actualName = randevuBilgileri.get("last_modified_by").toString();
        System.out.println("actualName = " + actualName);
        String actualStart_date = randevuBilgileri.get("start_date").toString();
        System.out.println("actualStart_date = " + actualStart_date);
        String actualStatus = randevuBilgileri.get("status").toString();
        System.out.println("actualStatus = " + actualStatus);


        String expectedID = "353476";
        String expectedName = "doctorfatma";
        String expectedStartDate = "2022-11-30 00:00:00.0";
        String expectedStatus = "PENDING";

        softAssert.assertEquals(actualName, expectedName, "Name uyusmadi");
        softAssert.assertEquals(actualStart_date, expectedStartDate, "Star Date uyusmadi");
        softAssert.assertEquals(actualID, expectedID, "Id uyusmadi");
        softAssert.assertEquals(actualStatus, expectedStatus, "Status uyusmadi");

        softAssert.assertAll();





    }


}
