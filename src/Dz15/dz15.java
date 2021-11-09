package Dz15;

import java.util.Scanner;

public class dz15 {
    public static void main(String[] args) {

        int[] a = new int[20];
        Scanner scan1 = new Scanner(System.in);
        for(int i = 0; i <= 19;i++ ) {
            System.out.print("Введите число №"+(i+1)+" ");
            int b = scan1.nextInt();
            a[i] = b;
        }
        System.out.println("\n");
        System.out.println("\n-----------------------------------> Massive A ");
        for (int element: a) {
            System.out.print("[" + element + "] ");
        }
        System.out.println("\n-----------------------------------");
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        System.arraycopy(a, 0, a1, 0, 10);
        System.arraycopy(a, 11, a2, 0, 9);
        System.out.println("\n-----------------------------------> Massive A1 ");
        for (int element: a1) {
            System.out.print("[" + element + "] ");
        }
        System.out.println("\n-----------------------------------");
        System.out.println("\n-----------------------------------> Massive A2 ");
        for (int element: a2) {
            System.out.print("[" + element + "] ");
        }
        System.out.println("\n-----------------------------------");
    }
}


/*1. Создать массив на 20 чисел.

        2. Ввести в него значения с консоли.

        3. Создать два массива на 10 чисел каждый.

        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.

 */