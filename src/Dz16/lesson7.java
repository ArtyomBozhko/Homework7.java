package Dz16;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lesson7 {
    public static void main(String[] args) {
        String str = "А роза упала на лапу азора";
        String str2 = "Ароза упала на лапу азора";
        System.out.println(str +"\n"+str2);
        if(str.startsWith("А роза") && str.endsWith(" азора")){
            System.out.println("\nПервая строка является палиндромом");

        }
        if(str2.startsWith("А роза") != str2.endsWith(" азора")) {
            System.out.println("\nВторая  строка не является палиндромом");
        }
        else {
            System.out.println("Произошла ошибка ! Обе строки не являются палиндромом ");
        }
    }



}
