package mission.c_oop.beverage.coffee;

import mission.c_oop.beverage.Beverage;

public class Cappuccino extends Beverage {
    private String name = "카푸치노";
    private int price = 4500;
    private int menuNum = 4;

    public String printMenu() {
        return this.menuNum + ". " + this.name + ": " + this.price + "원";
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}