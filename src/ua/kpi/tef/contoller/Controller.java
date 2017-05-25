package ua.kpi.tef.contoller;

import ua.kpi.tef.model.FlowerShop;
import ua.kpi.tef.model.entity.*;
import ua.kpi.tef.view.View;

public class Controller {
    private FlowerShop flowerShop;
    private View view;

    public Controller(FlowerShop flowerShop, View view) {
        this.flowerShop = flowerShop;
        this.view = view;
    }

    public void processUser() {
        createAndPrintSomeFlowers();

        FlowerBouquet bouquet = createSomeFlowerBouquet();
        view.printFlowers(bouquet);

        flowerShop.sortFlowers(bouquet);
        view.printFlowers(bouquet);

        view.printFlowers(flowerShop.getFlowersBySize(bouquet, FlowerSize.BIG));

        Bouquet decoratedBouquet = decorateBouquet(bouquet);
        flowerShop.orderBouquet(decoratedBouquet);
    }

    private void createAndPrintSomeFlowers() {
        Flower whiteRose = new Flower(FlowerType.WHITE_ROSE, FlowerSize.BIG);
        Flower yellowTulip = new Flower(FlowerType.YELLOW_TULIP, FlowerSize.MEDIUM);

        View.print(whiteRose.toString());
        View.print(yellowTulip.toString());
        View.print(view.getFlowerFreshness(whiteRose));
        View.print(view.getFlowerFreshness(yellowTulip));
        View.print(View.SPACE);
    }

    private FlowerBouquet createSomeFlowerBouquet() {
        FlowerBouquet bouquet = flowerShop.createBouquet(FlowerType.WHITE_ROSE, FlowerSize.BIG, 5);
        bouquet = flowerShop.addFlowersToBouquet(bouquet, FlowerType.WHITE_ROSE, FlowerSize.SMALL, 3);
        return bouquet;
    }

    private Bouquet decorateBouquet(Bouquet bouquet) {
        bouquet = new PaperPackaging(bouquet);
        bouquet = new Ribbon(bouquet);
        return bouquet;
    }
}
