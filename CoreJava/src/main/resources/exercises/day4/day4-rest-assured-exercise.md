# Advanced RestAssured End-to-End API Testing - Petstore API

## Problem Statement
>
> [!IMPORTANT]
>
> You are tasked with testing an end-to-end scenario for an online pet store. The scenario involves **user management**, **pet inventory management**, and **store order processing**. Your job is to:
>
> 1. **Create a new user** in the system with a unique identifier.
> 2. **Add a new pet** to the pet store inventory with a unique identifier.
> 3. **Place an order** for the pet using the store order system.
> 4. **Modify the pet's information** after the order has been placed (e.g., change the pet’s status to "sold").
> 5. **Delete the user and the pet** at the end of the test to clean up the data.
>
> You must use **RestAssured** to write and execute these API tests, which will interact with multiple endpoints. The tests should validate that:
>
> 1. The user is created successfully with a unique identifier.
> 2. The pet is added to the store successfully with a unique identifier.
> 3. The order is placed correctly.
> 4. The pet's information is updated successfully.
> 5. The user and pet are deleted at the end of the test.
>

## Specific Requirements
>
> [!TIP]
>
> 1. **Create a New User with Unique ID**:
>    - Use the `POST /user` endpoint to create a new user with the following details:
>      - Username: `"testuser_" + current timestamp`
>      - First name: "Test"
>      - Last name: "User"
>      - Email: `"testuser@example.com"`
>      - Password: `"password123"`
>      - Phone: `"1234567890"`
>    - Validate that the user is created successfully with a unique username.
>
> 2. **Add a New Pet to Inventory with Unique ID**:
>    - Use the `POST /pet` endpoint to add a new pet with the following details:
>      - ID: Randomly generated or timestamp-based unique ID
>      - Name: `"TestPet_" + current timestamp`
>      - Status: "available"
>    - Validate that the pet is added to the store successfully with a unique name.
>
> 3. **Place an Order for the Pet**:
>    - Use the `POST /store/order` endpoint to place an order for the newly added pet with the following details:
>      - Pet ID: The ID of the newly created pet
>      - Quantity: 1
>      - Ship Date: Current date
>      - Status: "placed"
>    - Validate that the order is placed successfully and that the order details match the request.
>
> 4. **Modify the Pet’s Information**:
>    - Use the `PUT /pet` endpoint to change the pet’s status to "sold".
>    - Validate that the response contains the updated information.
>
> 5. **Delete the User and Pet**:
>    - Use the `DELETE /user/{username}` endpoint to delete the user.
>    - Use the `DELETE /pet/{petId}` endpoint to delete the pet.
>    - Validate that the deletion is successful for both the user and the pet.
>

## Bonus Points
>
> [!NOTE]
>
> - Implement the creation of random unique objects using timestamps or UUIDs. Each user, pet, and order should be uniquely identified by:
>   - Username: `"testuser_" + current timestamp`
>   - Pet name: `"TestPet_" + current timestamp`
>   - Pet ID: Randomly generated or timestamp-based ID.
> - Demonstrate that these unique objects are created and destroyed at the end of the test.

## Instructions
>
> [!CAUTION]
>
>
> 1. **Setup Dependencies**:
>    - Include the necessary dependencies for **RestAssured** and **TestNG** in your project (use Maven or Gradle).
>
> 2. **User Management**:
>    - Use the `POST /user` endpoint to create a new user with a unique username. Store the username for future deletion.
>
> 3. **Pet Management**:
>    - Use the `POST /pet` endpoint to add a new pet to the inventory with a unique ID. Ensure the pet's ID is randomly generated or timestamp-based, and store it for future requests.
>
> 4. **Store Order**:
>    - Use the `POST /store/order` endpoint to place an order for the newly created pet. Ensure the order data (such as quantity, ship date, and status) is validated.
>
> 5. **Update Pet Information**:
>    - Use the `PUT /pet` endpoint to update the pet's status to "sold" after the order is placed.
>
> 6. **Cleanup**:
>    - Use the `DELETE /user/{username}` endpoint to delete the created user.
>    - Use the `DELETE /pet/{petId}` endpoint to delete the created pet.
>
> 7. **Assertions**:
>    - Ensure that each API call returns the expected status code (200 or 201).
>    - Use assertions to validate that the data in the responses matches the data in the requests (e.g., pet name, status, user information, order details).
>
> 8. **Execute Tests**:
>    - Use **TestNG** to organize the test cases into logical steps (user creation, pet management, order processing, data cleanup).
>    - Execute the tests and ensure the entire end-to-end flow is verified.

## Example Workflow

1. Create a user (`POST /user`)
2. Add a pet to the store (`POST /pet`)
3. Place an order for the pet (`POST /store/order`)
4. Update the pet's status (`PUT /pet`)
5. Delete the user and pet (`DELETE /user/{username}`, `DELETE /pet/{petId}`)

## Starting Code Snippet
>
> [!WARNING]
> May not compile or work, modify the code as needed.
>

## Prerequisites
>
> [!IMPORTANT]
> Add/Update pom.xml with latest testng and rest-assured framework dependencies (check the version from the maven central repository).
>

```xml
<dependencies>
    <!-- RestAssured Dependency -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>4.4.0</version>
        <scope>test</scope>
    </dependency>
    
    <!-- TestNG Dependency -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

```

```java
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;

public class PetStoreTest {

    private String baseUri = "https://petstore.swagger.io/v2";
    private String username;
    private long petId;
    private String petName;

    //This method initializes the base URL and generates unique values for the username and pet name using a timestamp
    @BeforeClass
    public void setUp() {

    }

    @Test(priority = 1)
    public void createUser() {
        // Create a new user
        // Sends a POST request to create a new user.
        // Asserts that the response status is 200.
        System.out.println("User created: " + username);
    }

    @Test(priority = 2)
    public void addPet() {
    // Create a new pet
    // Sends a POST request to add a new pet to the store with a randomly generated pet ID and timestamp-based pet name.
        //Asserts that the response status is 200.
        System.out.println("Pet added: " + petName + " (ID: " + petId + ")");
    }

    @Test(priority = 3)
    public void placeOrder() {
        // Place an order for the pet
        // Sends a POST request to place an order for the newly added pet.
        // Asserts that the order was placed successfully with a 200 status.
        System.out.println("Order placed for pet ID: " + petId);
    }

    @Test(priority = 4)
    public void updatePetStatus() {
        // Update pet status to "sold"
        // Sends a PUT request to update the pet's status to "sold".
        // Asserts that the pet’s status update was successful.
        
        System.out.println("Pet status updated to 'sold' for: " + petName);
    }

    @AfterClass
    // Deletes the user and the pet at the end of the tests to clean up the data.
    public void cleanUp() {
        // Delete the user
        // Delete the pet

        // Asserts that both the user and pet were successfully deleted.


        System.out.println("User deleted: " + username);

        System.out.println("Pet deleted: " + petId);
    }
}

```
