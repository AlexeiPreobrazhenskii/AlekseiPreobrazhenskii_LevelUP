package ru.levelup.at.hw2;

import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ввести первое целое число ");
        int digit1 = digitAfterCheck();
        System.out.println("Ввести второе целое число ");
        int digit2 = digitAfterCheck();
        System.out.println("Ввести символ операции, один из + - / * ");
        int symbol = scan.next().charAt(0);

        int calc;
        switch (symbol) {            // Переключение по случаям + расчет
            case '+':
                calc = digit1 + digit2;
                System.out.println("Результат: " + calc);
                break;
            case '-':
                calc = digit1 - digit2;
                System.out.println("Результат: " + calc);
                break;
            case '/':
                if (digit2 != 0) {
                    calc = digit1 / digit2;
                    System.out.println("Результат: " + calc);
                } else {
                    System.out.println("Error: divide by zero"); // Обработка ошибки деления через 0
                }
                break;
            case '*':
                calc = digit1 * digit2;
                System.out.println("Результат: " + calc);
                break;
            default:
                System.out.println("Расчет не произведен");
        }
    }

    private static int digitAfterCheck() {   //Обработка входных данных, только целые
        int digit;
        if (scan.hasNextInt()) {
            digit = scan.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            scan.next();
            digit = digitAfterCheck();
        }
        return digit;
    }
}
