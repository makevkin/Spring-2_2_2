package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @GetMapping("/cars")
    String getCountCar(Model model) {
        model.addAttribute("message", carService);
        return "car";
    }



}
