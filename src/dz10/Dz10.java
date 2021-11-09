package dz10;

public class Dz10 {

    public static void main(String[] args) {
        int i = 1, j = 1, temp;
        System.out.print(i +" "+ j);
        for (int g = 0; g < 9; g++) {
            temp = i;
            i = j;
            j = i + temp;
            System.out.print( " "+j);
        }


    }



}
