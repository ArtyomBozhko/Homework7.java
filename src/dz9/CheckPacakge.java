package dz9;



import java.util.Scanner;

public class CheckPacakge {




    //public static int InputParametrs(int HB, int WB, int LB, int HBg,  int WBg ,int LBg ){

    public static void check(int HB, int WB, int LB, int HBg, int WBg, int LBg) {
         if(HB > 53 || WB > 22 || LB > 40) {
             System.out.println("\n У вас слишком большой багаж!"+"\nВысота: " + HB + " (Допустимо 53)" + "\nШирина: " + WB + " (Допустимо 22)" + "\nДлина: " + LB + " (Допустимо 40)");
             System.out.println("Size Bag Error");
             return;
         }
         if (HBg > 40 || WBg > 20 || LBg > 55){
             System.out.println("\n У вас слишком большой багаж!"+"\nВысота: " + HBg + " (Допустимо 53)" + "\nШирина: " + WBg + " (Допустимо 22)" + "\nДлина: " + LBg + " (Допустимо 40)");
             System.out.println("Size Bagpack Error");
             return;
         }
        System.out.println("\nВысота Багажа: " + HB +"\nШирина Багажа: " + WB  + "\nДлина Багажа: " + LB);
        System.out.println("\nВысота Сумки: " + HBg +"\nШирина Сумки: " + WBg  + "\nДлина Сумки: " + LBg);
        System.out.println("Size normal");

    }





}
