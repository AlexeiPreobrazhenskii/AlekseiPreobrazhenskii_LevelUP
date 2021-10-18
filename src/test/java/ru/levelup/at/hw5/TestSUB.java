package ru.levelup.at.hw5;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TestSUB extends BeforeAbstract {

    @Test (dataProvider = "dataLong")
    public void subTestLong(long a, long b) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        long actual = calculator.sub(a, b); //Вызов метода
        long expected = a - b;
        Assert.assertEquals(actual, expected, "Incorrect");
    }

    @Test (dataProvider = "dataDouble")
    public void testDouble(double a, double b) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.sub(a, b); //Вызов метода
        double expected = a - b;
        Assert.assertEquals(actual, expected, "Incorrect");
    }
}


