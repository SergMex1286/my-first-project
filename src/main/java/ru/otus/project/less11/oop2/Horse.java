package ru.otus.project.less11.oop2;

public class Horse extends Animal{
    public Horse(String name, int endurance, float rnSpeed, float swSpeed) {
        super(name, endurance, rnSpeed, swSpeed);
    }
    @Override
    public float swim(int distance) {
        int result = endurance - 4;

        if (result < 0){
            System.out.println("не хватает выносливости для заплыва");
            return -1;
        }
        else {
            endurance = result;
            System.out.println(name + " проплыл: " + distance + "м.");
            return distance / rnSpeed;
        }
    }

}
