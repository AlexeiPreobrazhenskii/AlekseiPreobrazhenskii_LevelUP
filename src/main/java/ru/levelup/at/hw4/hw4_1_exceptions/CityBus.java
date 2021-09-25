package ru.levelup.at.hw4.hw4_1_exceptions;

public class CityBus extends BusPark implements BusesWashing {

    String incity;



    public CityBus() {
    }

    //    public CityBus(String incity) {
    //        super();
    //        this.incity = incity;
    //    }

    public CityBus(String tsMark, String tsType, Integer tsNumber, Integer tsFuel, Integer tsCost, String incity) {
        super(tsMark, tsType, tsNumber, tsFuel, tsCost);
        this.incity = incity;
    }

    public String getIncity() {
        return incity;
    }

    public void setIncity(String incity) {
        this.incity = incity;
    }



    @Override
    public String toString() {
        return "Автобусы городские: "
            +
            " Марка: "
            + tsMark
            +
            ", Тип: "
            + tsType
            +
            ", Количество: "
            + tsNumber
            + " Расход: "
            + tsFuel
            +
            ", Стоимость за 1 ед.: "
            + tsCost
            +
            ", Только город: "
            + incity;
    }

    @Override
    public void washing() {
        System.out.println("--==Требуется мойка автобусов==--");
    }
}
