package ru.otus.project;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //первое
        int m = 7;
        String txt = "some text";
        printText(m, txt);

        printBreakLine();

        //второе
        int[] arr  = new int[10];
        for (int i = 0; i < 9; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        summValueArrMoreThanFive(arr);

        printBreakLine();

        int[] arr4 = new int[10];
        System.arraycopy(arr, 0, arr4, 0, arr.length);

        //третье
        int[] arr2 = new int[10];
        arr2  = arr;
        fillArray(7, arr2);
        printArray(arr2);

        printBreakLine();

        //четвертое
        int[] arr3 = new int[10];
        arr3  = arr;

        summValueArr(3, arr3);

        printArray(arr3);
        printBreakLine();

        //пятое
        //int[] arr4  = arr;
        whichHalfIsBigger(arr4);

    }

    public static void printText(int m, String txt) {
        for (int i = 0; i < m; i++) {
            System.out.println(txt);
        }
    }
    public static void summValueArrMoreThanFive(int @NotNull [] arr) {
        int summResult = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                summResult = summResult + arr[i];
            }
        }
        printArray(arr);
        System.out.println(summResult);
    }
    public static void fillArray(int a, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
        }
    }
    public static void summValueArr(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + a;
        }
    }
    public static void whichHalfIsBigger(int[] arr){
        int a, b;
        a = 0;
        b = 0;

        for (int i = 0; i < 5; i++) {
            a = a + arr[i];
        }
        for (int i = 5; i < 10; i++) {
            b = b + arr[i];
        }

        if (a > b) {
            System.out.println("сумма первой половины больше");
        } else if (b > a) {
            System.out.println("сумма второй половины больше");
        }
        else {
            System.out.println("сумма половин равна");
        }

    }

    //********************************************************
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|"+arr[i]);
            System.out.print("|");
        }
        System.out.println();
    }
    public static void printBreakLine(){
        System.out.println("===========================================================");
    }
}
