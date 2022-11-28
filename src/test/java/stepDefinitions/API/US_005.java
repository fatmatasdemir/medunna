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
        String token =" eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXRjaDgxIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2Njk5MTg1MTh9.ksToAlcBFn8IrTBQ9tvinLOK3eygFc_0PqqVJwTfo4tmApVvu9uiYB-LSUz0ku7JN6An64x9K0QnhzFQyN1sjw ";

        response=given().contentType(ContentType.JSON).headers("Authorization","Bearer " + token).
                when().get("https://medunna.com/api/appointments/353476");

    }

    @Then("Kullanici  status kodunu oldugunu dogrulamalidir")
    public void kullaniciStatusKodunuOldugunuDogrulamalidir() {
        assertEquals(200,response.statusCode());
    }

    @And("Kullanici bilgilerin dogrulugunu kontrol eder")
    public void kullaniciBilgilerinDogrulugunuKontrolEder() {
     /*   countryilk countryilk = new countryilk(1201,"Türkiye");
        cstatepojo cstatepojo = new cstatepojo(43520,"Istanbul",countryilk);
        country2 country2 = new country2(1201,"Türkiye");
        userpojo userpojo = new userpojo("anonymousUser","2022-11-15T21:20:58.397215Z",301530,"hastateam01","Hasta","Team01","hastateam01@gmail.com",true,"en",null,null,"500-10-5002");
        patientpojo patientpojo = new patientpojo("hastateam01","2022-11-16T11:05:14.475578Z",302408,"Hasta","Team01","2020-10-28T17:30:00Z","5555555555","MALE","ABpositive","Turkei","hastateam01@gmail.com","",userpojo,null,country2,cstatepojo);
        cretedpojo expectedData = new cretedpojo("hastateam01","2022-11-25T10:20:40.204531Z",337001,"2022-12-01T00:00:00Z","2022-12-01T01:00:00Z","UNAPPROVED",null,null,null,null,null,null,patientpojo,null);
        cretedpojo actualData= ObjectMapperUtils.convertJsonToJava(response.asString(),cretedpojo.class);
        System.out.println(expectedData);

        System.out.println("actualData = " + actualData);


        TestCase.assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        TestCase.assertEquals(expectedData.getCreatedDate(),actualData.getCreatedDate());
        TestCase.assertEquals(expectedData.getId(),actualData.getId());
        TestCase.assertEquals(expectedData.getStartDate(),actualData.getStartDate());
        TestCase.assertEquals(expectedData.getStatus(),actualData.getStatus());
        TestCase.assertEquals(expectedData.getPhysician(),actualData.getPhysician());

*/

    }
}
