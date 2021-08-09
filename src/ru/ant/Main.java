package ru.ant;

import java.util.*;

public class Main {

    public static void main(String... args) {

        System.out.println("Приложение запущено!");

        double dnums[] = new double[2];

        for (int i = 0; i < 2; i++){
            Scanner in = new Scanner(System.in);
            System.out.print("Введи число: ");
            dnums[i] = in.nextDouble();
        }

        System.out.println("Сумма: " + (dnums[0]+dnums[1]));
        System.out.println("Разностть: " + (dnums[0]-dnums[1]));
        System.out.println("Деление: " + (dnums[0]/dnums[1]));
        System.out.println("Умножение: " + (dnums[0]*dnums[1]));


    }

}
