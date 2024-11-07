package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPet {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/10");
        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
