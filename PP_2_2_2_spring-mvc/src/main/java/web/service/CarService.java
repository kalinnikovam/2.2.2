package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import web.models.Car;

import java.net.MalformedURLException;
import java.util.List;


public interface CarService {

    List<Car> getSomeCars(String value);

}
