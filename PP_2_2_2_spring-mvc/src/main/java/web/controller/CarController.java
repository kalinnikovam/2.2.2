package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/cars")
    public String mapCar(Model model,
                         @RequestParam(value = "count", required = false) Integer count) {

        if (count == null) { count = 5;}

        List<Car> cars = service.getSomeCars(count);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
