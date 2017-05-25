package ua.kpi.tef.model.entity;

import ua.kpi.tef.view.View;

public class Flower extends Bouquet implements Comparable<Flower> {
    private FlowerType type;
    private FlowerSize size;

   /** Coefficient shows freshness of a flower, from 0 to 100.
    * 0 means that a flower should be wasted
    * 100 means that a flower is fresh
    * */
    private int freshnessCoefficient;

    public Flower(FlowerType type, FlowerSize size) {
        this.type = type;
        this.size = size;
        this.freshnessCoefficient = (int) (Math.random() * 100);
    }

    @Override
    public String getDescription() {
        return this.getType().toString();
    }

    @Override
    public double cost() {
        return type.getPrice() * size.getCoefficient();
    }

    public FlowerType getType() {
        return type;
    }

    public FlowerSize getSize() {
        return size;
    }

    public int getFreshnessCoefficient() {
        return this.freshnessCoefficient;
    }

    @Override
    public int compareTo(Flower compareFlower) {
        int compareFreshness = ((Flower)compareFlower).getFreshnessCoefficient();

        //ascending order
        return this.freshnessCoefficient - compareFreshness;
    }

    @Override
    public String toString() {
        return View.concatString(size.name().toLowerCase(), " ", type.toString());
    }
}
