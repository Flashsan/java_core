package com.raman.lis.task05.alexander.grigorovich.car.service.serviceInterface;

import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

public interface ChangeColorServiceInterface {

    AbstractCar changeColor
            (
                    AbstractCar abstractCar,
                    String color
            ) throws CarException;

    default void ColorService() {
        System.out.println(
                "Service for change color car."
        );
    }
}
