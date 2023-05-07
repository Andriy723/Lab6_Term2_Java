package ua.lviv.iot.algo.part1.lab6.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.algo.part1.lab6.business.CarService;
import ua.lviv.iot.algo.part1.lab6.rest.model.Car;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/cars")
@RestController
public class CarController {

    private Map<Integer, Car> cars = new HashMap<>();

    private AtomicInteger idCounter = new AtomicInteger();

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getCars() {
        return new LinkedList<Car>(cars.values());
    }


    @GetMapping(path = "/{id}")
    public Car getCar(final @PathVariable("id") Integer carId) {
        System.out.println(carId);

        return cars.get(carId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Car createCar(final @RequestBody Car car) {

        System.out.println(carService.createCar(car));

        car.setId(idCounter.incrementAndGet());
        cars.put(car.getId(), car);
        return car;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Car> deleteCar(@PathVariable("id") Integer carId) {

        HttpStatus status = cars.remove(carId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

        return ResponseEntity.status(status).build();
    }

    @PutMapping("/{id}")
    public Car updateCar(final @PathVariable("id") Integer carId, final @RequestBody Car car) {
        car.setId(carId);
        return cars.put(car.getId(), car);
    }
}