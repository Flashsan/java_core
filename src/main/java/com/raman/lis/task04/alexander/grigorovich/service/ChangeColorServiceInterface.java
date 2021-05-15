package com.raman.lis.task04.alexander.grigorovich.service;

import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

public interface ChangeColorServiceInterface {

    void changeColor(AbstractCar abstractCar, String color) throws CarException;
}
