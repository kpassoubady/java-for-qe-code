package com.kavinschool.petstore.tests.rest.assured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestGetPetById {

    @Test
    public void testGetPetById() {
        given()
                .pathParam("petId", 1000)
                .when()
                .get("https://petstore.swagger.io/v2/pet/{petId}")
                .then()
                .statusCode(200)
                .body("name", equalTo("doggie"));
    }
}
