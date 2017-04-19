package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int x = min(a, b);
        int y = min(c, d);
        return min(x, y);
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a < b)
            return a;
        return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}