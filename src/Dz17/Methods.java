package Dz17;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void  Massivs(int[] a, int[] a1) {
        System.out.print("Введите число от 0 до 9\n");

        Scanner scan1 = new Scanner(System.in);

        for(int g = 0; g <=a1.length - 1;g++){
            System.out.print("Введите число №"+(g+1)+" ");
            int с = scan1.nextInt();
            a1[g] = с;
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(a1));
        int b;
        for(int i = 0; i <=a.length - 1;i++) {
            b = (int) (Math.random() * 9);
            a[i] = b;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void Sort(int[] a, int[] a1)
    {
        int calc = 0;
        System.out.println("\n");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        for(int i = 0; i <= a.length-1 ;i++) {
                if (a[i] == a1[i]) calc++;
        }
        System.out.println("\n "+calc);
    }
}
/*
if(scan1hasNextInt() > 9){
                System.out.println("Чилсо больше 9-ти !");
                System.out.print("Введите число №"+(g+1)+" ");
                scan1.nextInt();
            }
            else if(scan1.nextInt() < 0)
            {
                System.out.println("Чилсо меньше 0 !");
                System.out.print("Введите число №"+(g+1)+" ");
                scan1.nextInt();
            }

             */