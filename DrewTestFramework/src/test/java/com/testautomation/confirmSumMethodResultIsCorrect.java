package com.testautomation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class confirmSumMethodResultIsCorrect {

    @Test
    void testToFailBecauseOfDifferentExpectedResult() {

        //create an int that is the sum of the method sum
        int result = sum(140, 100);

        //assert that the result of the sum of both numbers is what you expect
        Assertions.assertEquals(240, result);
    }

    //method that adds two ints together and returns them as a sum
    static int sum(int a, int b) {
        return a + b;
    }
}
