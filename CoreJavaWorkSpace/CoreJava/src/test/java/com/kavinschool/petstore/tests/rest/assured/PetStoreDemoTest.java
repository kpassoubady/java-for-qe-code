package com.kavinschool.petstore.tests.rest.assured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;


public class PetStoreDemoTest {

    public static final String PET_STORE_URI="https://petstore.swagger.io/v2/pet/100";

    @Test
    public void  testGetPet() {
        System.out.println("PetStoreDemoTest.testGetPet");
        given().
            header("accept","application/json").
        when().
            get(PET_STORE_URI).
        then().
            statusCode(200).
            body("id", equalTo(100)).
            body("category.name",equalTo("kangs")).
            body("tags[0].name",equalTo("kangs"));

    }
}
