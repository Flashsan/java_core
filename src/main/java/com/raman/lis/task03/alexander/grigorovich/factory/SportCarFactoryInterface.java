package com.raman.lis.task03.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.model.SportCar;

import java.util.ArrayList;

public interface SportCarFactoryInterface {

    SportCar createNewSportCar(String color, String model,
                               int diameterOfWheels, double volumeOfEngine,
                               int numberOfSeats, int weightSportCar);


}
