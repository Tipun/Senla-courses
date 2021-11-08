package com.senla.brest.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим предложение.
        System.out.println("Введите предложение русскими буквами, разделитель пробел \" \".");
        String str = sc.nextLine();
        //разделяем предложения на слова
        String [] words = str.split(" ");
        for (int i = 0; i < words.length ; i++) {
            for (int j = 0; j < words[i].length() ; j++) {

            }
        }
    }
}
