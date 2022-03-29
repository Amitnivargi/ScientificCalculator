package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }



    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2.5, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(-10.5, actualResult);
    }


    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(1,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }
    @Test
    @DisplayName("Test multiplication of Two Integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(4,1);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(4, actualResult);
    }
    @Test
    @DisplayName("Test division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(6,3);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }
    @Test

    @DisplayName("Test multilication of Two Doubles")

   void testMultiplicationOperationForDoubles() {
    standardCalculator.multiply(10.0,20.5);
    double actualResult = standardCalculator.getResult();
    Assertions.assertEquals(205.0, actualResult);    
   }
@Test

  @DisplayName("Test Division of Two Doubles")

void testDivisionOperationForDoubles() {
    standardCalculator.divide(41.0,20.5);
    double actualResult = standardCalculator.getResult();
    Assertions.assertEquals(2.0, actualResult);
}

}
