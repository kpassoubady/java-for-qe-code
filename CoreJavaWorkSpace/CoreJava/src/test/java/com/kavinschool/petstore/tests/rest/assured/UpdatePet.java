package com.kavinschool.petstore.tests.rest.assured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdatePet {
    public static void main(String[] args) {
        String updateRequestBody = "{ \"id\": 10, \"name\": \"doggie updated\", \"status\": \"sold\" }";

        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(updateRequestBody)
                .when()
                .put("https://petstore.swagger.io/v2/pet");

        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
