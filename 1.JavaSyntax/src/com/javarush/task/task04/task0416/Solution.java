package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double minute = Double.parseDouble(br.readLine());
        Double ostatok = minute % 5;

        if (ostatok >= 0 && ostatok < 3) {
            System.out.println("зелёный");
        }
        else if (ostatok >= 3 && ostatok < 4) {
            System.out.println("желтый");
        }
        else {
            System.out.println("красный");
        }
    }
}