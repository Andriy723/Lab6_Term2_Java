package ua.lviv.iot.algo.part1.lab6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.algo.part1.lab6.rest.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}