package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle rec) {
        this.left = rec.left;
        this.top = rec.top;
        this.width = rec.width;
        this.height = rec.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.initialize(1, 1, 1, 1);
    }
}
