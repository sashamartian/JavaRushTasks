package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
    String name, color, address;
    int hight;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }

    public void initialize(String name, int hight, String color) {
        this.name = name;
        this.hight = hight;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.initialize("Gav");
    }
}
