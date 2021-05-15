package com.raman.lis.task03.alexander.grigorovich.service;

import com.raman.lis.task03.alexander.grigorovich.model.Car;

public class TireFittingService extends Service implements TireFittingServiceInterface {

    @Override
    public void tireFitting(Car car, int diameterOfWheels) {
        car.setDiameterOfWheels(diameterOfWheels);
    }

    @Override
    public void infoAboutService() {
        System.out.println("This tire fitting service");
    }
}
