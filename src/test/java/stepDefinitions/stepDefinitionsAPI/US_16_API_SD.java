package stepDefinitions.stepDefinitionsAPI;

import baseUrl.BaseUrl;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import pojos.RoomPojoPost;
import pojos.RoomPojoPut;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication1.generateToken1;


public class US_16_API_SD extends BaseUrl {

    ObjectMapper obj;

    RoomPojoPost expectedRoomPost;
    RoomPojoPost actualRoomPost;

    RoomPojoPut expectedUpdateRoom;
    RoomPojoPut actualUpdateRoom;


    @And("endpointi api {string} ve rooms {string} olan uzantiyi ekler")
    public void uzantisiApiVeRoomsOlanUzantiyiEkler(String uzanti1, String uzanti2) {
        spec=spec.pathParams("1",uzanti1,"2",uzanti2);

    }
    @Then("bir room olusturur oda tipi {string} oda fiyati {int} oda numarasi {int} description {string}post")
    public void birRoomOlustururOdaTipiOdaFiyatiOdaNumarasiDescriptionPost(String odatipi, int odafiyati, int odanumarasi, String description) {
        expectedRoomPost=new RoomPojoPost(description,odafiyati,odanumarasi,odatipi,true);

        response=given().spec(spec).headers("Authorization","Bearer "+generateToken1()).body(expectedRoomPost).
                contentType(ContentType.JSON).when().post("/{1}/{2}");

        response.prettyPrint();
        actualRoomPost = response.as(RoomPojoPost.class);
        assertEquals(expectedRoomPost.getRoomNumber(),actualRoomPost.getRoomNumber());
        assertEquals(expectedRoomPost.getRoomType(),actualRoomPost.getRoomType());



    }

    @And("status kodunun {int} oldugunu dogrular")
    public void statusKodununOldugunuDogrular(int statusCode) {
        assertEquals(statusCode,response.getStatusCode());

    }

    @And("Odayi okur")
    public void odayiOkur() throws IOException {

          obj =new ObjectMapper();

        actualRoomPost=obj.readValue(response.asString(), RoomPojoPost.class);
        System.out.println(actualRoomPost);

    }

    @Then("Oda olusturdugunu gorur")
    public void odaOlusturdugunuGorur() {

        // assertTrue(actualRoomPost.getRoomType().contains("DELUXE"));
        // assertEquals(5542,actualRoomPost.getRoomNumber());

    }


    @Then("olusturulan odada id nosu {int} olan oda tipini {string} oda fiyatini {int} , oda numarasini {int} descriptionu {string}  Update eder")
    public void olusturulanOdadaOdaTipiniOdaFiyatiniOdaNumarasiniDescriptionuUpdateEder(int id ,String roomType, int price, int roomNumber, String description) {

        expectedUpdateRoom=new RoomPojoPut(null,id,price,roomNumber,roomType,true);

         response=given().spec(spec).headers("Authorization","Bearer "+generateToken1()).
                contentType(ContentType.JSON).accept(ContentType.JSON).body(expectedUpdateRoom).when().put("/{1}/{2}");

    }

    @And("Update yi assert eder")
    public void updateYiAssertEder() throws IOException {

        actualUpdateRoom =response.as(RoomPojoPut.class);

        System.out.println(actualUpdateRoom);


        assertEquals(200,response.getStatusCode());

        obj =new ObjectMapper();

        actualUpdateRoom=obj.readValue(response.asString(),RoomPojoPut.class);

        assertEquals(4533,actualUpdateRoom.getRoomNumber());

    }


    @And("endpointi api {string} ve rooms {string} ve id si {int} olan uzantiyi ekler")
    public void uzantisiApiVeRoomsVeIdSiOlanUzantiyiEkler(String uzanti1, String uzanti2, int uzanti3) {

        spec=spec.pathParams("1",uzanti1,"2",uzanti2,"3",uzanti3);

    }

    @And("Admin kayitli odayi Delete eder")
    public void adminKayitliOdayiDeleteEder() {

        response=given().spec(spec).
        headers("Authorization","Bearer "+generateToken1()).when().delete("/{1}/{2}/{3}");



    }

    @And("Deleteyi assert eder")
    public void deleteyiAssertEder() {
        assertEquals(204,response.getStatusCode());
        // 204 No content
    }



}
