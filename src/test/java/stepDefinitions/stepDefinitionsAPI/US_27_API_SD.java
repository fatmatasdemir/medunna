package stepDefinitions.stepDefinitionsAPI;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Messages;
import utilities.ConfigReader;
import java.io.IOException;
import java.util.*;
import static baseUrl.MedunnaBaseUrl.medunnaSetup;
import static baseUrl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication2.generateToken2;
import static utilities.ReadTxt.returnReadRoomMessages;

public class US_27_API_SD {

     Response response;
     Messages expectedMesajPojo=new Messages(null,"hakan Dag","hakan1@gmail.com","kursun sonuna geldik","nihayat proje bitiyor");
    List<String>actualSubjectList;

    @Given("Admin endpointi hazirlamak icin API {string} ve messages {string} uzantilarini hazirlar -set the URl-")
    public void admin_endpointi_hazirlamak_icin_apı_ve_messages_uzantilarini_hazirlar_set_the_u_rl(String uzanti1, String uzanti2) {
        medunnaSetup();

          spec.pathParams("1",uzanti1,"2",uzanti2);
    }

    @When("Admin  post gonderir -send the POST- ve yaniti alir -get the Response-")
    public void admin_post_gonderir_send_the_post_ve_yaniti_alir_get_the_response() {

          response=given().spec(spec).headers("Authorization","Bearer "+generateToken2()).body(expectedMesajPojo).
          contentType(ContentType.JSON).when().post("/{1}/{2}");
        //  response=given().headers("Authorization","Bearer "+generateToken2()).body(mesaj).
        // contentType(ContentType.JSON).when().post(ConfigReader.getProperty("mesaj_endpoint"));

    }

    @Then("HTTP status kodunun {int} oldugunu dogrular")
    public void http_status_kodunun_oldugunu_dogrular(Integer statusCode) {

        response.then().statusCode(statusCode);
        response.prettyPrint();
    }

    @Given("Admin send the Get data donderir  ve response alir")
    public void admin_send_the_get_data_donderir_ve_response_alir() {

           response=given().headers("Authorization","Bearer "+generateToken2())
           .when().get(ConfigReader.getProperty("mesaj_endpoint_withsize"));
            response.prettyPrint();
    }


        @When("Gelen responsu Txt dosyasina gonderir")
        public void gelen_responsu_txt_dosyasina_gonderir() throws IOException {


        JsonPath json=response.jsonPath();
        System.out.println("Subject"+json.getString("subject"));

       actualSubjectList=json.getList("findAll{it.subject}.subject");
        System.out.println("actual"+actualSubjectList);

        assertTrue(actualSubjectList.contains("nihayat proje bitiyor"));


       ObjectMapper object=new ObjectMapper();
       List<Map<String,String>> myObjects = object.readValue(response.asString(), new TypeReference<>(){});

        System.out.println("my object"+myObjects);
        assertTrue(myObjects.toString().contains("nihayat proje bitiyor"));

            List<Messages>  messages = response.getBody().as(new TypeRef<>() {
            });
            List<String> messagesSTR=new ArrayList<>();

            for (Messages w:messages
                 ) {
               messagesSTR.add(w.getSubject());
            }

           assertTrue(messagesSTR.contains("nihayat proje bitiyor"));

    }

          @Then("Txt dosyasindaki datayi assert eder")
          public void txt_dosyasindaki_datayi_assert_eder() throws IOException {

              String filename = "src/test/resources/TestData/mesajlistesi.txt";

              List<String> Reader=returnReadRoomMessages(filename); // room subject listesini okur

              //assertTrue(Reader.contains("nihayat proje bitiyor"));
              // room subject listesi txt yazdirir
              //saveMessages(filename, Collections.singletonList(actualSubjectList));

          }


    @And("Json formatla assert eder")
    public void jsonFormatlaAssertEder() {


        response.then().body("name",equalTo("hakan Dag"));

        JsonPath json=response.jsonPath();

        Messages responseJSON=response.as(Messages.class);

        assertEquals(expectedMesajPojo.getEmail(),responseJSON.getEmail());

    }

}
