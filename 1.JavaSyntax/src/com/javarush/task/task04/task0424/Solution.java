package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        if (num1 != num2 && num1 != num3) {
            System.out.println(1);
        }

        if (num2 != num1 && num2 != num3) {
            System.out.println(2);
        }

        if (num3 != num2 && num3 != num1) {
            System.out.println(3);
        }
    }
}
