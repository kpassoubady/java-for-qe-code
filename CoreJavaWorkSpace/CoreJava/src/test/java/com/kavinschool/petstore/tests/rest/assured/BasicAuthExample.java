package com.kavinschool.petstore.tests.rest.assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicAuthExample {
    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                .auth()
                .preemptive()
                .basic("username", "password") // Replace with actual credentials
                .when()
                .get("https://petstore.swagger.io/v2/pet/10");

        System.out.println("Response Code: " + response.getStatusCode());
    }
}