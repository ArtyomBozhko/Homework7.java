package lesson11;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array size:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
