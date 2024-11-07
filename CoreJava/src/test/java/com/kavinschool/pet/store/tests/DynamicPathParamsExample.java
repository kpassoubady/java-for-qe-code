package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DynamicPathParamsExample {
    public static void main(String[] args) {
        int petId = 9999; // This could be dynamically set

        Response response = RestAssured
                .given()
                    .pathParam("petId", petId)
                .when()
                    .get("https://petstore.swagger.io/v2/pet/{petId}");

        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Pet Name: " + response.jsonPath().getString("name"));
    }
}
