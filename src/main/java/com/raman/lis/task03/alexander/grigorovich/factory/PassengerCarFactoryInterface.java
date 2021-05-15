package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.model.PassengerCar;

import java.util.ArrayList;

public interface PassengerCarFactoryInterface {

    PassengerCar createNewPassengerCar(String color, String model,
                                       int diameterOfWheels, double volumeOfEngine);

}
