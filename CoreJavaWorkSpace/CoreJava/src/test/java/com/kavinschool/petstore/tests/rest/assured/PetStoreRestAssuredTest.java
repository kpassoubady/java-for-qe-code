/*
 * Author: Kangeyan Passoubady
 * 1.0
 */
package com.kavinschool.petstore.tests.rest.assured;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import com.kavinschool.corejava.framework.utils.JsonUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.parsing.Parser.JSON;
import static org.hamcrest.Matchers.equalTo;

/**
 * The Class PetStoreUniRestTest.
 */
public class PetStoreRestAssuredTest {

    private final static String BASE_URI = "https://petstore.swagger.io/v2";

    /**
     * The Constant PET_REST_URI.
     */
    private final static String PET_REST_URI = BASE_URI + "/pet/";

    /**
     * The Constant PET_INV_STORE_URI.
     */
    private final static String PET_INV_STORE_URI = BASE_URI + "/store/inventory";

    /**
     * The Constant PET_INV_FIND_STATUS.
     */
    private final static String PET_INV_FIND_STATUS = BASE_URI + "/pet/findByStatus";

    /**
     * The Constant JSON_POST_FILE.
     */
    private final static String JSON_POST_FILE = "new_pet.json";

    /**
     * The Constant JSON_PUT_FILE.
     */
    private final static String JSON_PUT_FILE = "new_pet.json";

    /**
     * The Constant API_KEY.
     */
    private final static String API_KEY = "api_key";

    /**
     * The Constant API_VAL.
     */
    private final static String API_VAL = "special_key";

    /**
     * The Constant RANDOM.
     */
    private final static long RANDOM = PetStoreRestAssuredTest.getRandom();

    @Test
    public void postNewPetUsingJsonFile() throws IOException {
        //String jsonText = JsonUtil.readJsonFromUrl(getClass().getClassLoader().getResourceAsStream(JSON_POST_FILE));
        String jsonText = JsonUtil.readJsonFromUrl(Thread.currentThread().getContextClassLoader().getResourceAsStream(JSON_POST_FILE));

        System.out.println("Initial JsonText:" + jsonText);

        jsonText = String.format(jsonText, RANDOM, "cow_" + RANDOM);
        System.out.println("Converted JsonText:" + jsonText);

        RestAssured.defaultParser = JSON;
        RestAssured.given()
                .header(API_KEY, API_VAL).accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(jsonText)
                .when()
                .post(PET_REST_URI)
                .then()
                .statusCode(200)
                .body("id", equalTo(RANDOM))
                .body("status", equalTo("available"));
        //.content("name", containsString("cow_"))
        //.content("category.name", containsString("cow_"));
    }

    /**
     * Pet store get find by status test.
     */
    @Test(dependsOnMethods = {"postNewPetUsingJsonFile"})
    public void petStoreHeaderGetFindByIdTest() {
        final String url = PET_REST_URI + RANDOM;
        System.out.println("url:" + url);
        RestAssured.defaultParser = JSON;
        RestAssured.given()
                .header(API_KEY, API_VAL)
                .header("accept", "application/json")
                .header("content-type", "application/json")
                .get(url)
                .then()
                .statusCode(200);
    }

    @Test(dependsOnMethods = {"postNewPetUsingJsonFile"})
    public void petStoreHeaderUsingAcceptGetFindByIdTest() {
        final String url = PET_REST_URI + RANDOM;
        System.out.println("url:" + url);
        RestAssured.defaultParser = JSON;
        RestAssured.given().header(API_KEY, API_VAL)
                .accept("application/json")
                .contentType("application/json")
                .get(url)
                .then()
                .statusCode(200);
    }

    @Test(dependsOnMethods = {"postNewPetUsingJsonFile"})
    public void petStoreHeaderUsingTypeGetFindByIdTest() {
        final String url = PET_REST_URI + RANDOM;
        System.out.println("url:" + url);
        RestAssured.defaultParser = JSON;
        RestAssured.given()
                .header(API_KEY, API_VAL)
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .get(url)
                .then()
                .statusCode(200);
    }

    @Test(dependsOnMethods = {"postNewPetUsingJsonFile"})
    public void putPetUsingJsonFile() throws IOException {
        String jsonText = JsonUtil
                .readJsonFromUrl(getClass().getClassLoader().getResourceAsStream(JSON_PUT_FILE));
        System.out.println("Initial JsonText:" + jsonText);

        final String url = PET_REST_URI;
        System.out.println("url:" + url);

        jsonText = String.format(jsonText, RANDOM, "cat_" + RANDOM);
        System.out.println("Converted JsonText:" + jsonText);
        RestAssured.defaultParser = JSON;
        RestAssured
                .given()
                .header(API_KEY, API_VAL).accept(ContentType.JSON).contentType(ContentType.JSON)
                .body(jsonText)
                .when()
                .put(url)
                .then()
                .statusCode(200);
    }

    @Test(dependsOnMethods = {"putPetUsingJsonFile"})
    public void deletePetUsingId() throws IOException {

        final String url = PET_REST_URI + RANDOM;
        System.out.println("url to delete:" + url);

        RestAssured.defaultParser = JSON;
        RestAssured
                .given()
                .header(API_KEY, API_VAL).accept(ContentType.JSON).contentType(ContentType.JSON)
                .when()
                .delete(url)
                .then()
                .statusCode(200);
    }

    //@Test(dependsOnMethods={"putPetUsingJsonFile"})
    public void patchPetUsingId() throws IOException {

        final String url = PET_REST_URI + RANDOM;
        System.out.println("url to patch:" + url);

        RestAssured.defaultParser = JSON;
        RestAssured
                .given()
                .header(API_KEY, API_VAL).accept(ContentType.JSON).contentType(ContentType.JSON)
                .when()
                .patch(url)
                .then()
                .statusCode(405);
    }

    /**
     * Gets the random.
     *
     * @return the random
     */
    private static long getRandom() {
        return Long.parseLong(new SimpleDateFormat("MddHHmmssSSS").format(new Date()));
    }
}
