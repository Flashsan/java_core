package com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface;

import com.raman.lis.task05.alexander.grigorovich.car.PassengerCar;

public interface PassengerCarFactoryInterface {

    PassengerCar createNewPassengerCar(String color, String model,
                                               String diameterOfWheels, String volumeOfEngine);

}
