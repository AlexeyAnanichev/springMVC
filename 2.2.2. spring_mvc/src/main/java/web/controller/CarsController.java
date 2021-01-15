package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null) {
            model.addAttribute("carList", carService.getList());
            return "cars";
        }
        model.addAttribute("carList", carService.getCars(count));
        return "cars";
    }

}

