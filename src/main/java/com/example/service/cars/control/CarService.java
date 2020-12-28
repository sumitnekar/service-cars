package com.example.service.cars.control;


import com.example.service.cars.entity.Car;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CarService {

//    @Autowired
//    CarRepository repository;

    public List<Car> getCars() {
        List<Car> cars = Collections.singletonList(
                new Car(123, "Mercedez", "2020")
        );
        return cars;
    }

//    public Car addCar(Car car) {
//        return repository.save(car);
//    }
//
//    public Car updateCar(Car car) {
//        return repository.save(car);
//    }
//
//    public void deleteCar(Car car) {
//        repository.delete(car);
//    }
}
