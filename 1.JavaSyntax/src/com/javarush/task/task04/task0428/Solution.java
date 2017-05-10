package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        int a = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int b = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int c = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        if (a > 0) {
            ++count;
        }

        if (b > 0) {
            ++count;
        }

        if (c > 0) {
            ++count;
        }

        System.out.println(count);
    }
}
