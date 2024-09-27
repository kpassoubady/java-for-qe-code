package com.kavinschool.petstore.tests.rest.assured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ValidateSchemaExample {

    public static final String PET_SCHEMA_FILE = "pet-schema.json";

    public static void main(String[] args) {
        RestAssured.baseURI = "https://petstore3.swagger.io/api/v3";

        Response response = given()
                .when()
                .get("/pet/1");

        // Validate against the schema
        response
                .then()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath(PET_SCHEMA_FILE)); // Validate response against JSON schema
    }
}
