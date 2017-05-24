package ua.kpi.tef.model;

import ua.kpi.tef.model.entity.*;
import ua.kpi.tef.model.factory.FlowerBouquetFactory;

public class FlowerShop {

    FlowerBouquetFactory factory = new FlowerBouquetFactory();

    public FlowerBouquet createBouquet(FlowerType flower, FlowerSize size, int amount){
        return factory.createBouquet(flower, size, amount);
    }

    public Bouquet addFlowersToBouquet(Bouquet bouquet, FlowerType flower, FlowerSize size, int amount) {
        return factory.addFlowersToBouquet(bouquet, flower, size, amount);

    }

    public void orderBouquet(Bouquet bouquet) {
        System.out.println( bouquet.getDescription() + " = UAH" + bouquet.cost());
    }

    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();

        Bouquet bouquet = flowerShop.createBouquet(FlowerType.RED_ROSE, FlowerSize.BIG, 15);
        bouquet = flowerShop.addFlowersToBouquet(bouquet, FlowerType.WHITE_ROSE, FlowerSize.BIG, 30);

        bouquet = new PaperPackaging(bouquet);
        bouquet = new Ribbon(bouquet);

        flowerShop.orderBouquet(bouquet);
    }
}
