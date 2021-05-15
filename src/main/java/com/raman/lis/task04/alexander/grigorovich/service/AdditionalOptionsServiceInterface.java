package com.raman.lis.task04.alexander.grigorovich.service;


import com.raman.lis.task04.alexander.grigorovich.model.Car;

public interface AdditionalOptionsServiceInterface {

    void addAdditionalOptions(Car car, String addOption);

    void removeAdditionalOptions(Car car, String removeOption);
}
