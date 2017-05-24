package ua.kpi.tef.model.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowerBouquet extends Bouquet {
    private List<Flower> flowers;

    public FlowerBouquet() {
        flowers = new ArrayList<>();
    }

    public FlowerBouquet(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public FlowerBouquet addFlowers(List<Flower> newFlowers) {
        flowers.addAll(newFlowers);
        return this;
    }

    @Override
    public double cost() {
        double price = 0;
        for (Flower flower: flowers) {
            price += flower.cost();
        }
        return price;
    }

    @Override
    public String getDescription() {
        StringBuilder builder = new StringBuilder();

        Map<String, Integer> flowersMap = new HashMap<>();
        for (Flower flower: flowers) {
            String flowerName = flower.toString();
            int count = flowersMap.containsKey(flowerName) ? flowersMap.get(flowerName) : 0;
            flowersMap.put(flowerName, count + 1);
        }
        for (Map.Entry<String, Integer> amountOfFlowers: flowersMap.entrySet()) {
            builder.append(amountOfFlowers.getKey() + ", " + amountOfFlowers.getValue() + "pcs ");
        }
        return builder.toString();
    }
}
