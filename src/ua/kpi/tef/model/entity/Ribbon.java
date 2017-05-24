package ua.kpi.tef.model.entity;

public class Ribbon extends BouquetDecorator {
    private Bouquet bouquet;

    public Ribbon(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getDescription() {
        return bouquet.getDescription() + ", tied with ribbon";
    }

    @Override
    public double cost() {
        return 3 + bouquet.cost();
    }
}
