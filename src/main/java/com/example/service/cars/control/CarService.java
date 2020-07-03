package com.example.service.cars.control;


import com.example.service.cars.entity.Car;
import com.example.service.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository repository;

    public List<Car> getCars() {
        return repository.findAll();
    }

    public Car addCar(Car car) {
        return repository.save(car);
    }

    public Car updateCar(Car car) {
        return repository.save(car);
    }

    public void deleteCar(Car car) {
        repository.delete(car);
    }
}
