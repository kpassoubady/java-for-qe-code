package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiKeyAuthExample {
    public static void main(String[] args) {
        // Set the API key
        String apiKey = "special-key";

        // Send a GET request with the API key in the header
        Response response = RestAssured
            .given()
                .header("api_key", apiKey) // Pass the API key in the header
            .when()
                .get("https://petstore.swagger.io/v2/pet/1000");

        // Print the response details
        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
