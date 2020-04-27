package Arina2;

import Test.FishName;
import Test.Fish;
import Test.Akvarium;

public class Test {
    public static void main(String[] args) {
        Fish fish1 = new Fish ("Fantik", "blue", 2);
        Fish fish2 = new Fish ("Sharfik", "red", 1);
        Fish fish3 = new Fish ("Zhuzha", "yellow", 3);
        Akvarium fishes = new Akvarium() {
        };
        fishes.fillFish(fish1);
        fishes.fillFish(fish2);
        fishes.fillFish(fish3);
        fishes.allFish();

    }
}
