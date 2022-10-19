package flower.store;

import java.util.Hashtable;

public class Store {
    private Hashtable<Flower, Integer> collection;

    public Store() {
        this.collection = new Hashtable<>();
    }

    public Hashtable<Flower, Integer> getCollection() {
        return collection;
    }

    public void setCollection(Hashtable<Flower, Integer> collection) {
        this.collection = collection;
    }

    public int search(Flower flower) {
        // Returns the amount of flowers found in collection
        if (!collection.containsKey(flower)) {
            return 0;
        }
        return collection.get(flower);
    }

    public void add(Flower flower, int amount) {
        if (!collection.containsKey(flower)) {
            collection.put(flower, amount);
        } else {
            collection.put(flower, collection.get(flower) + amount);
        }
    }
}
