package com.senla.brest.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        int number = inputNumnber();
        splitOnNumbers(number);

    }

    //вводим число с клавиатуры
    public static int inputNumnber(){
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }
    //печатаем число
    public static void printNumber(String[][]num){
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    //разбиваем число на цифры и печатаем их
    public static void splitOnNumbers(int number){
        int number1 = number;
        int n = 0;
        while (number1 > 0){
            number1 /= 10;
            n++;
        }
        int[]countNumber = new int[n];
        int num = 0;

        int nNut = n;
        while(n > 0){
            num = number / (int) Math.pow(10,n - 1) % 10;
            countNumber[nNut - n] = num;
            n -= 1;
        }
        Arrays.sort(countNumber);
        int Biger = countNumber[countNumber.length - 1];
        n = nNut;
        while(n > 0){
            num = number / (int) Math.pow(10,n - 1) % 10;
            n -= 1;
            if(num == Biger) {
                switchNumberBigger(num);
            }
            else {
                switchNumber(num);
            }

        }
    }
    //условие печати цифр
    public static void switchNumber(int num) {
        String [][] num0 = {{" ","*","*","*"," "},{"*"," "," "," ","*"},{"*"," "," "," ","*"},{"*"," "," "," ","*"},{" ","*","*","*"," "}};
        String [][] num1 = {{" "," "," ","*"," "},{" "," ","*","*"," "},{" ","*"," ","*"," "},{" "," "," ","*"," "},{" "," "," ","*"," "}};
        String [][] num2 = {{"*","*","*","*","*"},{" "," "," "," ","*"},{"*","*","*","*","*"},{"*"," "," "," "," "},{"*","*","*","*","*"}};
        String [][] num3 = {{"*","*","*","*","*"},{" "," "," "," ","*"},{"*","*","*","*","*"},{" "," "," "," ","*"},{"*","*","*","*","*"}};
        String [][] num4 = {{"*"," "," "," ","*"},{"*"," "," "," ","*"},{"*","*","*","*","*"},{" "," "," "," ","*"},{" "," "," "," ","*"}};
        String [][] num5 = {{"*","*","*","*","*"},{"*"," "," "," "," "},{"*","*","*","*","*"},{" "," "," "," ","*"},{"*","*","*","*","*"}};
        String [][] num6 = {{"*","*","*","*","*"},{"*"," "," "," "," "},{"*","*","*","*","*"},{"*"," "," "," ","*"},{"*","*","*","*","*"}};
        String [][] num7 = {{"*","*","*","*","*"},{" "," "," "," ","*"},{" "," "," ","*"," "},{" "," ","*"," "," "},{" ","*"," "," "," "}};
        String [][] num8 = {{"*","*","*","*","*"},{"*"," "," "," ","*"},{"*","*","*","*","*"},{"*"," "," "," ","*"},{"*","*","*","*","*"}};
        String [][] num9 = {{"*","*","*","*","*"},{"*"," "," "," ","*"},{"*","*","*","*","*"},{" "," "," "," ","*"},{"*","*","*","*","*"}};


        switch (num){
            case 0:
                printNumber(num0);
                break;
            case 1:
                printNumber(num1);
                break;
            case 2:
                printNumber(num2);
                break;
            case 3:
                printNumber(num3);
                break;
            case 4:
                printNumber(num4);
                break;
            case 5:
                printNumber(num5);
                break;
            case 6:
                printNumber(num6);
                break;
            case 7:
                printNumber(num7);
                break;
            case 8:
                printNumber(num8);
                break;
            case 9:
                printNumber(num9);
                break;
        }
    }
    //печать самой большой цифры
    public static void switchNumberBigger(int num) {

        String [][] num0big = {{" ","0","0","0"," "},{"0"," "," "," ","0"},{"0"," "," "," ","0"},{"0"," "," "," ","0"},{" ","0","0","0"," "}};
        String [][] num1big = {{" "," "," ","1"," "},{" "," ","1","1"," "},{" ","1"," ","1"," "},{" "," "," ","1"," "},{" "," "," ","1"," "}};
        String [][] num2big = {{"2","2","2","2","2"},{" "," "," "," ","2"},{"2","2","2","2","2"},{"2"," "," "," "," "},{"2","2","2","2","2"}};
        String [][] num3big = {{"3","3","3","3","3"},{" "," "," "," ","3"},{"3","3","3","3","3"},{" "," "," "," ","3"},{"3","3","3","3","3"}};
        String [][] num4big = {{"4"," "," "," ","4"},{"4"," "," "," ","4"},{"4","4","4","4","4"},{" "," "," "," ","4"},{" "," "," "," ","4"}};
        String [][] num5big = {{"5","5","5","5","5"},{"5"," "," "," "," "},{"5","5","5","5","5"},{" "," "," "," ","5"},{"5","5","5","5","5"}};
        String [][] num6big = {{"6","6","6","6","6"},{"6"," "," "," "," "},{"6","6","6","6","6"},{"6"," "," "," ","6"},{"6","6","6","6","6"}};
        String [][] num7big = {{"7","7","7","7","7"},{" "," "," "," ","7"},{" "," "," ","7"," "},{" "," ","7"," "," "},{" ","7"," "," "," "}};
        String [][] num8big = {{"8","8","8","8","8"},{"8"," "," "," ","8"},{"8","8","8","8","8"},{"8"," "," "," ","8"},{"8","8","8","8","8"}};
        String [][] num9big = {{"9","9","9","9","9"},{"9"," "," "," ","9"},{"9","9","9","9","9"},{" "," "," "," ","9"},{"9","9","9","9","9"}};
        switch (num){
            case 0:
                printNumber(num0big);
                break;
            case 1:
                printNumber(num1big);
                break;
            case 2:
                printNumber(num2big);
                break;
            case 3:
                printNumber(num3big);
                break;
            case 4:
                printNumber(num4big);
                break;
            case 5:
                printNumber(num5big);
                break;
            case 6:
                printNumber(num6big);
                break;
            case 7:
                printNumber(num7big);
                break;
            case 8:
                printNumber(num8big);
                break;
            case 9:
                printNumber(num9big);
                break;
        }
    }
}







