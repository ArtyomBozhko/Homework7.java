package Dz17;

import java.io.OptionalDataException;
import java.util.Scanner;

import static Dz17.Methods. Massivs;
import static Dz17.Methods.Sort;


public class dz17 {
    public static void main(String[] args) {
        int a1[] = new int[7];
        int a[] = new int[7];
        Massivs(a1,a);
        Sort(a1,a);

    }
}

/*
Сделать два массива из 7-ми чисел, заполненных случайными цифрами (от 0 до 9).
Первый массив - это числа загаданные компанией(рэндом), которая организовывает лотерею.
Второй массив - это числа которые угадал игрок (вводим из консоли).
После того как оба массива заполнены цифрами, нужно отсортировать их по возрастанию любым способом.

В отсортированных массивах найти количество совпадений, т.е. чисел в двух массивах с одинаковым индексом; Например:
first[3] должен быть равен second[3], как показано ниже.
Пример вывода в консоль (совпали 1й, 4й и 6й элементы):
[0, 1, 4, 5, 5, 8, 9]
[1, 1, 2, 3, 5, 6, 9]
Количество совпадений: 3



 */