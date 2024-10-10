package com.kavinschool.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

enum Fruit { APPLE, BANANA, CHERRY }

class EnumSourceExampleTest {

    @ParameterizedTest
    @EnumSource(Fruit.class)
    void testWithEnum(Fruit fruit) {
        assertNotNull(fruit);
    }
}
