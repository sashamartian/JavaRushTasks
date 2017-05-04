package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        Integer in = Integer.parseInt(bufferedReader.readLine());

        if (in > 0) {
            System.out.println(in * 2);
        } else if (in < 0) {
            System.out.println(in + 1);
        } else {
            System.out.println(in);
        }
    }

}