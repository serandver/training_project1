package ua.kpi.tef.model.entity;

public class PaperPackaging extends BouquetDecorator {
    private Bouquet bouquet;

    public PaperPackaging(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getDescription() {
        return bouquet.getDescription() + ", paper packaging";
    }

    @Override
    public double cost() {
        return 4.5 + bouquet.cost();
    }
}
