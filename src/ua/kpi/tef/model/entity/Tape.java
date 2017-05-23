package ua.kpi.tef.model.entity;

/**
 * Created by Хоменко Сергій on 24.05.2017.
 */
public class Tape extends BouquetDecorator {

    @Override
    public double cost() {
        return 5.0;
    }
}
