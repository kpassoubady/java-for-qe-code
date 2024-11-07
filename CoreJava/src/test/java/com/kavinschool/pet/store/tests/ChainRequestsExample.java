package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.equalTo;

public class ChainRequestsExample {
    public static void main(String[] args) {
        String requestBody = """
                { "id": 100, "name": "doggie", "status": "available" }
                """;

        // Create a Pet
        RestAssured
                .given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post("https://petstore.swagger.io/v2/pet");

        // Retrieve the Pet
        RestAssured
                .given()
                    .pathParam("petId", 100)
                .when()
                    .get("https://petstore.swagger.io/v2/pet/{petId}")
                .then()
                    .statusCode(200)
                    .body("name", equalTo("doggie"));
    }
}
