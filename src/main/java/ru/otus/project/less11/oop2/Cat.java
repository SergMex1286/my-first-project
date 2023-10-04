package ru.otus.project.less11.oop2;

public class Cat extends Animal {
    public Cat(String name, int endurance, float runSpeed, float swimSpeed) {
        super(name, endurance, runSpeed, swimSpeed);
    }
    @Override
    public float swim(int distance) {
        System.out.println("коты не умеют плавать");
        return -1;
    }
}
