package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.age * this.weight * this.strength > anotherCat.age * anotherCat.weight * anotherCat.strength) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat catVaska = new Cat();
        catVaska.name = "Vaska";
        catVaska.age = 1;
        catVaska.weight = 1;
        catVaska.strength = 1;

        Cat catBarsik = new Cat();
        catVaska.name = "Barsik";
        catVaska.age = 2;
        catVaska.weight = 2;
        catVaska.strength = 2;

        System.out.println(catVaska.fight(catBarsik));
        System.out.println(catBarsik.fight(catVaska));
    }
}
