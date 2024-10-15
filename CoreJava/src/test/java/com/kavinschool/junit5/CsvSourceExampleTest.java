package com.kavinschool.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CsvSourceExampleTest {

    @ParameterizedTest
    @CsvSource({
            "apple, 1",
            "banana, 2",
            "cherry, 3",
            "date, -1",
            ", 5"
    })
    void testWithCsvSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }
}
