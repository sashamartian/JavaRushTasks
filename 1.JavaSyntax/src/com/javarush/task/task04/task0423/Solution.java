package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine(); //читаем строку с клавиатуры
        int age = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
