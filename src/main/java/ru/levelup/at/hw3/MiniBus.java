package ru.levelup.at.hw3;

public class MiniBus extends BusPark implements BusUnderWarranty {

    String compactbus;

    public MiniBus() {
    }

    public MiniBus(String compactbus) {
        this.compactbus = compactbus;
    }

    public MiniBus(String tsMark, String tsType, Integer tsNumber, Integer tsFuel, Integer tsCost,
                   String compactbus) {
        super(tsMark, tsType, tsNumber, tsFuel, tsCost);
        this.compactbus = compactbus;
    }

    public String getCompactbus() {
        return compactbus;
    }

    public void setCompactbus(String compactbus) {
        this.compactbus = compactbus;
    }

    @Override
    public String toString() {
        return "Микро автобус"
            + " Марка: " + tsMark
            + ", Тип: " + tsType
            + ", Количество: " + tsNumber
            + " Расход: " + tsFuel
            + ", Стоимость за 1 ед.: " + tsCost
            + ", Компактный автобус: " + compactbus
            ;
    }

    @Override
    public void warranty() {
        System.out.println("--==Данные автобусы еще на гарантии==--");
    }
}
