package com.senla.brest.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        double number = 0;
        boolean integ = true;
        Scanner sc = new Scanner(System.in);
        do {
            integ = true;
            //вводим целое число
            System.out.println("Введите целое число:");
            number = sc.nextDouble();
            // проверка на целое число
            if (number % 1 != 0) {
                System.out.println("Введеное число не целое, повторите ввод.");
                integ = false;
            }
        } while(integ == false);
        sc.close();

        double value = number;
        //минимальный делитель
        int firstDivisor = 2;
        while (value > 1 && firstDivisor <= Math.sqrt(number))
        {
            if (value % firstDivisor == 0)
            {
                //выводим делитель если число делится
                System.out.print(firstDivisor + " ");
                //уменьшаем введенное число
                value /= firstDivisor;
            }
            //увеличиваем делитель если прошлый не подошел
            else if (firstDivisor == 2)
            {
                firstDivisor++;
            }
            else
            {
                firstDivisor += 2;
            }
        }
        if (value != 1)
        {
            //выводим последний простой делитель
            System.out.print((int)value);
        }

    }
}
