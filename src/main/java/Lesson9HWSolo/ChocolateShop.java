package Lesson9HWSolo;

import lesson.AbstractProduct;
import lesson.AbstractShop;

public class ChocolateShop extends AbstractShop {
    private String type;

    public ChocolateShop(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void addChocolate(AbstractProduct chocolate, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(chocolate);
        }
    }

}
