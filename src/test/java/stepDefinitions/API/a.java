package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import pojos.Physician;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class a {
/*


    Response response;
    String username="admin-Nazli";
    String password="Nisan2663.";
    Physician expectedData;
    Physician actualData;
    SoftAssert softAssert=new SoftAssert();
    @Given("kullanici physicianslar icin Get request yapar")
    public void kullanici_physicianslar_icin_get_request_yapar() {
        response=given().headers("Authorization",
                "Bearer "+ generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("physicianGet"));
        response.prettyPrint();
    }
    @When("kullanici gelen physician datayi desarialize yapar")
    public void kullanici_gelen_physician_datayi_desarialize_yapar() throws IOException {
        expectedData=new Physician("admin-nazli","2022-08-08T17:34:18.818221Z",164031,"DoktorNazli","k","1980-08-09T21:00:00Z","555-555-5555","MALE","Apositive");
        ObjectMapper obj=new ObjectMapper();
        actualData=obj.readValue(response.asString(), Physician.class);
    }


    @Then("kullanici physician datasini validate eder")
    public void kullanici_physician_datasini_validate_eder() {
        softAssert.assertEquals(actualData.getCreatedBy(),expectedData.getCreatedBy());
        softAssert.assertEquals(actualData.getCreatedDate(),expectedData.getCreatedDate());
        softAssert.assertEquals(actualData.getId(),expectedData.getId());
        softAssert.assertEquals(actualData.getFirstName(),expectedData.getFirstName());
        softAssert.assertEquals(actualData.getLastName(),expectedData.getLastName());
        softAssert.assertEquals(actualData.getBirthDate(),expectedData.getBirthDate());
        softAssert.assertEquals(actualData.getGender(),expectedData.getGender());
        softAssert.assertEquals(actualData.getBloodGroup(),expectedData.getBloodGroup());
        softAssert.assertEquals(actualData.getPhone(),expectedData.getPhone());
    }
*/
}
