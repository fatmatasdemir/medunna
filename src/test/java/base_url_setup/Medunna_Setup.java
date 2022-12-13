package base_url_setup;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Medunna_Setup {

    protected RequestSpecification spec=

            new RequestSpecBuilder().setBaseUri("https://www.medunna.com").build();
}


