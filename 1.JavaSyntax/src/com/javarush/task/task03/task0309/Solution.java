package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int res;
        for (int i = 1; i <= 10; i++) {
            res = 0;
            for (int j = 1; j <= i; j++) {
                res = res + j;
            }
            System.out.println(res);
        }
    }
}
