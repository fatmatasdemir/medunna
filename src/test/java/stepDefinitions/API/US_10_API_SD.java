package stepDefinitions.API;

import base_url_setup.BaseUrl;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import utilities.ConfigReader;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;


public class US_10_API_SD extends BaseUrl {



        @Given("Kullanici gerekli olan parametre yolunu hazirlar  path params api {string} and {string}")
        public void kullaniciGerekliOlanParametreYolunuHazirlarPathParamsApiAnd(String uzanti1, String uzanti2) {
            spec=spec.pathParams("1",uzanti1,"2",uzanti2);

        }

        @Then("Kullanici  GET Request to the URL gonderir")
        public void kullaniciGETRequestToTheURLGonderir() {
    //  response=given().spec(spec).headers("Authorization","Bearer "+generateToken2()).when().get("/{1}/{2}");
            response=given().headers("Authorization","Bearer "+generateToken()).when()
            .get(ConfigReader.getProperty("api_appointments"));
          //  response.prettyPrint();

        }

    @Then("HTTP Status Code should be {int} olmali medunna")
    public void http_status_code_should_be_olmali_jsonplaceholder(Integer int1) {


    }


    @And("Doktor kendi Id numarasina ait {int} nolu randevularini dogrular")
    public void doktorKendiIdNumarasinaAitNoluRandevulariniDogrular(int arg0) {


        List<Integer> expectedIDList=new ArrayList<>();
        expectedIDList.add(10404);
        expectedIDList.add(11448);
        expectedIDList.add(277947);
        expectedIDList.add(9173);
        expectedIDList.add(10420);
        expectedIDList.add(116886);
        expectedIDList.add(11893);

        System.out.println(expectedIDList);



        ArrayList<Object> actualDataList=response.as(ArrayList.class);
        //System.out.println(actualDataList);

        JsonPath json=response.jsonPath();

        System.out.println(json.getString("id"));
         System.out.println(json);

        List<Integer>actualList=json.getList("findAll{it.id}.id");

        System.out.println("actualList"+actualList);
        //assertEquals(10420,json.//)


        assertTrue(actualList.contains(10404));
        assertTrue(actualList.contains(11448));
        assertTrue(actualList.contains(10420));
        assertTrue(actualList.contains(9173));
        assertTrue(actualList.contains(11893));
      //  assertTrue(actualList.contains(277947));
        //assertTrue(actualList.contains(116886));

        }

        }





