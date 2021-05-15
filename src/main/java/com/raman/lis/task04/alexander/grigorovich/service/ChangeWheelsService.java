package com.raman.lis.task04.alexander.grigorovich.service;

import com.raman.lis.task04.alexander.grigorovich.model.Car;

public class ChangeWheelsService extends Service implements ChangeWheelsServiceInterface {

    @Override
    public void changeWheels(Car car, int diameterOfWheels)
            throws IllegalArgumentException {
        if (car == null || diameterOfWheels < 0) {
            throw new IllegalArgumentException("Try again");
        } else {
            car.setDiameterOfWheels(diameterOfWheels);
        }
    }

}