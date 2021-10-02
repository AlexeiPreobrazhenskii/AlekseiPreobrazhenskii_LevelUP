package ru.levelup.at.hw5;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSUM extends BeforeAbstract {

    @Test (dataProvider = "dataLong")
    public void sumTestLong(long a, long b) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        //Calculator calculator = new Calculator(); //  Экземляр калькулятора
        long actual = calculator.sum(a, b); //Вызов метода
        long expected = a + b;
        Assert.assertEquals(actual, expected, "Incorrect");
    }

    @Test (dataProvider = "dataDouble")
    public void sumTestDouble(double a, double b) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        //Calculator calculator = new Calculator(); //  Экземляр калькулятора
        double actual = calculator.sum(a, b); //Вызов метода
        double expected = a + b;
        Assert.assertEquals(actual, expected, "Incorrect");
    }
}

