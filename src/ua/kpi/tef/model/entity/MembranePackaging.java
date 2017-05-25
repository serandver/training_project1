package ua.kpi.tef.model.entity;

import ua.kpi.tef.view.View;

public class MembranePackaging extends BouquetDecorator {
    private Bouquet bouquet;

    public MembranePackaging(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getDescription() {
        return View.concatString(bouquet.getDescription(), View.bundle.getString(View.MEMBRANE_PACKAGING_DESCRIPTION));
    }

    @Override
    public double cost() {
        return 3.5 + bouquet.cost();
    }
}
