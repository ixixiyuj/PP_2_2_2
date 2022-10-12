package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.dao.CarDao;
import web.models.service.CarService;

@Controller
public class CarController {
    private final CarService cars;
    @Autowired
    public CarController(CarService cars) {
        this.cars = cars;
    }
    @GetMapping("/cars")
    public String carsList(@RequestParam(value = "count", defaultValue = "5")
                               int count, Model model) {
        model.addAttribute("list", cars.getCars(count));
        return "cars";
    }
}
