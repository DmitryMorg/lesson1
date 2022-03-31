/**
 * Java 1. Homework 1.
 *
 * @author Dmitry Morgachev
 * @version 31.03.2022
 */
package ru.gb.lesson1;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

class FirstApp {

    public static void main (String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
    }

    static void printThreeWords () {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign () {
        int a = 5;
        int b = -32;
        System.out.println(a + b >= 0? "Сумма положительна" : "Сумма отрицательна");
    }

    static void printColor () {
        int value = 13;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers () {
        int a = 99;
        int b = 1;
        System.out.println(a >= b? "a >= b" : "a < b");
    }

}
