package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        boolean i = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int b = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int c = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        if (a + b > c) {
            if (b + c > a) {
                if (a + c > b) {
                    i = true;
                }
            }
        }

        if (i) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}