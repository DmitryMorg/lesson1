package ru.gb.lesson1;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class FirstApp {
    public static void main (String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
    }
    public static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign () {
        int a = 5;
        int b = -32;
        if (a + b >= 0) {
            System.out.println("Сумма положительна");
        }
        else {
            System.out.println("Сумма отрицательна");
        }
    }
    public static void printColor () {
        int value = 13;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers () {
        int a = 99;
        int b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

}
