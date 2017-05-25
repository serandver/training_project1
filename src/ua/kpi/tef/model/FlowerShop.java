package ua.kpi.tef.model;

import ua.kpi.tef.model.entity.*;
import ua.kpi.tef.model.factory.FlowerBouquetFactory;
import ua.kpi.tef.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlowerShop {

    FlowerBouquetFactory factory = new FlowerBouquetFactory();

    public FlowerBouquet createBouquet(FlowerType flower, FlowerSize size, int amount){
        return factory.createBouquet(flower, size, amount);
    }

    public FlowerBouquet addFlowersToBouquet(FlowerBouquet bouquet, FlowerType flower, FlowerSize size, int amount) {
        return factory.addFlowersToBouquet(bouquet, flower, size, amount);
    }

    public void orderBouquet(Bouquet bouquet) {
        View.print( View.concatString(bouquet.getDescription(),
                View.NEW_LINE, View.SUM, View.bundle.getString(View.CURRENT_CURRENCY), String.valueOf(bouquet.cost())));
    }

    public void sortFlowers(FlowerBouquet bouquet) {
        Collections.sort(bouquet.getFlowers());
    }

    public FlowerBouquet getFlowersBySize(FlowerBouquet bouquet, FlowerSize size) {
        List<Flower> flowers = bouquet.getFlowers();
        List<Flower> flowersBySize = new ArrayList<>();
        FlowerBouquet bouquetBySize = new FlowerBouquet();
        for (Flower flower: flowers) {
            if (flower.getSize() == size) {
                flowersBySize.add(flower);
            }
        }
        bouquetBySize.addFlowers(flowersBySize);
        return bouquetBySize;
    }
}
