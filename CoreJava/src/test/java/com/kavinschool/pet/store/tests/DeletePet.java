package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletePet {
    public static void main(String[] args) {
        Response response = RestAssured
                .delete("https://petstore.swagger.io/v2/pet/1000");

        System.out.println("Response Code: " + response.getStatusCode());
    }
}
