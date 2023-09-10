package ru.otus.project;

public class MainApp {
    public static void main(String[] args) {

        User[] users = {
                new User("Сергей", "Симейко", "Анатольевич", "serg-mex@yandex.ru", 1986),
                new User("Андрей", "Андреев", "Андреевич", "an@yandex.ru", 1976),
                new User("Иванов", "Иван", "Иванович", "iv@yandex.ru", 1996),
                new User("Петров", "Петр", "Петрович", "pet@yandex.ru", 1956),
                new User("Сидоров", "Сидр", "Сидорович", "sid@@yandex.ru", 1946)
        };

        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40) {
                users[i].info();
            }
        }

        System.out.println("=================================================================");
        System.out.println();

        Box someBox = new Box(3,5,7,"green");
        someBox.info();
        someBox.setItem("отвёртка");
        someBox.info();
        someBox.setItem("молоток");
        someBox.Open();
        someBox.setItem("молоток");
        someBox.delItem();
        someBox.setItem("молоток");
        someBox.setColor("black");
        someBox.info();

    }
}
