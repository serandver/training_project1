package ua.kpi.tef.model.factory;

import ua.kpi.tef.model.entity.Bouquet;
import ua.kpi.tef.model.entity.FlowerBouquet;
import ua.kpi.tef.model.entity.FlowerSize;
import ua.kpi.tef.model.entity.FlowerType;

public abstract class AbstractBouquetFactory {

    abstract FlowerBouquet createBouquet(FlowerType flower, FlowerSize size, int amount);

    abstract Bouquet addFlowersToBouquet(Bouquet bouquet, FlowerType flower, FlowerSize size, int amount);
}
