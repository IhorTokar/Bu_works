package org.example;

import org.example.mathExamples.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void MathTest1() {
        Calculator KO = new Calculator();

        Object result = KO.Solve("2+2");

        Object expectedresult = 4.0;

        Assertions.assertEquals(expectedresult, result);
    }
    @Test
    void MathTest2() {
        Calculator KO = new Calculator();


        String strexample = "55%2";

        Object result = KO.Solve(strexample);

        Object expectedresult = 1.0;

        Assertions.assertEquals(expectedresult, result);
    }
    @Test
    void MathTest3() {
        Calculator KO = new Calculator();

        Object result = KO.Solve(null);

        Object expectedresult = 0;

        Assertions.assertEquals(expectedresult, result);
    }
}