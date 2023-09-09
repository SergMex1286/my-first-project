package ru.otus.project.less11.oop2;

public abstract class Animal {
    String name;
    float rnSpeed, swSpeed;
    int endurance;

    public Animal(String name, int endurance, float rnSpeed, float swSpeed){
        this.name = name;
        this.endurance = endurance;
        this.rnSpeed = rnSpeed;
        this.swSpeed = swSpeed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println(name);
        System.out.println("Скорость бега: " + rnSpeed);
        System.out.println("Скорость плавания: " + swSpeed);
        System.out.println("остаток выносливости: " + endurance);
        System.out.println();
    }

    public float run(int distance){

        int result = endurance - 1;

        if (result < 0){
            System.out.println("не хватает выносливости для бега");
            return -1;
        }
        else {
            endurance--;
            System.out.println(name + " пробежался: " + distance + "м.");
            return distance / rnSpeed;
        }
    }

    public abstract float swim(int distance);

}
