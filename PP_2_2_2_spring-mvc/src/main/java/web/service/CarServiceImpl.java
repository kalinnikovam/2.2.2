package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    public CarServiceImpl() {
        Car car1 = new Car("firstCar", 1, 1945);
        Car car2 = new Car("secondCar", 2, 2000);
        Car car3 = new Car("thirdCar", 3, 1999);
        Car car4 = new Car("coolCar", 4, 2001);
        Car car5 = new Car("badCar", 5, 2056);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getSomeCars(int value) {
        List<Car> newList = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            newList.add(cars.get(i));
        }
        return newList;
    }
}
