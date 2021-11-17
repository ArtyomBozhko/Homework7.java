package Dz18;

import java.util.Arrays;

public class metods {
public static void Check(int[] a){
    int calc=0;
    for(int i = 0;i <= a.length-1;i++)
    {
        if(a[i] == 0)
        {
            a[i] = a[calc];
            a[calc] = 0;
            calc++;


        }
    }
    System.out.println(Arrays.toString(a));

}
}
