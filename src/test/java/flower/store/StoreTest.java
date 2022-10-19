package flower.store;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void search() {
        Store store = new Store();
        Flower flower1 = new Flower(), flower2 = new Flower(), flower3 = new Flower();
        flower1.setPrice(10);
        flower1.setFlowerType(FlowerType.CHAMOMILE);
        flower1.setColor(FlowerColor.BLUE);

        flower2.setPrice(20);
        flower2.setFlowerType(FlowerType.ROSE);
        flower2.setColor(FlowerColor.RED);

        flower3.setPrice(30);
        flower3.setFlowerType(FlowerType.TULIP);
        flower3.setColor(FlowerColor.RED);

        store.add(flower1, 10);
        store.add(flower2, 15);

        Assertions.assertEquals(store.search(flower1), 10);
        Assertions.assertEquals(store.search(flower3), 0);
    }
}