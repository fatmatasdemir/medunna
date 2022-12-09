package base_url_setup;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public  class base_url {


        protected Response response;
        protected RequestSpecification spec=

                new RequestSpecBuilder().setBaseUri("https://www.medunna.com").build();

    }
