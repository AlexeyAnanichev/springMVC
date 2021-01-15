package model;

import java.util.ArrayList;
import java.util.List;


public class Car {
    private final String model;
    private final int series;
    private final String carBody;

    public Car(String model, int series, String carBody) {
        this.model = model;
        this.series = series;
        this.carBody = carBody;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getCarBody() {
        return carBody;
    }

}
