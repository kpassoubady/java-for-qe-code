package com.kavinschool.petstore.tests.rest.assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatePet {
    public static void main(String[] args) {
        String requestBody = "{ \"id\": 1000, \"name\": \"doggie\", \"status\": \"available\" }";

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://petstore.swagger.io/v2/pet");

        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
