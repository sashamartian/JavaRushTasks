package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int num2 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int num3 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        int n;

        if (num2 > num1) {
            n = num1;
            num1 = num2;
            num2 = n;
        }

        if (num3 > num2) {
            n = num2;
            num2 = num3;
            num3 = n;
        }

        if (num2 > num1) {
            n = num1;
            num1 = num2;
            num2 = n;
        }

        if (num3 > num2) {
            n = num2;
            num2 = num3;
            num3 = n;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
