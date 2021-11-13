package com.senla.brest.task1;

import java.util.Scanner;

public class task1methods {
    public static void main(String[] args) {
        String str = input();
        sumOfNumbers(str);

    }

    public static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        //вводим заданную строку
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    public static void sumOfNumbers(String str){
        //переводим заданную строку в массив char
        char[]chArray = str.toCharArray();
        //задаем переменную для подсчета искомой суммы цифр
        int sum = 0;
        //задаем int переменную
        int number = 0;
        for (int i = 0; i < chArray.length; i++) {
            //если элемент в массиве char равен цифре
            if (chArray[i] == '0'|| chArray[i] == '1'||chArray[i] == '2'|| chArray[i] == '3'||chArray[i] == '4'||
                    chArray[i] == '5'||chArray[i] == '6'|| chArray[i] == '7'||chArray[i] == '8'|| chArray[i] == '9') {
                //переводим char в int
                number = Integer.parseInt(String.valueOf(chArray[i]));
                //увеличиваем искомую сумму на найденное число
                sum += number;
            }
        }
        System.out.println("Сумма цифр присутствующих в введенной строке равна " + sum);
    }
}
