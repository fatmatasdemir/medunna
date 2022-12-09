package stepDefinitions.API;

import base_url_setup.base_url;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class US18API  extends base_url {


    @Given("Kullanici {string} id'li doktor verileri icin bir get request gonderir")
    public void kullaniciIdLiDoktorVerileriIcinBirGetRequestGonderir(String arg0) {
     spec.pathParams("1","api","2","physicians","3",330662);

        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMDIiLCJhdXRoIjoiUk9MRV9BRE1JTiIsImV4cCI6MTY3MDYwODQ5NX0.VWGISk8mpB5VvnaANgSBuVYyp4IfkC7xPSQTpMV0UFNOufOutGSrZtexHQwRdKep8TbS3FYseMLUcoNS3ZbBGw";

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
        Assert.assertEquals(330662,json.getInt("id"));
        Assert.assertEquals("123-456-7890",json.getString("phone"));
        Assert.assertEquals("FEMALE",json.getString("gender"));
        Assert.assertEquals("Apositive",json.getString("bloodGroup"));

//2-YOL
       response.then().assertThat()
           .body("id",equalTo(330662)
                   ,"phone",equalTo("123-456-7890")
                   ,"gender",equalTo("FEMALE")
                   ,"phone",equalTo("123-456-7890")
                   ,"bloodGroup",equalTo("Apositive")
                   );

    }
}
