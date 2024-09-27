package com.kavinschool.petstore.tests.rest.assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletePet {
    public static void main(String[] args) {
        Response response = RestAssured
                .delete("https://petstore.swagger.io/v2/pet/10");

        System.out.println("Response Code: " + response.getStatusCode());
    }
}
