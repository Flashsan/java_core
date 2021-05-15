package com.raman.lis.task05.alexander.grigorovich.car.service.serviceInterface;


import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

public interface AdditionalOptionsServiceInterface {

    void addAdditionalOptions(
                    AbstractCar abstractCar,
                    String addOption
            ) throws CarException;

    void removeAdditionalOptions
            (
                    AbstractCar abstractCar,
                    String removeOption
            ) throws CarException;

    default void OptionsService() {
        System.out.println(
                "Service for installation in dismantling of additional options."
        );
    }
}
