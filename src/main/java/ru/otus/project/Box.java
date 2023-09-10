package ru.otus.project;

public class Box {
    private int width;
    private int depth;
    private int height;
    private String color;
    private String item;
    private boolean status;



    public Box(int width, int depth, int height, String color) {

        this.width  = width;
        this.depth  = depth;
        this.height = height;
        this.color  = color;
        this.item = "пусто";
        this.status = true;

    }

    public void info() {

        System.out.println("Ширина: "    + width);
        System.out.println("Высота: "    + height);
        System.out.println("Глубина: "   + depth);
        System.out.println("Цвет: "      + color);
        if (status)
            System.out.println("Коробка открыта");
        else
            System.out.println("Коробка закрыта");
        System.out.println("Содержимое: "+ item);

        System.out.println();

    }

    public void setItem(String item) {

        if (this.status == false) {
            System.out.println("коробка закрыта, сначала откройте коробку");
            System.out.println();
            return;
        }

        if (this.item.equals("пусто")){
            this.item = item;
            this.status = false;
            System.out.println("в коробку положили предмет: " + item);
            System.out.println();
        }
        else {
            System.out.println("коробка уже занята предметом: " + this.item);
            System.out.println();
        }

    }

    public void setColor(String color) {

        this.color = color;
        System.out.println("Установлен цвет: "+ color);
        System.out.println();

    }

    public void delItem() {

        this.item = "пусто";
        System.out.println("предмет удален");
        System.out.println();

    }

    public void Open() {

        this.status = true;
        System.out.println("коробка открыта");
        System.out.println();

    }

    public void Close() {

        this.status = false;
        System.out.println("коробка закрыта");
        System.out.println();

    }
}
