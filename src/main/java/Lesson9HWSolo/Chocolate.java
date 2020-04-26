package Lesson9HWSolo;

import lesson.AbstractProduct;

public class Chocolate extends AbstractProduct {
    private double bars;

    public Chocolate(String name, double price, double bars) {
        super(name, price);
        this.bars = bars;
    }

    public double getBars() {
        return bars;
    }
    public void setBars(double bars) {
        this.bars = bars;
    }

}