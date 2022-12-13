package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public  class BaseUrl {


        protected Response response;
        protected RequestSpecification spec=

                new RequestSpecBuilder().setBaseUri("https://www.medunna.com").build();
    }


