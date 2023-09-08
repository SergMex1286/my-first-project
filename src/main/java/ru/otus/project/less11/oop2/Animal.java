package ru.otus.project.less11.oop2;

public class Animal {
    private String name;

//    public Animal(String name){
//        this.name = name;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println(name);
    }

}
