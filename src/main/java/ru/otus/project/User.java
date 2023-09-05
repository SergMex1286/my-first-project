package ru.otus.project;

public class User {

    private String firstName, lastName, surname, email;
    private int yearBirth;

    public User(String firstName, String lastName, String surname, String email, int yearBirthd) {

        this.email      = email;
        this.lastName   = lastName;
        this.surname    = surname;
        this.firstName  = firstName;
        this.yearBirth  = yearBirthd;

    }

    public void info() {

        System.out.println("Ф.И.О.: " + firstName + " " + lastName + " " + surname);
        System.out.println("Год рождения: " + yearBirth);
        System.out.println("E-Mail: " + email);

    }

    public int getAge() {
        return 2023-yearBirth;
    }
}
