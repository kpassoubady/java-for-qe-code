package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ContentNegotiationExample {
    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                .accept(ContentType.JSON) // Specify accepted response type
                .when()
                .get("https://petstore3.swagger.io/api/v3/pet/1");

        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
