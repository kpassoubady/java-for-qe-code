package com.kavinschool.junit5;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArgumentsSourceExampleTest {

    @ParameterizedTest
    @ArgumentsSource(FruitProvider.class)
    void testWithArgumentsSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    static class FruitProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of("apple", 1),
                    Arguments.of("banana", 2),
                    Arguments.of("cherry", 3)
            );
        }
    }
}
