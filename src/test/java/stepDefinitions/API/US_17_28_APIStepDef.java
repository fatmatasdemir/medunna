package stepDefinitions.API;

import base_url_setup.Medunna_Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.TestItem;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;
import static utilities.ObjectMapperUtils.convertJsonToJava;

public class US_17_28_APIStepDef extends Medunna_Setup {
    TestItem   testItem ;
    Response response;
    TestItem expectedData;
    Faker faker = new Faker();
    @Given("user sends a post request for test items")
    public void userSendsAPostRequestForTestItems() {

        spec.pathParams("first", "api","second","c-test-items");

        String nameTest= faker.name().name();

        testItem= new TestItem("100","50","test",nameTest,50);


        System.out.println(testItem);

        response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(testItem).when().post("/{first}/{second}");
    }


    @And("user gets the test items data and validates")
    public void userGetsTheTestItemsDataAndValidates() {

        response.then().assertThat().statusCode(201);

        response.then().assertThat().
                body("price", equalTo(testItem.getPrice())).
                body("name",equalTo(testItem.getName()));

        JsonPath json = response.jsonPath();

        assertEquals(json.getString("name"), testItem.getName());
        assertEquals(json.getString("defaultValMin"), testItem.getDefaultValMin());
        assertEquals(json.getString("defaultValMax"), testItem.getDefaultValMax());
    }


    @Given("send a request")
    public void sendARequest() {

        spec.pathParams("first", "api","second","c-test-items","third",387227);
     expectedData = new TestItem("50","10","hebele","Hebele",100);
        System.out.println("expecteed data: " + expectedData);

        response =given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("verify that the status code is {int} and  the response body in an approprate schema")
    public void verifyThatTheStatusCodeIsAndTheResponseBodyInAnApproprateSchema(int arg0) {
     TestItem actualData =response.as(TestItem.class);
        System.out.println("actualData: " + actualData);

        assertEquals(200,response.statusCode());

        assertEquals(expectedData.getName(),actualData.getName());
        assertEquals(expectedData.getDefaultValMax(),actualData.getDefaultValMax());
        assertEquals(expectedData.getDefaultValMin(),actualData.getDefaultValMin());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getDescription(),actualData.getDescription());


    }

    @Given("send a request with invalid token")
    public void sendARequestWithInvalidToken() {
        spec.pathParams("first", "api","second","c-test-items","third",387227);
        expectedData = new TestItem("Unauthorized",401,"Full authentication is required to access this resource","error.http.401");
        System.out.println("expecteed data: " + expectedData);

        response =given().headers("Authorization", "Bearer "
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).when().get("/{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("verify status code {int} and response body is as expected")
    public void verifyStatusCodeAndResponseBodyIsAsExpected(int arg0) {
        TestItem actualData =response.as(TestItem.class);
        System.out.println("actualData: " + actualData);

        assertEquals(401,response.statusCode());

        assertEquals(expectedData.getTitle(),actualData.getTitle());
        assertEquals(expectedData.getStatus(),actualData.getStatus());
        assertEquals(expectedData.getDetail(),actualData.getDetail());
        assertEquals(expectedData.getMessage(),actualData.getMessage());


    }

    @Given("send a request for delete")
    public void sendARequestForDelete() {
        spec.pathParams("first", "api","second","c-test-items");

        String testName= faker.name().name();

        testItem= new TestItem("100","50","test",testName,10);


        System.out.println(testItem);


        response = given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(testItem).when().post("/{first}/{second}");

        response.prettyPrint();
        JsonPath jsonPath =response.jsonPath();
        int id =jsonPath.get("id");
        System.out.println(id);

        spec.pathParams("first", "api","second","c-test-items","third",id);

     response=given().headers("Authorization", "Bearer " + generateToken()
             ,  "Content-Type", ContentType.JSON,
             "Accept", ContentType.JSON
     ).spec(spec).contentType(ContentType.JSON).when().delete("/{first}/{second}/{third}");



        
    }

    @Then("verify status code {int}")
    public void verifyStatusCode(int arg0) {
        System.out.println(response.getStatusCode());
        assertEquals(204,response.getStatusCode());
    }

    @Given("send a request with a request body")
    public void sendARequestWithARequestBody() {
        /*{

    "id": 398477,
    "name": "put",
    "description": "putAction",
    "price": 10,
    "defaultValMin": "100",
    "defaultValMax": "10"
}*/
        spec.pathParams("first", "api","second","c-test-items","third",398477);

     testItem= new TestItem("100","10","putAction","put",10);
     expectedData =new TestItem("100","10","putAction","put",10);

        response=given().headers("Authorization", "Bearer " + generateToken()
                ,  "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON
        ).spec(spec).contentType(ContentType.JSON).body(testItem).when().put("/{first}/{second}/{third}");
        TestItem actualData = convertJsonToJava(response.asString(),TestItem.class);
        System.out.println("actualData = " + actualData);

    }

    @Then("verify status code {int} and response body is as expected for put")
    public void verifyStatusCodeAndResponseBodyIsAsExpectedForPut(int arg0) {
        assertEquals(200,response.statusCode());
    }
}
