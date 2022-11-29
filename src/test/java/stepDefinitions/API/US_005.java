package stepDefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.TestCase;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_005 {
    Response response;
    @Given("Kullanici id numarali hastanin tum bilgilerini get request gonderir")
    public void kullaniciIdNumaraliHastaninTumBilgileriniGetRequestGonderir() {

    }

    @Then("Kullanici  status kodunu oldugunu dogrulamalidir")
    public void kullaniciStatusKodunuOldugunuDogrulamalidir() {
        assertEquals(200,response.statusCode());
    }

    @And("Kullanici bilgilerin dogrulugunu kontrol eder")
    public void kullaniciBilgilerinDogrulugunuKontrolEder() {


    }
}
