package flower.store;

import java.util.ArrayList;
import java.util.concurrent.Flow;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double sum = 0;
        for(FlowerPack pack: flowerPacks) {
            sum += pack.getPrice();
        }
        return sum;
    }
}
