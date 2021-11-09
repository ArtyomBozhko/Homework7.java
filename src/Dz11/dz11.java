package Dz11;

public class dz11 {
    public static void main(String[] args) {



      for (int a = 1;a <= 100;a++)
       {
           String b = String.valueOf(a);
           int c = b.indexOf('4');
           int d = b.indexOf('9' );
           if(c == 1 || c == 0)
           {
               b = "";
           }
           else if (d == 1 || d == 0)
           {
               b = "";
           }
          System.out.print( " " + b);

       }
    }
}
