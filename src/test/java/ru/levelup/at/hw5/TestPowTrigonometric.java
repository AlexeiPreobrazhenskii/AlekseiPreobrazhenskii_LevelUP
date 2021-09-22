package ru.levelup.at.hw5;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.levelup.qa.at.calculator.Calculator;

public class TestPowTrigonometric extends BeforeAbstract {

    @Test(dataProvider = "dataDoubleSingle")
    public void divTestTg(double a) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.tg(a); //Вызов метода
        double expected = Math.tan(a);
        Assert.assertEquals(actual, expected, "Incorrect - Upadet");
    }

    @Test(dataProvider = "dataDoubleSingle")
    public void divTestCtg(
        double a) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.ctg(a); //Вызов метода
        double expected = Math.cos(a) / Math.sin(a);
        Assert.assertEquals(actual, expected, "Incorrect - Upadet");
    }

    @Test(dataProvider = "dataDoubleSingle")
    public void divTestCos(
        double a) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.cos(a); //Вызов метода
        double expected = Math.cos(a);
        Assert.assertEquals(actual, expected, "Incorrect- Upadet");
    }

    @Test(dataProvider = "dataDoubleSingle")
    public void divTestSin(
        double a) {
        //1 public void - для тестов ОБЯЗАТЕЛЬНО, + 2 поставить аннотацию для тест нг для понимания что это тест
        double actual = calculator.sin(a); //Вызов метода
        double expected = Math.sin(a);
        Assert.assertEquals(actual, expected, "Incorrect");
    }
}


