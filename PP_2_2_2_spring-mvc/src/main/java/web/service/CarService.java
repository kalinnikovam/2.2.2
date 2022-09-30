package web.service;

import web.models.Car;

import java.net.MalformedURLException;
import java.util.List;

public interface CarService {
    List<Car> createCarList();

    List<Car> getSomeCars(int value);
}
