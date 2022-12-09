package stepDefinitions.API;


import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class US005API  {

    Response response;
    SoftAssert softAssert=new SoftAssert();
    Map<String, Object> randevuBilgileri;
    @Given("Kullanici id numarali hastanin tum bilgilerini get request gonderir")
    public void kullaniciIdNumaraliHastaninTumBilgileriniGetRequestGonderir() {

        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMDIiLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY3MDY3Mzg2MX0.06qvs1CDFbFSMiRHFtnHDSy-rw8SyNuPfSaM0kYCEcss3eFeiDJrvJR3t70BsbCIPb0fCDP-Sp3LMENfM-R-fw";
        response=given().contentType(ContentType.JSON).headers("Authorization","Bearer " + token).
                when().get("https://medunna.com/api/appointments/353476");
        response.prettyPrint();

    }

    @Then("Kullanici  status kodunu oldugunu dogrulamalidir")
    public void kullaniciStatusKodunuOldugunuDogrulamalidir() {

        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());
    }

    @And("Kullanici bilgilerin dogrulugunu kontrol eder")
    public void kullaniciBilgilerinDogrulugunuKontrolEder() {

        JsonPath json=response.jsonPath();
        Assert.assertEquals(353476,json.getInt("id"));
        Assert.assertEquals("anonymousUser",json.getString( "createdBy"));
        Assert.assertEquals("2022-11-28T17:20:30.746037Z",json.getString(    "createdDate"));
        Assert.assertEquals("PENDING",json.getString("status"));






    }
}
