package Dz13;

import java.sql.SQLOutput;

public class dz13 {
    public static void main(String[] args) {
        int[] a = new int[25];
        int[] b = new int[25];
        int calculateA = 0;
        int calculateB = 0;
        System.out.println("\n");
        for (int i = 0; i <= 24; i++) {
            int number = 18 + (int) (Math.random() * 40);
            a[i] = number;
            calculateA += a[i];
            int number1 = 18 + (int) (Math.random() * 40);
            b[i] = number1;
            calculateB += b[i];
        }
        for (int i = 0; i <= 24; i++) {
            System.out.print("[" + a[i] + "] ");

        }
        System.out.println("\nсредний возраст каждой команды: "+calculateA/25);
        System.out.println("\n");
        for (int i = 0; i <= 24; i++) {
            System.out.print("[" + b[i] + "] ");
        }
        System.out.println("\nсредний возраст каждой команды: "+calculateB/25);

    }
}



/*
Есть две команды регби из 25 человек разного возраста каждая.

Возрасты членов команд подбирались случайным образом (Math.random).

Выведите на экран в двух отдельных строках возраст участников каждой команды.

Посчитайте средний возраст каждой команды и сообщите, для какой из них это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */