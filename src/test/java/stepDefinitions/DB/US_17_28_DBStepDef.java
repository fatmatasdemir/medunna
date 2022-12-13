package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import utilities.DatabaseUtility;

import java.util.List;
import java.util.Map;

import static utilities.DatabaseUtility.getColumnData;

public class US_17_28_DBStepDef {
    Map<String, Object> testItem;
    Map<String, Object> country;
    SoftAssert softAssert=new SoftAssert();
    @Given("kullanici connection kurar")
    public void kullaniciConnectionKurar() {
        DatabaseUtility.createConnection();

    }

    @And("kullanici test item bilgilerini databaseden alir")
    public void kullaniciTestItemBilgileriniDatabasedenAlir() {
        String query = "select * from c_test_item where id=367627";
        testItem = DatabaseUtility.getRowMap(query);
        System.out.println("Test Item Bilgileri" + testItem);

    }

    @Then("kullanici test item bilgilerini dogrular")
    public void kullaniciTestItemBilgileriniDogrular() {

        String actualID = testItem.get("id").toString();
        System.out.println("actualID = " + actualID);
        String actualName = testItem.get("name").toString();
        System.out.println("actualName = " + actualName);
        String actualDescription = testItem.get("description").toString();
        System.out.println("actualStart_date = " + actualDescription);
        String actualPrice = testItem.get("price").toString();
        System.out.println("actualStatus = " + actualPrice);
        String actualDefaultMinValue = testItem.get("default_val_min").toString();
        System.out.println("actualStatus = " + actualDefaultMinValue);
        String actualDefaultMaxValue = testItem.get("default_val_max").toString();
        System.out.println("actualStatus = " + actualDefaultMaxValue);


        String expectedID = "367627";
        String expectedName = "database";
        String expectedDescription = "db";
        String expectedPrice = "100.00";
        String expectedDefMinValue = "10";
        String expectedDefMaxValue = "20";

        softAssert.assertEquals(actualName, expectedName, "Name uyusmadi");
        softAssert.assertEquals(actualDescription, expectedDescription, "Description uyusmadi");
        softAssert.assertEquals(actualID, expectedID, "Id uyusmadi");
        softAssert.assertEquals(actualPrice, expectedPrice, "Price uyusmadi");
        softAssert.assertEquals(actualDefaultMinValue, expectedDefMinValue, "Default min value uyusmadi");
        softAssert.assertEquals(actualDefaultMaxValue, expectedDefMaxValue, "Default max value uyusmadi");

        softAssert.assertAll();
    }

    @And("kullanici country bilgilerini databaseden alir")
    public void kullaniciCountryBilgileriniDatabasedenAlir() {

        String query = "select * from country where id=316802";
        country = DatabaseUtility.getRowMap(query);
        System.out.println("ulke" + country);

    }

    @Then("kullanici country bilgilerini dogrular")
    public void kullaniciCountryBilgileriniDogrular() {

        String actualID = country.get("id").toString();
        System.out.println("actualID = " + actualID);
        String actualName = country.get("name").toString();
        System.out.println("actualName = " + actualName);

        String expectedID = "316802";
        String expectedName = "Metonya";

        softAssert.assertEquals(actualName, expectedName, "Name uyusmadi");
        softAssert.assertEquals(actualID, expectedID, "Id uyusmadi");
        softAssert.assertAll();


    }


}
