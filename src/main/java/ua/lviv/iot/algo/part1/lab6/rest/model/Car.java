package ua.lviv.iot.algo.part1.lab6.rest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private int numberOfDoors;
    private float volumeOfCarBag;
    private double maximumLoad;
    private int speedOfCar;
}