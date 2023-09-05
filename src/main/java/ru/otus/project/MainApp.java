package ru.otus.project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        //User user = new User("Сергей", "Симейко", "Анатольевич", "serg-mex@yandex.ru", 1986);
//        user.info();

        User[] users = {
                new User("Сергей", "Симейко", "Анатольевич", "serg-mex@yandex.ru", 1986),
                new User("Андрей", "Андреев", "Андреевич", "xxx@xxx.xxx", 1976),
                new User("Иванов", "Иван", "Иванович", "xxx@xxx.xxx", 1996),
                new User("Петров", "Петр", "Петрович", "xxx@xxx.xxx", 1956)
        };

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40) {
                users[i].info();
            }
        }



    }
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("From");
        System.out.println("Java");
        }
    public static void checkSign(int A, int B, int C){
        int result = A+B+C;
        if (result >= 0) {

            System.out.println("(A + B + C = " + result + ") Сумма положительная");
        }else{
            System.out.println("(A + B + C = " + result + ") Сумма отрицательная");
        }
    }
    public static void selectColor(){
        int data = (int) (Math.random() * 30);
        if (data >= 0 && data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int A = (int) (Math.random() * 30);
        int B = (int) (Math.random() * 30);
        if ( A>= B){
            System.out.println("A("+A+") >= B("+B+")");
        }else {
            System.out.println("A("+A+") < B("+B+")");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
        }else {result = initValue - delta;}
        System.out.println("Результат вычисления: " + result);
    }
}
