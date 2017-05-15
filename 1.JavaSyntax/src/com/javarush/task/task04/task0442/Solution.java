package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int num = 0;

        while (true) {
            num = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

            sum += num;

            if (num == -1)
                break;
        }

        System.out.println(sum);
    }
}
