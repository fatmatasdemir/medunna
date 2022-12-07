package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import pojos.Physician1;
import utilities.Authentication;

import static io.restassured.RestAssured.given;

public class US18API {

    Response response;
    Physician1 physcian1=new Physician1();
    Physician1 expectedData;
    Physician1 actualData;
    SoftAssert softAssert=new SoftAssert();
    @Given("Kullanici {string} id'li doktor verileri icin bir get request gonderir")
    public void kullaniciIdLiDoktorVerileriIcinBirGetRequestGonderir(String id) {
        String endpoint="https://medunna.com/api/physicians/";
        response = given().
                headers(
                        "Authorization",
                        "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                when().
                get(endpoint + "/" + id).
                then().
                extract().
                response();

        response.prettyPrint();

        /*
        2.yol
         response=given().headers("Authorization",
                "Bearer "+ generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigReader.getProperty("physicianGet"));
      response.prettyPrint();
         */



    }

    @When("status kodunun {string}oldugunu dogrular")
    public void statusKodununOldugunuDogrular(String arg0) {
        response.then().
                assertThat().
                statusCode(200);
    }

    @Then("kullanici physician datasini dogrular")
    public void kullaniciPhysicianDatasiniDogrular() {
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
}
