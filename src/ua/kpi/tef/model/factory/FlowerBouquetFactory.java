package ua.kpi.tef.model.factory;

import ua.kpi.tef.model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class FlowerBouquetFactory {
    FlowerBouquet flowerBouquet;

    public FlowerBouquet createBouquet(FlowerType flower, FlowerSize size, int amount) {
        List<Flower> flowers = getListOfFlowers(flower, size, amount);
        flowerBouquet = new FlowerBouquet(flowers);
        return flowerBouquet;
    }

    private List<Flower> getListOfFlowers(FlowerType flower, FlowerSize size, int amount) {
        List<Flower> flowers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            flowers.add(new Flower(flower, size));
        }
        return flowers;
    }

    public FlowerBouquet addFlowersToBouquet(FlowerBouquet bouquet, FlowerType flower, FlowerSize size, int amount) {
        List<Flower> flowers = getListOfFlowers(flower, size, amount);
        FlowerBouquet flowerBouquet = bouquet;
        flowerBouquet.addFlowers(flowers);
        return flowerBouquet;
    }

    private FlowerBouquet getFlowerBouquet() {
        return flowerBouquet;
    }
}
