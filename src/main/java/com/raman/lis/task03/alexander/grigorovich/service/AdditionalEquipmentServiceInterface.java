package com.raman.lis.task03.alexander.grigorovich.service;

import com.raman.lis.task03.alexander.grigorovich.model.Car;

public interface AdditionalEquipmentServiceInterface {

    void addAdditionalOptions(Car car, String string);

    void removeAdditionalOptions(Car car, String string);
}
