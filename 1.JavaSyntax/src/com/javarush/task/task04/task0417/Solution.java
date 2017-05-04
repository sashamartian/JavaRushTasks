package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = Integer.parseInt(br.readLine());
        Integer num2 = Integer.parseInt(br.readLine());
        Integer num3 = Integer.parseInt(br.readLine());

        if (num1 == num2 && num1 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        if (num1 == num2 && num1 != num3) {
            System.out.println(num1 + " " + num2);
        }
        if (num1 == num3 && num1 != num2) {
            System.out.println(num1 + " " + num3);
        }
        if (num2 == num3 && num2 != num1) {
            System.out.println(num2 + " " + num3);
        }
    }
}