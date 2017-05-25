package ua.kpi.tef;

import ua.kpi.tef.contoller.Controller;
import ua.kpi.tef.model.FlowerShop;
import ua.kpi.tef.view.View;

public class Runner {
    public static void main(String[] args) {
        FlowerShop flowerShop = new FlowerShop();
        View view = new View();
        Controller controller = new Controller(flowerShop, view);
        controller.processUser();
    }
}
