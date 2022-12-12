package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;

public class US19_DB {

    Response response;
    String query ;
    List<Map<String,Object>> actualData;
    String Staff;
    String Id;
    int idNum;
    @Given("kullanici connection kurar")
    public void kullaniciConnectionKurar() {
        DatabaseUtility.createConnection();
    }

    @And("kullanici DB ile {string} tablosundaki {string} {int} olan staff'in verilerini alir")
    public void kullaniciDBIleTablosundakiOlanStaffInVerileriniAlir(String staff, String id, int num) {
       Staff=staff; Id=id; idNum=num;
        query="select * from "+staff+" where "+id+"="+num+"";
        DatabaseUtility.executeQuery(query);

    }

    @And("kullanici DB ile staff verilerini okur")
    public void kullaniciDBIleStaffVerileriniOkur() {
        actualData=DatabaseUtility.getQueryResultMap(query); //tum degerleri key value seklinde dondurur
        System.out.println(actualData);




    }

    @Then("Kullanici DB ile alinan datalari dogrular")
    public void kullaniciDBIleAlinanDatalariDogrular() {

        Map<String,Object> expectedData=new HashMap<>();
        expectedData.put("gender","MALE");
        expectedData.put("first_name","Staff");
        expectedData.put("last_name","Steffan");
        expectedData.put("id",Long.valueOf(346151));
        expectedData.put("phone","1223344556");
        expectedData.put("blood_group","Apositive");
        expectedData.put("user_id",Long.valueOf( 301550));
        expectedData.put("created_by","team02");


        Assert.assertEquals(expectedData.get("gender"),actualData.get(0).get("gender"));
        Assert.assertEquals(expectedData.get("first_name"),actualData.get(0).get("first_name"));
        Assert.assertEquals(expectedData.get("last_name"),actualData.get(0).get("last_name"));
        Assert.assertEquals(expectedData.get("id"),actualData.get(0).get("id"));
        Assert.assertEquals(expectedData.get("phone"),actualData.get(0).get("phone"));
        Assert.assertEquals(expectedData.get("blood_group"),actualData.get(0).get("blood_group"));
        Assert.assertEquals(expectedData.get("user_id"),actualData.get(0).get("user_id"));
        Assert.assertEquals(expectedData.get("created_by"),actualData.get(0).get("created_by"));



        response.then().assertThat()
                .body("id",equalTo(346151)
                        ,"phone",equalTo("1223344556")
                        ,"gender",equalTo("MALE")
                        , "createdBy",equalTo("team02")
                        ,"bloodGroup",equalTo("Apositive")
                );





    }
}
