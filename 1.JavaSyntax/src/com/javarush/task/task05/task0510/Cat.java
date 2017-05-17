package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name, color, address;
    int weight, age;

    public void initialize(String name) {
        this.name = name;
        this.weight = 1;
        this.age = 1;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = 1;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 1;
    }

    public void initialize(int weight, String color, String address) {
        this.color = color;
        this.weight = weight;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.initialize("Vaska");
    }
}
