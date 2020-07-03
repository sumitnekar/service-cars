package com.example.service.cars.boundary;


import com.example.service.cars.control.CarService;
import com.example.service.cars.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private static final String BASE_PATH = "/rest/v1";

    @Autowired
    CarService carService;

    @GetMapping(BASE_PATH + "/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping(BASE_PATH + "/cars")
    public Car add(@RequestBody Car car) {
        return carService.addCar(car);
    }
//
//    @PutMapping(BASE_PATH + "/cars/{id}")
//    public Car update(@PathVariable("id") Car car) {
//        return carService.addCar(car);
//    }
//
//    @DeleteMapping(BASE_PATH + "/cars/{id}")
//    public void delete(@PathVariable("id") Car car) {
//        carService.deleteCar(car);
//    }
}
