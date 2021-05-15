package com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface;


import com.raman.lis.task05.alexander.grigorovich.car.SportCar;

public interface SportCarFactoryInterface {

    SportCar createNewSportCar(String color, String model,
                                       String diameterOfWheels, String volumeOfEngine,
                                       int numberOfSeats, int weightSportCar);

}
