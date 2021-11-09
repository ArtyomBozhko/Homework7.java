package homework7;

import static homework7.Person.personInfo;

public class Homework7 {
    public static void main(String[] args) {


        personInfo("Will " , "Smith" ,"New York","2936729462846");
        personInfo("Jackie " , "Chan" ,"Shanghai","12312412412");
        personInfo("Sherlock " , "Holmes" ,"London","37742123513");

    }




}

/*
Сделать класс Person и в нем метод personInfo()

На вход передавать ему четыре параметра: имя, фамилию, город, телефон

Внутри метода формировать строку в формате:

Позвонить гражданину + ИМЯ ФАМИЛИЯ + из города + ГОРОД + можно по номеру + ТЕЛЕФОН

Метод должен возвращать String

В main-методе сделать три вызова метода personInfo, каждый раз передавая нового человека;

Должен получиться вывод такого типа:

Позвонить гражданину Will Smith из города New York можно по номеру 2936729462846.

Позвонить гражданину Jackie Chan из города Shanghai можно по номеру 12312412412.

Позвонить гражданину Sherlock Holmes из города London можно по номеру 37742123513.
 */