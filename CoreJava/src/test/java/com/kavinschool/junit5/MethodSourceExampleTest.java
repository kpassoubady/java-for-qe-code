package com.kavinschool.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MethodSourceExampleTest {

    @ParameterizedTest
    @MethodSource("provideFruits")
    void testWithMethodSource(String fruit) {
        assertNotNull(fruit, "fruit is null");
        assertFalse(fruit.isEmpty(),"fruit is empty");
        assertTrue(fruit.length() > 3, "fruit length SHOULD BE GREATER than 3 EXPECTED");
    }

    static Stream<String> provideFruits() {
        return Stream.of("apple", "banana", "cherry",null,"","fig","gr");
    }
}
