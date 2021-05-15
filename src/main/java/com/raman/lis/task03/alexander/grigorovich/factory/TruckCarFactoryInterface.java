package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.model.TruckCar;

import java.util.ArrayList;

public interface TruckCarFactoryInterface {

    default TruckCar createNewTruckCar(String color, String model, int diameterOfWheels,
                           double volumeOfEngine, int liftingCapacity) {

        System.out.println("does not produce cars of this type");
        return null;
    }

}
