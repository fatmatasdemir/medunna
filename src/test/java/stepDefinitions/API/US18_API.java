package stepDefinitions.API;


import base_url_setup.BaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class US18_API extends BaseUrl {


    @Given("Kullanici {string} id'li doktor verileri icin bir get request gonderir")
    public void kullaniciIdLiDoktorVerileriIcinBirGetRequestGonderir(String arg0) {
     spec.pathParams("1","api","2","physicians","3",304931);

        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiYXRjaDgxIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NzEwNTI1MTd9.D9GwZxrCvctwN4wbrLiEyPajZrQneJhTa8sXVwpj8nK3u3Xdhoafls5dXvNODqnVd9JE-YqFI8ON__owlSDB9w";

        response=given().spec(spec).headers("Authorization","Bearer " + token).
                when().get("/{1}/{2}/{3}");

  //"https://medunna.com/api/physicians/330662"
        response.prettyPrint();
        response.then().assertThat().statusCode(200);

    }




    @Then("Kullanici Doktor bilgilerini dogrular")
    public void kullaniciDoktorBilgileriniDogrular() {
 //1-YOL
      JsonPath json=response.jsonPath();
        Assert.assertEquals(304931,json.getInt("id"));
        Assert.assertEquals("5555555555",json.getString("phone"));
        Assert.assertEquals("MALE",json.getString("gender"));
        Assert.assertEquals("Onegative",json.getString("bloodGroup"));

//2-YOL
       response.then().assertThat()
           .body("id",equalTo(304931)
                   ,"phone",equalTo("5555555555")
                   ,"gender",equalTo("MALE")
                   , "createdBy",equalTo("team02")
                   ,"bloodGroup",equalTo("Onegative")
                   );

    }
}
