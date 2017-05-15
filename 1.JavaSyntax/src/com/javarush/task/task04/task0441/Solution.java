package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int n2 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры
        int n3 = Integer.parseInt(reader.readLine()); //читаем строку с клавиатуры

        if (n2 > n1) {
            n = n1;
            n1 = n2;
            n2 = n;
        }

        if (n3 > n2) {
            n = n2;
            n2 = n3;
            n3 = n;
        }

        if (n2 > n1) {
            n = n1;
            n1 = n2;
            n2 = n;
        }

        if (n3 > n2) {
            n = n2;
            n2 = n3;
            n3 = n;
        }

        System.out.println(n2);
    }
}
