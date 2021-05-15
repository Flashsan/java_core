package com.raman.lis.task05.alexander.grigorovich.car.service;


import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.service.serviceInterface.ChangeWheelsServiceInterface;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;


public class ChangeWheelsService extends Service implements ChangeWheelsServiceInterface {

    @Override
    public void changeWheels(AbstractCar abstractCar, String diameterOfWheels)
            throws CarException {
        if (abstractCar == null) {
            throw new CarException("Car not found");
        } else {
            abstractCar.setDiameterOfWheels(diameterOfWheels);
        }
    }

    @Override
    public void infoAboutService() {
        System.out.println("Address wheels service.");
    }
}