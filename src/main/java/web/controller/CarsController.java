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
        if (count == null) {
            model.addAttribute("cars", carService.getCars(5));
            return "cars";
        }
        switch (count) {
            case 0:
                model.addAttribute("cars", carService.getCars(0));
                break;
            case 1:
                model.addAttribute("cars", carService.getCars(1));
                break;
            case 2:
                model.addAttribute("cars", carService.getCars(2));
                break;
            case 3:
                model.addAttribute("cars", carService.getCars(3));
                break;
            case 4:
                model.addAttribute("cars", carService.getCars(4));
                break;
            case 5:
                model.addAttribute("cars", carService.getCars(5));
                break;
            default:
                model.addAttribute("cars", carService.getCars(5));
                break;
        }
        return "cars";
    }
}
