package ru.otus.basic.homeworks.lesson1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, answer;
        boolean D;

        while (true) {

            System.out.println("===============================================");
            System.out.println("Ведите номер процедуры соттветствующий списку: ");
            System.out.println("(1) greetings");
            System.out.println("(2) checkSign (A, B, C)");
            System.out.println("(3) selectColor");
            System.out.println("(4) compareNumbers");
            System.out.println("(5) addOrSubtractAndPrint");
            System.out.println("Если хотите выйти из программы введите любое другое число");
            System.out.println("===============================================");

            answer = scanner.nextInt();

            System.out.println("###############################################");
            System.out.println();

            if (answer == 1){

                greetings();

            } else if (answer == 2) {

                System.out.println("Введите число A:");
                A = scanner.nextInt();
                System.out.println("Введите число B:");
                B = scanner.nextInt();
                System.out.println("Введите число C:");
                C = scanner.nextInt();
                checkSign(A, B, C);

            } else if (answer == 3) {

                selectColor();

            } else if (answer == 4) {

                compareNumbers();

            } else if (answer == 5) {

                System.out.println("Введите значение initValue:");
                A = scanner.nextInt();
                System.out.println("Введите значение delta:");
                B = scanner.nextInt();
                System.out.println("Введите значение increment:");
                D = scanner.nextBoolean();

                addOrSubtractAndPrint(A, B, D);

            } else {
                break;
            }
            System.out.println();
            System.out.println("###############################################");
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
