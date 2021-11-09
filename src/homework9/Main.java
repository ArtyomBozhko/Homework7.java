package homework9;

import java.util.Scanner;

import static homework9.AverageScore.printMessage;
import static homework9.AverageScore.CalculateScholarship;
import static homework9.AverageScore.Output;

public class Main {
    public static void main(String[] args) {

        Scanner Mth = new  Scanner(System.in);
        Scanner Ukr = new Scanner(System.in);
        Scanner Rus = new Scanner(System.in);
        Scanner Hist = new Scanner(System.in);
        Scanner Eng = new Scanner(System.in);
        System.out.println("Введите бал по Математике: ");
        int M = Mth.nextInt();
        System.out.println("Введите бал по Украинскому: ");
        int U = Ukr.nextInt();
        System.out.println("Введите бал по Русскому: ");
        int R = Rus.nextInt();
        System.out.println("Введите бал по Истории: ");
        int H = Hist.nextInt();
        System.out.println("Введите бал по Английскому: ");
        int E = Eng.nextInt();


        printMessage("ваш средний бал:"+CalculateScholarship( M, U ,R ,H, E));
        int Summ = CalculateScholarship( M, U ,R ,H, E);
        Output(Summ);

    }
}
