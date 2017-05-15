package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine(); //читаем строку с клавиатуры
        int y = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int m = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int d = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
