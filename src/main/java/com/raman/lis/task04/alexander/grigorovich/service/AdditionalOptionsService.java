package com.raman.lis.task04.alexander.grigorovich.service;

import com.raman.lis.task04.alexander.grigorovich.model.Car;

public class AdditionalOptionsService extends Service implements AdditionalOptionsServiceInterface {


    @Override
    public void addAdditionalOptions(Car car, String addOption) throws IllegalArgumentException {
        if (car == null || addOption == null) {
            throw new IllegalArgumentException("Try again");
        } else {
            car.addOptions(addOption);
        }
    }

    @Override
    public void removeAdditionalOptions(Car car, String removeOption) {
        if (car == null || removeOption == null) {
            throw new IllegalArgumentException("Try again");
        } else {
            car.removeOptions(removeOption);
        }


    }
}
