package homework.home;

import javax.swing.*;
import java.lang.reflect.Method;

public class work {




    public static void main(String[] args) {



        printMessage("\nПервый самолет" + printAirplaneInfo( "\n" +"Тип самолета: Jet" + "\n" , "модель: F-22 Raptor"));
        printMessage("\nВторой самолет" + printAirplaneInfo( "\n" +"Тип самолета: Airliner" + "\n" , "модель:  Aerobus 737" +"\n"+"кол.пасажиров эконом класса: ",120 ));
        printMessage("\nВторой самолет" + printAirplaneInfo( "\n" +"Тип самолета: Airliner" + "\n" , "модель:  Boeing 777" +"\n"+"кол.пасажиров эконом класса: " ,180,"\nпассажиров бизне скласса: " ,  28));
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static String printAirplaneInfo(String type, String model){
       return type + model;

    }
        public static String printAirplaneInfo (String type, String model,int a){
            return type + model + a;

        }
    public static String printAirplaneInfo (String type, String model,int a,String space,int b){
        return type + model + a + space + b;

    }


}



/*
    Авиакомпания изготавливает три типа самолётов:

        Истребители - не имеют пассажирских мест

        Пассажирские самолёты #1 - имеют места только эконом класса

        Пассажирские самолёты #2 - имеют места эконом и бизнесс класса

        Нужно сделать три метода с одинаковым названием printAirplaneInfo(),
        который будет выводить информацию о самолётах всех трех типов.

        На вход каждый метод будет принимать разное количество параметров:

        название самолета, тип самолета

        название самолета, тип самолета, количество мест эконом класса

        название самолета, тип самолета, количество мест эконом класса,
        количество мест бизнес класса

        Программа должна выводить на экран такой результат (пример):



        Тип самолета: Jet,
        модель: F-22 Raptor,

        Тип самолета: Airliner,
        модель: Aerobus 737,
        кол.пасажиров эконом класса: 120

        Тип самолета: Airliner,
        модель: Boeing 777,
        ко  пасажиров эконом класса: 180,
        пассажиров бизне скласса: 28

 */