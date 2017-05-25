package ua.kpi.tef.model.entity;

import ua.kpi.tef.view.View;

public class PaperPackaging extends BouquetDecorator {
    private Bouquet bouquet;

    public PaperPackaging(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    @Override
    public String getDescription() {
        return View.concatString(bouquet.getDescription(), View.bundle.getString(View.PAPER_PACKAGE_DESCRIPTION));
    }

    @Override
    public double cost() {
        return 4.5 + bouquet.cost();
    }
}
