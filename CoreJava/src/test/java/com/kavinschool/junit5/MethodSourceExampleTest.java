package com.kavinschool.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MethodSourceExampleTest {

    @ParameterizedTest
    @MethodSource("provideFruits")
    void testWithMethodSource(String fruit) {
        assertNotNull(fruit);
    }

    static Stream<String> provideFruits() {
        return Stream.of("apple", "banana", "cherry");
    }
}
