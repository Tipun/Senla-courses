package com.senla.brest.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //вводим предложение.
        System.out.println("Введите предложение русскими буквами, разделитель пробел \" \".");
        String str = sc.nextLine();
        //разделяем предложения на слова
        String[] words = str.split(" ");
        int count1 = 0;
        //создаем массив integer где будут хранится количества гласных букв в словах
        Integer[] nums = new Integer[words.length];
        //заполняем данный массив
        for (int i = 0; i < words.length; i++) {
            count1 = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == 'а' || words[i].charAt(j) == 'о' || words[i].charAt(j) == 'э' ||
                        words[i].charAt(j) == 'е' || words[i].charAt(j) == 'и' || words[i].charAt(j) == 'ы' ||
                        words[i].charAt(j) == 'у' || words[i].charAt(j) == 'ё' || words[i].charAt(j) == 'ю' ||
                        words[i].charAt(j) == 'я' || words[i].charAt(j) == 'А' || words[i].charAt(j) == 'О' ||
                        words[i].charAt(j) == 'Э' || words[i].charAt(j) == 'Е' || words[i].charAt(j) == 'И' ||
                        words[i].charAt(j) == 'Ы' || words[i].charAt(j) == 'У' || words[i].charAt(j) == 'Ё' ||
                        words[i].charAt(j) == 'Ю' || words[i].charAt(j) == 'Я') {
                    count1++;
                }
            }
            nums[i] = count1;
        }
        //сортируем массив Integer по убыванию
        Arrays.sort(nums, Collections.<Integer>reverseOrder());
        //создаем массив в котором будут хранится слова предложения по убыванию количества гласных букв
        String[] wordsSort = new String[words.length];
        //создаем коллекцию и копируем в него введенное предложение
        ArrayList<String> wordsArray = new ArrayList<String>();
        for (String s : words) {
            wordsArray.add(s);
        }

        int count = 0;
        for (int m = 0; m < wordsSort.length; m++) {
            two:
            for (int i = 0; i < wordsArray.size(); i++) {
                count = 0;
                for (int j = 0; j < wordsArray.get(i).length(); j++) {
                    if (wordsArray.get(i).charAt(j) == 'а' || wordsArray.get(i).charAt(j) == 'о' || wordsArray.get(i).charAt(j) == 'э' ||
                            wordsArray.get(i).charAt(j) == 'е' || wordsArray.get(i).charAt(j) == 'и' || wordsArray.get(i).charAt(j) == 'ы' ||
                            wordsArray.get(i).charAt(j) == 'у' || wordsArray.get(i).charAt(j) == 'ё' || wordsArray.get(i).charAt(j) == 'ю' ||
                            wordsArray.get(i).charAt(j) == 'я' || wordsArray.get(i).charAt(j) == 'А' || wordsArray.get(i).charAt(j) == 'О' ||
                            wordsArray.get(i).charAt(j) == 'Э' || wordsArray.get(i).charAt(j) == 'Е' || wordsArray.get(i).charAt(j) == 'И' ||
                            wordsArray.get(i).charAt(j) == 'Ы' || wordsArray.get(i).charAt(j) == 'У' || wordsArray.get(i).charAt(j) == 'Ё' ||
                            wordsArray.get(i).charAt(j) == 'Ю' || wordsArray.get(i).charAt(j) == 'Я') {
                        count++;
                    }
                    //если количество гласных в слове равно цифре из integer массива
                    if (count == nums[m]) {
                        count = 0;
                        //сохраняем это слово в массив отсортированых слов
                        wordsSort[m] = wordsArray.get(i);
                        //и удаляем слово из коллекции слов
                        wordsArray.remove(i);
                        break two;
                    }
                }
            }
        }
        //на выходе получаем отсортированный массив по количеству гласных

        for (int i = 0; i < wordsSort.length; i++) {
            firstVowelUpperCase(wordsSort[i]);
        }
    }

    //делаем первую гласную заглавной и выводим количество гласных
    public static void firstVowelUpperCase(String word) {
        int numberOfVowel = -1;
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'а' || word.charAt(i) == 'о' || word.charAt(i) == 'э' ||
                    word.charAt(i) == 'е' || word.charAt(i) == 'и' || word.charAt(i) == 'ы' ||
                    word.charAt(i) == 'у' || word.charAt(i) == 'ё' || word.charAt(i) == 'ю' ||
                    word.charAt(i) == 'я' || word.charAt(i) == 'А' || word.charAt(i) == 'О' || word.charAt(i) == 'Э' ||
                    word.charAt(i) == 'Е' || word.charAt(i) == 'И' || word.charAt(i) == 'Ы' ||
                    word.charAt(i) == 'У' || word.charAt(i) == 'Ё' || word.charAt(i) == 'Ю' ||
                    word.charAt(i) == 'Я') {
                numberOfVowel = i;
                break;
            }
        }
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == 'а' || word.charAt(j) == 'о' || word.charAt(j) == 'э' ||
                    word.charAt(j) == 'е' || word.charAt(j) == 'и' || word.charAt(j) == 'ы' ||
                    word.charAt(j) == 'у' || word.charAt(j) == 'ё' || word.charAt(j) == 'ю' ||
                    word.charAt(j) == 'я' || word.charAt(j) == 'А' || word.charAt(j) == 'О' || word.charAt(j) == 'Э' ||
                    word.charAt(j) == 'Е' || word.charAt(j) == 'И' || word.charAt(j) == 'Ы' ||
                    word.charAt(j) == 'У' || word.charAt(j) == 'Ё' || word.charAt(j) == 'Ю' ||
                    word.charAt(j) == 'Я') {
                count++;
            }
        }
        if (numberOfVowel == 0) {
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1) + " количество гласных - " + count);
        } else if (numberOfVowel == -1) {
            System.out.println(word + " количество гласных - " + count);
        } else {
            System.out.println(word.substring(0, numberOfVowel) + word.substring(numberOfVowel, numberOfVowel + 1).
                    toUpperCase() + word.substring(numberOfVowel + 1) + " количество гласных - " + count);
        }
    }

}

