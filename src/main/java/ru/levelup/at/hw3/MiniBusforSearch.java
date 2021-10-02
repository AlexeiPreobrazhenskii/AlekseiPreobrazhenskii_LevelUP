package ru.levelup.at.hw3;

public class MiniBusforSearch {

    String compactbus;
    Integer price;

    public MiniBusforSearch() {
    }

    public MiniBusforSearch(String compactbus, Integer price) {
        this.compactbus = compactbus;
        this.price = price;
    }

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

    @Override
    public String toString() {
        return "MiniBusforSearch{"
            + "compactbus='" + compactbus + '\''
            + ", price=" + price + '}';
    }
}
