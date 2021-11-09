package Dz11;

import java.util.Scanner;

public class original {


    public static void main(String[] args) {
        Scanner Playernumber = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        System.out.println(number);
        int PlNum;
        System.out.println("\nВведите число от 0 до 10");
        do {
            PlNum = Playernumber.nextInt();
            if(PlNum < number)
            {
                System.out.println("Больше =)");
            }
            else if(PlNum > number)
            {
                System.out.println("Меньше =)");
            }
            else
            {
                System.out.println("Ура ! Вы угадали число ! ");
                break;
            }


        } while (PlNum != number);
    }
}
