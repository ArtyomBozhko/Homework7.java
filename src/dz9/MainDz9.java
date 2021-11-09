package dz9;

import java.util.Scanner;


public class MainDz9 {
    public static void main(String[] args) {

         Scanner Size  = new Scanner(System.in);

        System.out.println("Введите параметры сумки: ");
        System.out.println("Введите высоту сумки  (см) : ");
        int HB = Size.nextInt();
        System.out.println("Введите ширину сумки (см) : ");
        int WB = Size.nextInt();
        System.out.println("Введите длину сумки (см) : ");
        int LB = Size.nextInt();

        System.out.println("\nВведите параметры рюкзака: ");
        System.out.println("Введите высоту  рюкзака  (см) : ");
        int HBg = Size.nextInt();
        System.out.println("Введите ширину  рюкзака (см) : ");
        int WBg = Size.nextInt();
        System.out.println("Введите длину рюкзака (см) : ");
        int LBg = Size.nextInt();

        CheckPacakge.check(HB, WB, LB, HBg, WBg, LBg);
    }
}



/*
        Scanner HeightBackpack  = new Scanner(System.in);
        Scanner WidthBackpack = new Scanner(System.in);
        Scanner LengthBackpack = new Scanner(System.in);
        Scanner HeightBag = new Scanner(System.in);
        Scanner WidthBag = new Scanner(System.in);
        Scanner LengthBag = new Scanner(System.in);

        System.out.println("Введите параметры рюкзака: ");
        System.out.println("Введите высоту рюкзака  (см) : ");
        int HB = HeightBackpack.nextInt();
        System.out.println("Введите ширину рюкзака (см) : ");
        int WB = WidthBackpack.nextInt();
        System.out.println("Введите длину рюкзака (см) : ");
        int LB = LengthBackpack.nextInt();
        System.out.println("\nВведите параметры сумки: ");
        System.out.println("Введите высоту сумки  (см) : ");
        int HBg = HeightBag.nextInt();
        System.out.println("Введите ширину сумки (см) : ");
        int WBg = WidthBag.nextInt();
        System.out.println("Введите длину сумки (см) : ");
        int LBg = LengthBag.nextInt();
*/