package com.raman.lis.task04.alexander.grigorovich.factory;

import com.raman.lis.task04.alexander.grigorovich.model.TruckCar;

public interface TruckCarFactoryInterface {

    TruckCar createNewTruckCar(String color, String model, int diameterOfWheels,
                               double volumeOfEngine, int liftingCapacity);

}
