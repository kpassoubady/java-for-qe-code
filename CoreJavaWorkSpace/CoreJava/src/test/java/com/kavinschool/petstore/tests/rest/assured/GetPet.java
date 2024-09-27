package com.kavinschool.petstore.tests.rest.assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPet {
    public static void main(String[] args) {
        Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/1");
        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}