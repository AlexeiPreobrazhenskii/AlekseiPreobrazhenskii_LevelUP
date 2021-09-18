package HW2;

public class ВecommissionedBus {

    String tsMark;
    String tsType;
    String tsNumber;

    public ВecommissionedBus() {

    }

    public ВecommissionedBus(String tsMark, String tsType, String tsNumber) {
        this.tsMark = tsMark;
        this.tsType = tsType;
        this.tsNumber = tsNumber;
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

    public String getTsNumber() {
        return tsNumber;
    }

    public void setTsNumber(String tsNumber) {
        this.tsNumber = tsNumber;
    }

    @Override
    public String toString() {
        return "Микро автобус"
            + " Марка: " + tsMark
            + ", Тип: " + tsType
            + ", Количество: " + tsNumber

            ;
    }
}
