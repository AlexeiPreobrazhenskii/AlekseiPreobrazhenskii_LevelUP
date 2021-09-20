package ru.levelup.at.hw5;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import ru.levelup.qa.at.calculator.Calculator;

public abstract class BeforeAbstract {

    public Calculator calculator; //Приватное поле. тк калькулятор объявлен локально на уровне метода (?)

    @BeforeMethod  //ХУК
    public void beforeMethod() {
        calculator = new Calculator();
    }

    @DataProvider
    public Object[][] dataLong() {
        return new Object[][] {
            {3, 10}
        };
    }

    @DataProvider
    public Object[][] dataDouble() {
        return new Object[][] {
            {3.977, 88.177}
        };
    }

    @DataProvider
    public Object[][] dataDoubleSingle() {
        return new Object[][] {
            {23.977}
        };
    }
}

