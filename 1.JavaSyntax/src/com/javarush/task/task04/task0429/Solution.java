package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count_minus = 0;
        int count_plus = 0;

        int a = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int b = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int c = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        if (a >= 0) {
            ++count_plus;
        } else {
            ++count_minus;
        }

        if (b >= 0) {
            ++count_plus;
        } else {
            ++count_minus;
        }

        if (c >= 0) {
            ++count_plus;
        } else {
            ++count_minus;
        }

        System.out.println("количество отрицательных чисел: " + count_minus);
        System.out.println("количество положительных чисел: " + count_plus);
    }
}
