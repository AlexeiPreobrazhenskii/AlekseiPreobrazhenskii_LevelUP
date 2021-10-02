package ru.levelup.at.hw4.hw4_2_collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionFW {



    public static void main(String[] args) {

        ArrayList<Integer> genDigit = new ArrayList<Integer>();

        for (Integer i = 1; i < 101; i++) {
            genDigit.add(i);
        }

        System.out.println("1. Сгенерируйте 100 последовательных целых чисел: " + genDigit);
        Collections.shuffle(genDigit);

        System.out.println("2. Создайте список и вставьте туда элементы в произвольном порядке: " + genDigit);
        Set<Integer> uniqueGas = new HashSet<Integer>(genDigit);

        System.out.println("3. Напишите проверку, что все элементы в данной коллекции А уникальны");
        System.out.print("В списке содержится: " + uniqueGas.size() + " уникальных значений из " + genDigit.size()
            + " добавленных.  ");

        if (uniqueGas.size() == genDigit.size()) {
            System.out.println("Эти значения уникальные");
        } else {
            System.out.println("Значения не уникальные");
        }

        //Проверка деления без остатка
        ArrayList<Integer> divDigit2 = new ArrayList<>(); //Создание массивов
        ArrayList<Integer> divDigit3 = new ArrayList<>();
        ArrayList<Integer> divDigit5 = new ArrayList<>();
        ArrayList<Integer> divDigit7 = new ArrayList<>();

        for (Integer num : uniqueGas) {  //Условие
            if (num % 2 == 0) {
                divDigit2.add(num);
            } else if (num % 3 == 0) {
                divDigit3.add(num);
            } else if (num % 5 == 0) {
                divDigit5.add(num);
            } else if (num % 7 == 0) {
                divDigit7.add(num);
            }
        }
        System.out.println("4. Проверьте делится элемент на 2, 3, 5 или 7");
        System.out.println("Числа делящиеся на 2 без остатка " + divDigit2);
        System.out.println("Числа делящиеся на 3 без остатка " + divDigit3);
        System.out.println("Числа делящиеся на 5 без остатка " + divDigit5);
        System.out.println("Числа делящиеся на 7 без остатка " + divDigit7);
    }
}







