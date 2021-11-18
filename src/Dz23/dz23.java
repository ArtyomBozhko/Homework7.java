package Dz23;
import java.util.Scanner;

public class dz23 {
    public static void main(String[] args) {
        char[] a = new char[8];
        System.out.println("Сколько паролей вы хотите? ");
        randomChoice(a);
    }
    public static void randomChoice(char[] a) {
        Scanner scan1 = new Scanner(System.in);
        int e = scan1.nextInt();
        int b;
        for (int g = 0; g <= e; g++) {
            for (int i = 0; i <= a.length - 1; i++) {
                int random = (int) (Math.random() * 4);

                if (random == 0) {
                    b = 65 + (int) (Math.random() * 25);
                    char c = (char) b;
                    a[i] = c;
                } else if (random == 1) {
                    b = 97 + (int) (Math.random() * 25);
                    char c = (char) b;
                    a[i] = c;
                } else if (random == 2) {
                    b = 48 + (int) (Math.random() * 9);
                    char c = (char) b;
                    a[i] = c;
                } else if (random == 3) {
                    b = 95;
                    char c = (char) b;
                    a[i] = c;
                }
            }
            System.out.println("Password #" + g + ": " + String.valueOf(a));
        }
    }
}
