package ua.kpi.tef.model.entity;

import ua.kpi.tef.view.View;

public class Ribbon extends BouquetDecorator {
    private Bouquet bouquet;

    public Ribbon(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getDescription() {
        return View.concatString(bouquet.getDescription(), View.bundle.getString(View.RIBBON_DESCRIPTION));
    }

    @Override
    public double cost() {
        return 3 + bouquet.cost();
    }
}
