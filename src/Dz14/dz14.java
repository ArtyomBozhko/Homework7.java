package Dz14;


import java.util.Scanner;

public class dz14 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Кол-во чисел: ");
        int a = scan1.nextInt();
        int[] i = new int[a];

        for(int c = 0; c <=a-1;c++){
            System.out.println("\nВведите числа которые хотите занести в массив: ");
            int b = scan1.nextInt();
           i[c] = b;
            System.out.print(i[c]);
         }
        boolean cal = true;
        for(int g =1;g <= a-1;g++ )
        {
        if(i[g-1]>i[g]){
            cal = false;
            break;
        }
        }
        if(cal)
        {
            System.out.println("\nмассив строго возрастающий");
        }
        else
        {
            System.out.println("\n массив не строго возрастающий");
        }
        System.out.println("\n");
        for (int element: i) {

            System.out.print("[" + element + "] ");
        }

    }
}
    /*
    Пользователь задает последовательность целых чисел.
        Сохраните ее в массив.
        Узнать является ли последовательность строго возрастающей.
        Строго возрастающая последовательность означает, что каждое следующее число больше предыдущего.

     */