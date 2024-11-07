package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicAuthExample {
    public static void main(String[] args) {
        Response response = RestAssured
                .given()
                    .auth()
                    .preemptive()
                    .basic("username", "password") // Replace it with actual credentials
                .when()
                    .get("https://petstore.swagger.io/v2/pet/10");

        System.out.println("Response Code: " + response.getStatusCode());
    }
}
