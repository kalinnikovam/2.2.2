package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import web.models.Car;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> createCarList() {
        if (cars.isEmpty()) {
            cars.add(new Car("firstCar", 1, 1945));
            cars.add(new Car("secondCar", 2, 2000));
            cars.add(new Car("thirdCar", 3, 1999));
            cars.add(new Car("coolCar", 4, 2001));
            cars.add(new Car("badCar", 5, 2056));
        }
        return cars;
    }

    @Override
    public List<Car> getSomeCars(int value) {
        List<Car> newList = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            newList.add(cars.get(i));
        }
        return newList;
    }

    @Override
    public void addAttribute(Model model, Integer count, List<Car> cars) {
        if (count == null) {
            model.addAttribute("cars", cars);
        } else if (count > 0) {
            List<Car> carList = new CarServiceImpl().getSomeCars(count);
            model.addAttribute("cars", carList);
        }
    }
}
