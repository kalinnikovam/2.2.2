package web.models;


import java.net.URL;

public class Car {
    private String model;

    private int series;

    private int year;

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }
}
