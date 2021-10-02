package ru.levelup.at.hw3;

//В данном классе происходит расчет

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Result {

    public static void main(String[] args) {

        CityBus cb = new CityBus(); //Конструктор класса город.автобус
        cb.setTsMark("Волжанин Ситиритм-12");
        cb.setTsNumber(20);
        cb.setTsCost(8560000);
        cb.setTsFuel(37);
        cb.setTsType("Автобус городской");
        cb.setIncity("Да");

        LongBus lb = new LongBus();
        lb.setTsMark("МАЗ-216");
        lb.setTsNumber(10);
        lb.setTsCost(16944000);
        lb.setTsFuel(30);
        lb.setTsType("Автобус-Гармошка");
        lb.setLongbus("Да");

        MiniBus mb = new MiniBus();
        mb.setTsMark("Sprinter VS30");
        mb.setTsNumber(4);
        mb.setTsCost(350000);
        mb.setTsFuel(9);
        mb.setTsType("Микроавтобус");
        mb.setCompactbus("Да");

        ВecommissionedBus[] bb = new ВecommissionedBus[3];
        bb[0] = new ВecommissionedBus("Газель 2004 года", "Автохлам", "3");

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

        //int[] costts = {16944000, 8560000, 350000}; //Цена единицы
        int[] costts = {cb.getTsCost(), mb.getTsCost(), lb.getTsCost()}; //Цена единицы
        int sum = Arrays.stream(costts).sum();
        int[] numberts = {cb.getTsNumber(), lb.getTsNumber(), mb.getTsNumber()};
        int sum1 = Arrays.stream(numberts).sum(); //Количество
        System.out.println("Стоимость автопарка :  " + sum * sum1 + " руб."); //Сумма
        System.out.println("    ");

        //Сортировка
        System.out.println("Сортировка по расходу топлива:"); //Сортировка
        HashMap<String, Integer> fueltop = new HashMap();
        fueltop.put(cb.getTsMark(), cb.getTsFuel());
        fueltop.put(lb.getTsMark(), lb.getTsFuel());
        fueltop.put(mb.getTsMark(), mb.getTsFuel());
        fueltop.entrySet().stream()
               .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
               .forEach(System.out::println);

        //Поиск
        System.out.println("    ");
        System.out.println("Результат поиска стоимости микроавтобусов от 1500000 руб до 2000000 руб.:  ");

        MiniBusforSearch[] busPrice = new MiniBusforSearch[] {
            new MiniBusforSearch("Газ 2010", 1600000),
            new MiniBusforSearch("Газ 2020", 2500000),
            new MiniBusforSearch("Ларгус", 1700000),
            new MiniBusforSearch("Б/У Волгабас-Мини", 1710000),
            new MiniBusforSearch("Mercedes Sprinter", 4300000),
            new MiniBusforSearch("Golden Dragon", 1999000),
            new MiniBusforSearch("Rolls Rose", 7878000)};

        for (MiniBusforSearch busPriceSearch : busPrice) {
            if (busPriceSearch.getPrice() >= 1500000 && busPriceSearch.getPrice() <= 2000000) {
                System.out.println(
                    "Модель: " + busPriceSearch.getCompactbus() + "   Стоимость: " + busPriceSearch.getPrice()
                        + " руб.");
            }
        }
    }
}


