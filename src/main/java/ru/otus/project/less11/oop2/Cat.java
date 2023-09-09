package ru.otus.project.less11.oop2;

public class Cat extends Animal {
    public Cat(String name, int endurance, float rnSpeed, float swSpeed) {
        super(name, endurance, rnSpeed, swSpeed);
    }
    @Override
    public float swim(int distance) {
        System.out.println("коты не умеют плавать");
        return -1;
    }
}
