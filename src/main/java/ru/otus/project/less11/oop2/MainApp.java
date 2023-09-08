package ru.otus.project.less11.oop2;

public class MainApp {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.info();

        Dog dog = new Dog();
        dog.setName("Bublik");
        dog.info();

    }
}
