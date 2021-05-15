package com.raman.lis.task04.alexander.grigorovich.factory;


import com.raman.lis.task04.alexander.grigorovich.model.SportCar;

public interface SportCarFactoryInterface {

    SportCar createNewSportCar(String color, String model,
                               int diameterOfWheels, double volumeOfEngine,
                               int numberOfSeats, int weightSportCar);

}
