package HW2;

public class LongBus extends BusPark {

    String longbus;

    //    public LongBus(String longbus) {
    //        this.longbus = longbus;
    //    }

    public LongBus() {
    }

    public LongBus(String tsMark, String tsType, Integer tsNumber, Integer tsFuel, Integer tsCost, String longbus) {
        super(tsMark, tsType, tsNumber, tsFuel, tsCost);
        this.longbus = longbus;
    }

    public String getLongbus() {
        return longbus;
    }

    public void setLongbus(String longbus) {
        this.longbus = longbus;
    }

    @Override
    public String toString() {
        return "Автобус гармошка"
            + " Марка: " + tsMark
            + ", Тип: " + tsType
            + ", Количество: " + tsNumber
            + " Расход: " + tsFuel
            + ", Стоимость за 1 ед.: " + tsCost
            + ", Автобус- гармошка: " + longbus
            ;
    }
}
