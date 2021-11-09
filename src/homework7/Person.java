package homework7;

public class Person {
    public static String personInfo(String name,String SureName,String City,String tellNumber){
        String a = "\nПозвонить гражданину: "+name + SureName + "\nиз города: " + City+ "\nможно по номеру: " + tellNumber;
        System.out.println(a);
        return a;
    }
}
