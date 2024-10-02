package com.kavinschool.pet.store.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class CustomMatcherExample {
    /**
     * Main method to demonstrate a custom matcher example using RestAssured.
     * This method sends a GET request to retrieve a pet by its ID and validates the response.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        given()
                .pathParam("petId", 1) // Set the path parameter for pet ID
                .when()
                .get("https://petstore.swagger.io/v2/pet/{petId}") // Send GET request to retrieve the pet
                .then()
                .statusCode(200) // Validate that the response status code is 200 (OK)
                .body("id", notNullValue()) // Validate that the 'id' field in the response body is not null
                .body("status", anyOf(equalTo("available"), equalTo("pending"))); // Validate that the 'status' field is either 'available' or 'pending'
    }
}
