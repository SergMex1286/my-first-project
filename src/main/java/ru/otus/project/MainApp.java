package ru.otus.project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxValue, resultSumm;
        boolean D;

        int[][] arr = new int[10][10];

        fillArr(arr);


        resultSumm = sumOfPositiveElements(arr);
        System.out.println(resultSumm);

        printArray(arr);

        printSqure(10);

        System.out.println();

        diagonalZero(arr);
        printArray(arr);

        maxValue = findMax(arr);
        System.out.println(maxValue);

        System.out.println("Сумма значений второй строки: " + summOfSecondLine(arr));
    }

    public static int summOfSecondLine(int[][] array){
        int result = 0;

        if (array[0].length < 2){return -1;}

        for (int i = 1; i < array.length; i++) {
            result =+ array[0][i];}

        return result;
    }
    public static int findMax(int[][] array){
        int result;
        if (array.length > 0){
            result = array[0][0]; }
        else {
            result = 0;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>result){
                    result = array[i][j];
                }
            }
        }
        return result;
    }
    public static void diagonalZero(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                    arr[i][arr[i].length-1-j] = 0;
                }
            }
        }
    }
    public static void printSqure(int size){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public static void fillArr(int arr[][]){
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = x;
                x++;
            }
        }
    }
    public static int sumOfPositiveElements(int arr[][]){
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    result += arr[i][j];
                }

            }

        }

        return result;
    }
    public static void printArray(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
                if (arr[i][j] < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
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
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
        }else {result = initValue - delta;}
        System.out.println("Результат вычисления: " + result);
    }
}
