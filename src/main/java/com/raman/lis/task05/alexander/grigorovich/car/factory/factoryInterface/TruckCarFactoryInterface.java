package com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface;

import com.raman.lis.task05.alexander.grigorovich.car.TruckCar;

public interface TruckCarFactoryInterface {

    TruckCar createNewTruckCar(String color, String model, String diameterOfWheels,
                                       String
                                               volumeOfEngine, int liftingCapacity);

}
