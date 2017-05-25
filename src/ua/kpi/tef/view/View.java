package ua.kpi.tef.view;

import ua.kpi.tef.model.entity.Flower;
import ua.kpi.tef.model.entity.FlowerBouquet;

import java.util.List;
import java.util.ResourceBundle;

public final class View {

    // Resource Bundle Installation's
    public static final String MESSAGES_BUNDLE_PATH = "ua.kpi.tef.resources.messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_PATH);

    // Text's constants
    public static String SPACE = " ";
    public static String COMA = ",";
    public static String PIECES = "pcs";
    public static String SUM = "total sum: ";
    public static String NEW_LINE = "\n";
    public static String COLON = ":";

    public static String CURRENT_CURRENCY = "view.current.currency";
    public static String RIBBON_DESCRIPTION = "view.ribbon.description";
    public static String PAPER_PACKAGE_DESCRIPTION = "view.paper.description";
    public static String MEMBRANE_PACKAGING_DESCRIPTION = "view.membrane.description";
    public static String FRESHNESS_COEFFICIENT_IN_PERCENT = "view.bouquet.freshness";

    public static void print(String message){
        System.out.println(message);
    }

    public static String concatString(String...message){
        StringBuilder sb = new StringBuilder();
        for (String s : message) {
            sb.append(s);
        }
        return sb.toString();
    }

    public void printFlowers(FlowerBouquet bouquet) {
        List<Flower> flowers = bouquet.getFlowers();
        for (Flower flower: flowers) {
            print(View.concatString(flower.toString(), String.valueOf(flower.getFreshnessCoefficient())));
        }
    }

    public String getFlowerFreshness (Flower flower) {
        return concatString(bundle.getString(FRESHNESS_COEFFICIENT_IN_PERCENT),
                flower.getDescription(), COLON, SPACE, String.valueOf(flower.getFreshnessCoefficient()));
    }
}
