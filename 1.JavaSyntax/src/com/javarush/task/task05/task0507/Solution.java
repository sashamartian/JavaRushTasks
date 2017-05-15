package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Float input = Float.parseFloat(reader.readLine());
        Float summ = 0f;
        Float count = 0f;
        while (input != -1) {
            summ += input;
            count++;
            input = Float.parseFloat(reader.readLine());
        }
        System.out.println(summ / count);
    }
}

