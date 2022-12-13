/*
package stepDefinitions.API;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.gherkin.Parser;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.RoomPostBatch81;
import java.util.HashMap;
import static base_url_setup.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication2.generateToken;
public class RoomOlusturmaSteps {
    Response response;
    RoomPostBatch81 room = new RoomPostBatch81();
    @Given("user sends a post request for rooms data")
    public void user_sends_a_post_request_for_rooms_data() {
        spec.pathParams("bir", "api", "iki", "rooms");
        //Room data olusturma
        room.setRoomNumber(546743);
        room.setRoomType("DELUXE");
        room.setDescription("Yeni bir room generation 7");
        room.setPrice(600);
        room.setStatus(true);
        response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(room).when().post("/{bir}/{iki}");
    }
    @Given("user gets the room data and validates")
    public void user_gets_the_room_data_and_validates() throws Exception {
        response.then().assertThat().statusCode(201);
        //Validation 1.
        response.then().assertThat().
                body("roomNumber", equalTo(room.getRoomNumber())).
                body("roomType", equalTo(room.getRoomType())).
                body("price", equalTo(room.getPrice())).
                body("status", equalTo(room.isStatus()));
        //validation 2.
        JsonPath json = response.jsonPath();
        assertEquals(json.getInt("roomNumber"), room.getRoomNumber());
        assertEquals(json.getString("roomType"), room.getRoomType());
        assertEquals(json.getInt("price"), room.getPrice());
        assertEquals(json.getBoolean("status"), room.isStatus());
        assertEquals(json.getString("description"), room.getDescription());
        //Validation 3.
        HashMap<String, Object> actualData = response.as(HashMap.class);
        assertEquals(actualData.get("roomNumber"), room.getRoomNumber());
        assertEquals(actualData.get("roomType"), room.getRoomType());
        assertEquals(actualData.get("price"), room.getPrice());
        assertEquals(actualData.get("status"), room.isStatus());
        assertEquals(actualData.get("description"), room.getDescription());
        //Validation 4.
        RoomPostBatch81 actualRoom = response.as(RoomPostBatch81.class);
        assertEquals(actualRoom.getDescription(), room.getDescription());
        assertEquals(actualRoom.getRoomType(), room.getRoomType());
        assertEquals(actualRoom.getPrice(), room.getPrice());
        assertEquals(actualRoom.isStatus(), room.isStatus());
        assertEquals(actualRoom.getRoomNumber(), room.getRoomNumber());
        //Validation 5.
        ObjectMapper obj = new ObjectMapper();
        RoomPostBatch81 actualDataWithObjectMapper = obj.readValue(response.asString(), RoomPostBatch81.class);
        assertEquals(actualDataWithObjectMapper.getDescription(), room.getDescription());
        assertEquals(actualDataWithObjectMapper.getRoomType(), room.getRoomType());
        assertEquals(actualDataWithObjectMapper.getPrice(), room.getPrice());
        assertEquals(actualDataWithObjectMapper.isStatus(), room.isStatus());
        assertEquals(actualDataWithObjectMapper.getRoomNumber(), room.getRoomNumber());
        //Validation 6.
        Gson gson = new Gson();
        RoomPostBatch81 actualDataWithGson = gson.fromJson(response.asString(), RoomPostBatch81.class);
        assertEquals(actualDataWithGson.getDescription(), room.getDescription());
        assertEquals(actualDataWithGson.getRoomType(), room.getRoomType());
        assertEquals(actualDataWithGson.getPrice(), room.getPrice());
        assertEquals(actualDataWithGson.isStatus(), room.isStatus());
        assertEquals(actualDataWithGson.getRoomNumber(), room.getRoomNumber());
    }
}

 */