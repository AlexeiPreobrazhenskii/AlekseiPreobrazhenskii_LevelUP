package ru.levelup.at.hw3;

//В данном классе происходит расчет

import java.util.Arrays;

public class Result {

    @SuppressWarnings("checkstyle:VariableDeclarationUsageDistance")
    public static void main(String[] args) {

        //        BusPark df = new BusPark() {
        //
        //        };

        //        BusPark bp = new BusPark();

        //        CityBus[] cityBuses = new CityBus[10];
        //        cityBuses[0] = new CityBus("Yes");

        CityBus cb = new CityBus(); //Конструктор класса город.автобус
        cb.setTsMark("Волжанин Ситиритм-12");
        cb.setTsNumber(20);
        cb.setTsCost(8560000);
        cb.setTsFuel(37);
        cb.setTsType("Автобус городской");
        cb.setIncity("Да");

        LongBus lb = new LongBus();
        lb.setTsMark("Волжанин Ситиритм-12");
        lb.setTsNumber(20);
        lb.setTsCost(8560000);
        lb.setTsFuel(37);
        lb.setTsType("Автобус городской");
        lb.setLongbus("Да");

        MiniBus mb = new MiniBus();
        mb.setTsMark("Волжанин Ситиритм-12");
        mb.setTsNumber(20);
        mb.setTsCost(8560000);
        mb.setTsFuel(37);
        mb.setTsType("Автобус городской");
        mb.setCompactbus("Да");

        ВecommissionedBus[] bb = new ВecommissionedBus[3];
        bb[0] = new ВecommissionedBus("Газель 2004 года", "Автохлам", "3");

        //        BusPark busPark = new BusPark("МАЗ-216");





        //Сортировка по расходу бензина в процессе  //Поиск самого дорого автобуса в процессе

        System.out.println("Парк автобусов автопарка №5: ");
        System.out.println("    ");
        System.out.println(cb);
        cb.washing();
        System.out.println("    ");
        System.out.println(lb);
        System.out.println("    ");
        System.out.println(mb);
        mb.warranty();
        System.out.println("......................................................");
        System.out.println("Списаные автобусы: " + bb[0]);
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        int[] costts = {16944000, 8560000, 350000}; //Цена единицы
        int sum = Arrays.stream(costts).sum();
        int[] numberts = {10, 20, 5};
        int sum1 = Arrays.stream(numberts).sum(); //Количество
        System.out.println("Стоимость автопарка :  " + sum * sum1 + " руб."); //Сумма
    }
}


