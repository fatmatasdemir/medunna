package stepDefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DatabaseUtility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class US18_DB {


    String query ;
    List<Map<String,Object>> actualData;
    String Physician;
    String Id;
    int idNum;

    @Given("kullanici DB ile Medunna veri tabanina baglanir")
    public void kullaniciDBIleMedunnaVeriTabaninaBaglanir() {

        DatabaseUtility.createConnection();
    }

    @And("kullanici DB ile {string} tablosundaki {string} {int} olan doktorun verilerini alir")
    public void kullaniciDBIleTablosundakiOlanDoktorunVerileriniAlir(String physician, String id, int num) {
        Physician=physician; Id=id; idNum=num;
        query="select * from "+physician+" where "+id+"="+num+"";
        DatabaseUtility.executeQuery(query);


    }

    @And("kullanici DB ile doktorun verileri okur")
    public void kullaniciDBIleDoktorunVerileriOkur() {
        actualData=DatabaseUtility.getQueryResultMap(query); //tum degerleri key value seklinde dondurur
        System.out.println(actualData);


    }

    @Then("kullanici DB ile alinan datalari dogrular")
    public void kullaniciDBIleAlinanDatalariDogrular() {
        Map<String,Object> expectedData=new HashMap<>();
        expectedData.put("gender","MALE");
        expectedData.put("first_name","Doktor");
        expectedData.put("last_name","Sadrazam");
        expectedData.put("id",Long.valueOf(304931));
        expectedData.put("phone","5555555555");
        expectedData.put("blood_group","Onegative");
        expectedData.put("speciality", "INTERNAL_MEDICINE");
        expectedData.put("user_id",Long.valueOf( 305441));
        expectedData.put("created_by","team02");


        Assert.assertEquals(expectedData.get("gender"),actualData.get(0).get("gender"));
        Assert.assertEquals(expectedData.get("first_name"),actualData.get(0).get("first_name"));
        Assert.assertEquals(expectedData.get("last_name"),actualData.get(0).get("last_name"));
        Assert.assertEquals(expectedData.get("id"),actualData.get(0).get("id"));
        Assert.assertEquals(expectedData.get("phone"),actualData.get(0).get("phone"));
        Assert.assertEquals(expectedData.get("blood_group"),actualData.get(0).get("blood_group"));
        Assert.assertEquals(expectedData.get("speciality"),actualData.get(0).get("speciality"));
        Assert.assertEquals(expectedData.get("user_id"),actualData.get(0).get("user_id"));
        Assert.assertEquals(expectedData.get("created_by"),actualData.get(0).get("created_by"));





    }
}
