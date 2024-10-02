package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CookieExample {
    public static void main(String[] args) {
        // Setting a cookie
        Response response = RestAssured
                .given()
                .cookie("session_id", "123456")
                .when()
                .get("https://petstore.swagger.io/v2/pet/1");

        System.out.println("Response Code: " + response.getStatusCode());
       // System.out.println("Response Cookies: " + response.getDetailedCookie("session_id").getValue());
    }
}
