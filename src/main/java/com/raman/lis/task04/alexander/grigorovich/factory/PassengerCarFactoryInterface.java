package com.raman.lis.task04.alexander.grigorovich.factory;


import com.raman.lis.task04.alexander.grigorovich.model.PassengerCar;

public interface PassengerCarFactoryInterface {

    PassengerCar createNewPassengerCar(String color, String model,
                                       int diameterOfWheels, double volumeOfEngine);

}
