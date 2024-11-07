package com.kavinschool.pet.store.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ValidateSchemaExample {


    public static void main(String[] args) {
        RestAssured.baseURI = RestApiConstants.BASE_URI;

        Response response = given()
                .when()
                    .get("pet/2020");

        // Validate against the schema
        response
                .then()
                    .statusCode(200)
                    .body(matchesJsonSchemaInClasspath(RestApiConstants.PET_SCHEMA_FILE)); // Validate response against JSON schema
    }
}
