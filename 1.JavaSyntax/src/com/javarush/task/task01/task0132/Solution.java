package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int s = number/100;
        int d = number/10 - s * 10;
        int e = number - s * 100 - d * 10;
        return s + d + e;
    }
}