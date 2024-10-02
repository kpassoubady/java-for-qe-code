package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

public class UploadImageExample {
    public static void main(String[] args) {
        File imageFile = new File("src/test/resources/dog.png");

        Response response = RestAssured
                .given()
                .contentType(ContentType.MULTIPART)
                .multiPart("file", imageFile)
                .when()
                .post("https://petstore.swagger.io/v2/pet/1/uploadImage");

        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
