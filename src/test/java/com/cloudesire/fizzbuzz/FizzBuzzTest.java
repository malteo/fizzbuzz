package com.cloudesire.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest
{
    @ParameterizedTest( name = "{0} prints {1}" )
    @CsvSource( textBlock = """
            1,         1
            2,         2
            3,      Fizz
            4,         4
            5,      Buzz
            6,      Fizz
            7,         7
            8,         8
            9,      Fizz
            10,     Buzz
            11,       11
            12,     Fizz
            13,       13
            14,       14
            15, FizzBuzz
            30, FizzBuzz
    """)
    void fizzBuzz( int number, String expectedResult )
    {
        var fizzBuzz = new FizzBuzz();
        assertEquals( expectedResult, fizzBuzz.apply( number ), () -> number + " should print " + expectedResult );
    }
}
