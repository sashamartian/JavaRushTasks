package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine(); //читаем строку с клавиатуры
        int count = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        while (count > 0) {
            System.out.println(str);
            --count;
        }
    }
}
