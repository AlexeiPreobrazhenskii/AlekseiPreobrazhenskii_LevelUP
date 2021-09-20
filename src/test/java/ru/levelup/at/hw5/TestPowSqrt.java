package ru.levelup.at.hw5;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TestPowSqrt extends BeforeAbstract {

    @Test(dataProvider = "dataDouble")
    public void divTestDoublePow(double a, double b) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.pow(a, b); //Вызов метода
        double expected = Math.pow(a, Math.floor(b));
        Assert.assertEquals(actual, expected, "Incorrect");
    }

    @Test(dataProvider = "dataDouble")
    public void divTestDoubleSqrt(double a, double b) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.sqrt(a); //Вызов метода
        double expected = Math.sqrt(Math.abs(a));
        Assert.assertEquals(actual, expected, "Incorrect");
    }
}


