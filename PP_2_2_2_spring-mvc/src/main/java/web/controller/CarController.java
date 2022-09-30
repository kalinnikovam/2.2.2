package web.controller;

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

    @GetMapping("/cars")
    public String mapCar(Model model,
                         @RequestParam(value = "count", required = false) Integer count) {
        CarService service = new CarServiceImpl();
        List<Car> cars = service.createCarList();;
        if (count == null) {
            model.addAttribute("cars", cars);
        } else if (count > 0) {
            List<Car> carList = service.getSomeCars(count);
            model.addAttribute("cars", carList);
        }

        return "cars";
    }
}
