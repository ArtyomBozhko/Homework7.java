package homework9;


public class AverageScore {



    public static int CalculateScholarship(int M, int U, int R, int H, int E){
        int Summ = (M+U+R+H+E) / 5;
        return Summ;


    }
    public static int Output(int summ){
        if(summ >= 10)
        {
            System.out.println("вы получаете повышеную стипендию");
        }
        else if(summ >=8)
        {
            System.out.println("вы получаете обычную стипендию");
        }
        else
        {
            System.out.println("вы неполучаете никакую стипендию");
        }
        return 0;

    }



    public static void printMessage(String message) {
        System.out.println(message);
    }

}


/*
Выяснить получит ли студент повышенную стипендию, просто стипендию или не получит стипендию вообще в зависимости от его оценок.



Пользователь вводит через консоль свои оценки по 5 предметам(любым).



Для повышеной стипендии средний балл должен быть не меньше 10

Для обычной стипендии - не меньше 8



Программа должна вывести на экран средний бал и на какую стипендию может рассчитывать студент.
 */