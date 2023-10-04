package ru.otus.project.less12.oop3;

public class Plate {

    private int currentAmountFood, maxAmountFood;

    public Plate(int maxAmountFood) {
        this.currentAmountFood = maxAmountFood;
        this.maxAmountFood =     maxAmountFood;
    }

    public void AddFood(int amountFood){

        if ( (currentAmountFood + amountFood) > maxAmountFood ){
            System.out.println("too much food");
        }
        else {
            currentAmountFood += amountFood;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "текущее количество еды в тарелке: " + currentAmountFood +
                '}';
    }

    public boolean EatFood(int amountFood){
        if ( (currentAmountFood - amountFood) < 0 ){
            return false;
    }
        else{
        currentAmountFood -= amountFood;
        return true;
        }
    }
}
