package ru.levelup.at.hw3;

public class MiniBus extends BusPark implements BusUnderWarranty {

    String compactbus;
    Integer price;



    public String getCompactbus() {
        return compactbus;
    }

    public void setCompactbus(String compactbus) {
        this.compactbus = compactbus;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public MiniBus() {
    }

    public MiniBus(String compactbus,Integer price) {
        this.compactbus = compactbus;
        this.price = price;
    }

    public MiniBus(String tsMark, String tsType, Integer tsNumber, Integer tsFuel, Integer tsCost,
                   String compactbus) {
        super(tsMark, tsType, tsNumber, tsFuel, tsCost);
        this.compactbus = compactbus;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MiniBus{" +
            "compactbus='" + compactbus + '\'' +
            ", price=" + price +
            '}';
    }

    @Override
    public void warranty() {
        System.out.println("--==Данные автобусы еще на гарантии==--");
    }
}
