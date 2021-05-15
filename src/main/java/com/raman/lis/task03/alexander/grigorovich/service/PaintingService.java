package com.raman.lis.task03.alexander.grigorovich.service;

import com.raman.lis.task03.alexander.grigorovich.model.Car;


public class PaintingService extends Service implements PaintingServiceInterface {

    @Override
    public void changeColor(Car car, String color) {
        car.setColor(color);
    }

    @Override
    public void infoAboutService() {
        System.out.println("This painting service");
    }

}
