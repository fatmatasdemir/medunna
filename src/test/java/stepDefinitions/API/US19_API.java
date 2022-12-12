package stepDefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US19_API {

    Response response;
    @Given("Kullanici {string} id'li Staff verileri icin bir get request gonderir")
    public void kullaniciIdLiStaffVerileriIcinBirGetRequestGonderir(String arg0) {
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXRjaDgxIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NzA4NTY4Njd9.gYUu4jWAl94wAJY67_cqYlsqcQcscV2dcwX-r6w1_WKRP27RipheaSicOmtxWk8ZiPizXgMBbiXS_1ImYlvuOA";
        response=given().contentType(ContentType.JSON).headers("Authorization","Bearer " + token).
                when().get("https://medunna.com/api/staff/346151");
        response.prettyPrint();

    }

    @Then("Kullanici  Status kodunu oldugunu dogrulamalidir")
    public void kullaniciStatusKodunuOldugunuDogrulamalidir() {

        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());
    }





    @Then("Kullanici Staff bilgilerini dogrular")
    public void kullaniciStaffBilgileriniDogrular() {
        //1-YOL
        JsonPath json=response.jsonPath();
        Assert.assertEquals(346151,json.getInt("id"));
        Assert.assertEquals("1223344556",json.getString("phone"));
        Assert.assertEquals("MALE",json.getString("gender"));
        Assert.assertEquals( "Apositive",json.getString("bloodGroup"));

//2-YOL
        response.then().assertThat()
                .body("id",equalTo(346151)
                        ,"phone",equalTo("1223344556")
                        ,"gender",equalTo("MALE")
                        , "createdBy",equalTo("team02")
                        ,"bloodGroup",equalTo("Apositive")
                );


    }


}
