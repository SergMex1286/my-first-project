package ru.otus.project.less11.oop2;

public class Horse extends Animal{
    public Horse(String name, int endurance, float runSpeed, float swimSpeed) {
        super(name, endurance, runSpeed, swimSpeed);
    }
    @Override
    public float swim(int distance) {
        int result = endurance - (4*distance);

        if (result < 0){
            System.out.println("не хватает выносливости для заплыва");
            return -1;
        }
        else {
            endurance = result;
            System.out.println(name + " проплыл: " + distance + "м.");
            return distance / swimSpeed;
        }
    }

}
