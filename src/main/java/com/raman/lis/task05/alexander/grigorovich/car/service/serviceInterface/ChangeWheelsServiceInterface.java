package com.raman.lis.task05.alexander.grigorovich.car.service.serviceInterface;

import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

public interface ChangeWheelsServiceInterface {

    void changeWheels
            (
                    AbstractCar abstractCar,
                    String diameterOfWheels
            ) throws CarException;

    default void WheelsService() {
        System.out.println(
                "Service for change color car."
        );
    }
}
