# TestNG Exercise Problem

> [!IMPORTANT]
>
> ## Problem Statement
>
> You are required to create a set of TestNG test cases to validate the functionality of the `Vehicle` package classes. The `Vehicle` package includes classes such as `Car`, `Truck`, and `Motorcycle`. Your task is to ensure that the methods in these classes work as expected by writing and executing TestNG test cases.

## Specific Requirements

1. **Test Class Structure**:
    - Create a test class for each class in the `Vehicle` package.
    - Each test class should be named as `ClassNameTest` (e.g., `CarTest`).

2. **Test Methods**:
    - Write test methods to validate the core functionalities of each class.
    - Use assertions to verify the expected outcomes.
    - Ensure that each test method is annotated with `@Test`.

3. **Grouping**:
    - Group the test methods based on the type of vehicle (e.g., `car`, `truck`, `motorcycle`).

4. **Setup and Teardown**:
    - Use `@BeforeMethod` and `@AfterMethod` annotations to set up and tear down any necessary preconditions and postconditions for the tests.

5. **Example Test Cases**:
    - For the `Car` class, test methods should include:
        - `testCarSpeed()`: Verify that the car's speed is set and retrieved correctly.
        - `testCarFuel()`: Verify that the car's fuel level is managed correctly.
    - For the `Truck` class, test methods should include:
        - `testTruckLoadCapacity()`: Verify that the truck's load capacity is set and retrieved correctly.
        - `testTruckFuel()`: Verify that the truck's fuel level is managed correctly.
    - For the `Motorcycle` class, test methods should include:
        - `testMotorcycleSpeed()`: Verify that the motorcycle's speed is set and retrieved correctly.
        - `testMotorcycleFuel()`: Verify that the motorcycle's fuel level is managed correctly.

## Example Output

```plaintext
[TestNG] Running:
  /path/to/testng.xml

... TestNG output ...

===============================================
Default Suite
Total tests run: 6, Failures: 0, Skips: 0
===============================================
```

## Instructions

1. **Create Test Classes**:
    - Create a new directory `src/test/java/com/kavinschool/vehicle`.
    - Create test classes `CarTest`, `TruckTest`, and `MotorcycleTest` in this directory.

2. **Write Test Methods**:
    - Implement the test methods as specified in the requirements.
    - Use TestNG annotations to manage the test lifecycle.

3. **Group Test Methods**:
    - Use the `groups` attribute in the `@Test` annotation to group the test methods.

4. **Run Tests**:
    - Create a `testng.xml` file to configure and run the tests.
    - Execute the tests using the TestNG runner in IntelliJ IDEA or Eclipse IDE.

Example `testng.xml`:

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Vehicle Test Suite">
    <test name="Vehicle Tests">
        <classes>
            <class name="com.kavinschool.vehicle.CarTest"/>
            <class name="com.kavinschool.vehicle.TruckTest"/>
            <class name="com.kavinschool.vehicle.MotorcycleTest"/>
        </classes>
    </test>
</suite>
```

By following these instructions, you will create a comprehensive set of TestNG test cases to validate the functionality of the `Vehicle` package classes.
