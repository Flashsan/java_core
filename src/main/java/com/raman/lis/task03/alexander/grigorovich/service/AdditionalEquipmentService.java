package com.raman.lis.task03.alexander.grigorovich.service;

import com.raman.lis.task03.alexander.grigorovich.model.Car;

public class AdditionalEquipmentService extends Service implements AdditionalEquipmentServiceInterface {

    @Override
    public void addAdditionalOptions(Car car, String string) {
        car.addOptions(string);
    }

    @Override
    public void removeAdditionalOptions(Car car, String string) {
        car.removeOptions(string);
    }

    @Override
    public void infoAboutService() {
        System.out.println("This additional equipment service");
    }

}
