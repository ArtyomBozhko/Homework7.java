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
        /*
        for(int g = 0;g <=a-1;g++)
        {
            if(i[g] < i[g+1])
            {
                cal++;
            }
        }
        
         */
        /*for (int g:i) {
            int f = 1;
            f++;
          if(i[g] < i[f])
          {
              cal++;
          }
        }

         */

        boolean cal;
        for (int g = 0; g < a; g++) {
            for (int k = 1; k < a; k++) {
                if (i[g] < i[k]) {
                    cal = true;

                }

            }
        }

        if(cal = true)
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