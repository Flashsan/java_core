package com.raman.lis.task05.alexander.grigorovich.car.service;

import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.service.serviceInterface.AdditionalOptionsServiceInterface;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

public class AdditionalOptionsService extends Service
        implements AdditionalOptionsServiceInterface {


    @Override
    public void addAdditionalOptions
            (
                    AbstractCar abstractCar,
                    String addOption
            ) throws CarException {
        if (abstractCar == null) {
            throw new CarException(
                    "Car not found.");
        } else {
            abstractCar.addOptions(addOption);
        }
    }

    @Override
    public void removeAdditionalOptions
            (
                    AbstractCar abstractCar,
                    String removeOption
            ) throws CarException {
        if (abstractCar == null) {
            throw new CarException(
                    "Car not found.");
        } else {
            abstractCar.removeOptions(removeOption);
        }
    }

    @Override
    public void infoAboutService() {
        System.out.println(
                "Address additional options service."
        );
    }
}
