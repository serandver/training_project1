package ua.kpi.tef.model.entity;

public class Flower extends Bouquet {
    private FlowerType type;
    private FlowerSize size;

    public Flower(FlowerType type, FlowerSize size) {
        this.type = type;
        this.size = size;
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

    @Override
    public String toString() {
        return size.name().toLowerCase() + " " + type.toString();
    }
}
