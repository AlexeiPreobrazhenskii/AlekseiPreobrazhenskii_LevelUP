package ru.levelup.at.hw5;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TestPositivAndNegative extends BeforeAbstract {


    @Test
    public void isPositive() {
        boolean actual = calculator.isPositive(0L);
        boolean expected = false;
        Assert.assertEquals(actual, expected, "Incorrect");
    }

    @Test
    public void isPositiveElse() {
        boolean actual = calculator.isPositive(400L);
        boolean expected = true;
        Assert.assertEquals(actual, expected, "Incorrect");
    }
}






