package ru.otus.project.less12.oop3;

public class MainApp {
    public static void main(String[] args) {

        Plate plate1 = new Plate(100);
        System.out.println(plate1);

        Cat cats[] = new Cat[4];
        cats[0] = new Cat("Барсик", 20);
        cats[1] = new Cat("Мурзик", 25);
        cats[2] = new Cat("Пупсик", 35);
        cats[3] = new Cat("Smoke", 25);

        for (int i = 0; i < cats.length; i++) {

            cats[i].eat(plate1);
            System.out.println(cats[i]);

        }
        plate1.AddFood(10);
        cats[3].eat(plate1);
        System.out.println(cats[3]);
        System.out.println(plate1);

    }
}
