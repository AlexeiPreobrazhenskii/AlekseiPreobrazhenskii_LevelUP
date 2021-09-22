package ru.levelup.at.hw5;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TestDIV extends BeforeAbstract {

    @Test(dataProvider = "dataLong")
    public void divTestLong(long a, long b) {
        long actual = calculator.div(a, b); //Вызов метода
        long expected = a / b;
        Assert.assertEquals(actual, expected, "Incorrect");
    }

    @Test (expectedExceptions = NumberFormatException.class)
    public void divTestLongEqual() throws NumberFormatException {
        long actual = calculator.div(400, 0); //Вызов метода
        Object expected = NumberFormatException.class ;
        Assert.assertEquals(actual, expected);


    }

    @Test(dataProvider = "dataDouble")
    public void divTestDouble(double a, double b) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.div(a, b); //Вызов метода
        double expected = a / b;
        Assert.assertEquals(actual, expected, "Incorrect");
    }
}


