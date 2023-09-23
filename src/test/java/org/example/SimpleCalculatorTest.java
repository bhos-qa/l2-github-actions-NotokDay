package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void testingAdditionFeature(){
        var calc = new SimpleCalculator();
        assertEquals(10, calc.add(1, 9));
    }
}