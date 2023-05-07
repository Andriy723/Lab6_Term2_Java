package ua.lviv.iot.algo.part1.lab6.business;

import org.springframework.stereotype.Service;
import ua.lviv.iot.algo.part1.lab6.repository.CarRepository;
import ua.lviv.iot.algo.part1.lab6.rest.model.Car;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class CarService {

    private CarRepository carRepository;

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public int getAvailable = 1;
}