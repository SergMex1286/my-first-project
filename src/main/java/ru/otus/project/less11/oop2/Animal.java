package ru.otus.project.less11.oop2;

public abstract class Animal {
    String name;
    float runSpeed, swimSpeed;
    int endurance;

    public Animal(String name, int endurance, float runSpeed, float swimSpeed){
        this.name = name;
        this.endurance = endurance;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println(name);
        System.out.println("Скорость бега: " + runSpeed);
        System.out.println("Скорость плавания: " + swimSpeed);
        System.out.println("остаток выносливости: " + endurance);
        System.out.println();
    }

    public float run(int distance){

        int result = endurance - distance;

        if (result < 0){
            System.out.println("не хватает выносливости для бега");
            return -1;
        }
        else {
            endurance =--distance;
            System.out.println(name + " пробежался: " + distance + "м.");
            return distance / runSpeed;
        }
    }

    public abstract float swim(int distance);

}
