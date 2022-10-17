package lesson3.lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class MainForLessonOne {

    public static void main(String[] args) {
        System.out.println("---printThreeWords");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("---checkSumSign");
        math();
        System.out.println("---printColor");
        checkColor();
        System.out.println("---compareNumbers");
        compareNumbers();
    }

    private static void compareNumbers() {
        int varA;
        varA = ThreadLocalRandom.current().nextInt(0, 20);
        int varB;
        varB = ThreadLocalRandom.current().nextInt(0, 20);
        System.out.println("A = " + varA);
        System.out.println("B = " + varB);
        if (varA >= varB) {
            System.out.println("a >= b");
        } else if (varA < varB) {
            System.out.println("a < b");
        }
    }

    private static void checkColor() {
        int color = ThreadLocalRandom.current().nextInt(-20, 120);
        System.out.println(color);
        if (color <= 0) {
            System.out.println("Красный");
        } else if (color > 0 && color <= 100) {
            System.out.println("Желтый");
        } else if (color > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void math() {
        int A;
        A = 1;
        int B;
        B = ThreadLocalRandom.current().nextInt(-3, 3);
        int C;
        C = 0;
        System.out.println(C = A + B);
        if (C < 0) {
            System.out.println("Ответ отрицательный");
        } else if (C >= 0) {
            System.out.println("Ответ положительный");
        }
    }


}



