package Dz22;

import java.util.Scanner;

public class dz22 {
    public static void main(String[] args) {
        System.out.println("Введите число N");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        recurs(a);
        System.out.println(recurs(a));
    }
    public static int recurs(int a){
        if (a <= 1) {
            return 1;
        }
        else {
            return a * recurs(a - 1);
        }
        }
    }

