package ru.otus.project.less11.oop2;

public class MainApp {

    public static void main(String[] args) {

        Float time;

        Cat cat = new Cat("Кот", 5, 3, 0);
        cat.info();

        Dog dog = new Dog("Собака", 6,4,2);
        Horse horse = new Horse("Лошадь", 8,8,4);

        dog.info();
        time = dog.run(3);
        if (time < 0){
            System.out.println(dog.getName() + " устала");
        }
        dog.info();
        time = dog.swim(6);
        if (time < 0){
            System.out.println(dog.getName() + " устала");
        }

        cat.info();
        time = cat.run(10);
        if (time < 0){
            System.out.println(cat.getName() + " устал");
        }

        time = cat.swim(10);

        horse.info();
        time = horse.run(3);
        if (time < 0){
            System.out.println(horse.getName() + " устала");
        }
        horse.info();
        time = horse.swim(15);
        if (time < 0){
            System.out.println(horse.getName() + " устала");
        }
        horse.info();
        time = horse.swim(15);
        if (time < 0){
            System.out.println(horse.getName() + " устала");
        }
        horse.info();

    }
}
