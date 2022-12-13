package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication1 {

    public static String generateToken1() {

        RequestSpecification spec=new RequestSpecBuilder().setBaseUri("https://medunna.com").build();

        Map<String, Object> data = new HashMap<>();
        data.put("username","Batch81");
        data.put("password","Batch81+");
        data.put("rememberme",true);
      //  data.put("username","medunnateam71@gmail.com");
       // data.put("password","MedunnaT71");
       // data.put("rememberme",true);




        spec.pathParams("first", "api", "second", "authenticate");
        Response response =given().spec(spec).contentType(ContentType.JSON).body(data).when().post("/{first}/{second}");

        //response.prettyPrint();

        JsonPath json=response.jsonPath();
        //   System.out.println(json.getString("id_token"));

        return json.getString("id_token");

    }

    public static void main(String[] args) {
        System.out.println(generateToken1());
    }
}
