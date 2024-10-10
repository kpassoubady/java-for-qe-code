package com.kavinschool.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ValueSourceExampleTest {

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry"})
    void testWithStrings(String fruit) {
        assertNotNull(fruit);
    }
}
