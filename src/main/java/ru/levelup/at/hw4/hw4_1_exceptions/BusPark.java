package ru.levelup.at.hw4.hw4_1_exceptions;

//От данного класса происходит наследование
public abstract class BusPark {

    public String tsMark;  // Марка автобусов
    public String tsType;  // Тип автобусов
    public Integer tsNumber; // Количество автобусов
    public Integer tsFuel; // Расход топлива Литр/100км
    public Integer tsCost; // Стоимость 1 еденицы ТС

    public BusPark() {
    }

    public BusPark(String tsMark, String tsType, Integer tsNumber, Integer tsFuel, Integer tsCost) {
        this.tsMark = tsMark;
        this.tsType = tsType;
        this.tsNumber = tsNumber;
        this.tsFuel = tsFuel;
        this.tsCost = tsCost;
    }

    public String getTsMark() {
        return tsMark;
    }

    public void setTsMark(String tsMark) {
        this.tsMark = tsMark;
    }

    public String getTsType() {
        return tsType;
    }

    public void setTsType(String tsType) {
        this.tsType = tsType;
    }

    public Integer getTsNumber() {
        return tsNumber;
    }

    public void setTsNumber(Integer tsNumber) {
        this.tsNumber = tsNumber;
    }

    public Integer getTsFuel() {
        return tsFuel;
    }

    public void setTsFuel(Integer tsFuel) {
        this.tsFuel = tsFuel;
    }

    public Integer getTsCost() {
        return tsCost;
    }

    public void setTsCost(Integer tsCost) {
        this.tsCost = tsCost;
    }

    //    @Override
    //    public String toString() {
    //        return "BusPark{"
    //            +
    //            "tsMark='"
    //            + tsMark
    //            + '\''
    //            + ", tsType='"
    //            + tsType
    //            + '\''
    //            + ", tsNumber="
    //            + tsNumber
    //            +
    //            ", tsFuel="
    //            + tsFuel
    //            +
    //            ", tsCost="
    //            + tsCost
    //            +
    //
    //            '}';
}


