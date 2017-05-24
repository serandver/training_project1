package ua.kpi.tef.model.entity;

public class MembranePackaging extends BouquetDecorator {
    private Bouquet bouquet;

    public MembranePackaging(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getDescription() {
        return bouquet.getDescription() + ", membrane packaging";
    }

    @Override
    public double cost() {
        return 3.5 + bouquet.cost();
    }
}
