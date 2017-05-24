package ua.kpi.tef.model.entity;

public enum FlowerType {
    RED_ROSE (25.0),
    WHITE_ROSE (22.0),
    YELLOW_ROSE (22.0),
    PINK_ROSE (20.0),
    RED_TULIP (15.0),
    YELLOW_TULIP (14.0);

    private double price;

    FlowerType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.name().replaceAll("_", " ").toLowerCase();
    }
}
