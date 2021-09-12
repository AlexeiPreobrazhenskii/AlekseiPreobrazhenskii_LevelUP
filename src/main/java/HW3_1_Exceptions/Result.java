package HW3_1_Exceptions;

//В данном классе происходит расчет

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Result {

    public static <BusParks> void main(String[] args) {


        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e)
        {
            System.out.println("myNumbers - Исключение 1, обращение за пределы длины массива");}



        CityBus cb = new CityBus(); //Конструктор класса город.автобус
        cb.setTsMark("Волжанин Ситиритм-12");
        cb.setTsNumber(20);
        cb.setTsCost(8560000);
        cb.setTsFuel(37);
        cb.setTsType("Автобус городской");
        cb.setIncity("Да");

        LongBus lb = new LongBus();
        lb.setTsMark("Волжанин Ситиритм-12");
        //        lb.setTsMark(221); /////////////
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
        try {
            bb[-1] = new ВecommissionedBus("Газель 2004 года", "Автохлам", "3");
        }
        catch (Exception e){
            System.out.println("ВecommissionedBus - Исключение 2. отрицательный адрес массива");}


        //        BusPark busPark = new BusPark("МАЗ-216");

        int[] costts = {16944000, 8560000, 350000}; //Цена единицы
        int sum = Arrays.stream(costts).sum();

        int[] numberts = {10, 20,};//////////////
        int sum1 = Arrays.stream(numberts).sum(); //Количество

        //Сортировка по расходу бензина в процессе

        //Поиск самого дорого автобуса в процессе

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

        try {
            System.out.println("Стоимость автопарка :  " + sum / 0 + sum1 + " руб."); //Сумма
        }
        catch (ArithmeticException e) {
            System.out.println("Исключение 3. Деление на 0.");}
    }


    }



