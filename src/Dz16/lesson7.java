package Dz16;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lesson7 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Введите слово:");
        String b = scan1.nextLine();
        System.out.println("Введите слово:");
        String a = scan1.nextLine();
        String[] str = {b,a};
        String c= reverseString(str[1]);

        if(Objects.equals(str[0], c))
        {
            System.out.println(str[0]+" является палиндромом слову "+reverseString(str[1]));
        }
        else
        {
            System.out.println("\nне является палиндромом");
        }


    }

    private static String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }




}
