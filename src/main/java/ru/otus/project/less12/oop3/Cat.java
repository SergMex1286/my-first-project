package ru.otus.project.less12.oop3;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "имя:'" + name + '\'' +
                ", аппетит: " + appetite +
                ", кот сыт: " + satiety +
                '}';
    }

    public void eat(Plate plate){

        if (plate.EatFood(appetite)){
            satiety = true;
            System.out.println("Кот: " + name + " поел");
        }
        else {
            System.out.println("too little food");
        }

    }

}
