package ua.kpi.tef.model.entity;

public enum FlowerSize {
    SMALL (0.8),
    MEDIUM (1.0),
    BIG (1.2);

    private double coefficient;

    FlowerSize(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }
}
