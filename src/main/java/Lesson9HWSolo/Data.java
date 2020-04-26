package Lesson9HWSolo;

import lesson.AbstractProduct;
import lesson.AbstractShop;

public class Data {
    public static void main(String[] args) {
        ChocolateShop ChocoFarm = new ChocolateShop("Milk chocolate");
        AbstractProduct MilkyWay = new Chocolate("MilkyWay", 200, 2);
        ChocoFarm.addChocolate(MilkyWay, 5);
        ChocoFarm.printAllProducts();

    }
}

