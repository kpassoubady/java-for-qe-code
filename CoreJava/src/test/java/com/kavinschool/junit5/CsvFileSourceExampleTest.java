package com.kavinschool.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CsvFileSourceExampleTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/fruits.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }
}
