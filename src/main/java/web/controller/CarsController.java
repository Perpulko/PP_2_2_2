package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarServiceImpl carService;

    public CarsController(CarServiceImpl carService) {

        this.carService = carService;
    }

    @GetMapping("/cars")
    public String Cars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carService.getCars(5));
            return "cars";
        }
        if (count <= 0) {
            model.addAttribute("cars", carService.getCars(0));
            return "cars";
        }
        if (count == 1) {
            model.addAttribute("cars", carService.getCars(1));
            return "cars";
        }
        if (count == 2) {
            model.addAttribute("cars", carService.getCars(2));
            return "cars";
        } else if (count == 3) {
            model.addAttribute("cars", carService.getCars(3));
            return "cars";
        } else {
            model.addAttribute("cars", carService.getCars(4));
            return "cars";
        }
    }
}
