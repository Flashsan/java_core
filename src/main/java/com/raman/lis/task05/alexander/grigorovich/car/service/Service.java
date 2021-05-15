package com.raman.lis.task05.alexander.grigorovich.car.service;

import com.raman.lis.task05.alexander.grigorovich.car.service.serviceInterface.ServiceInterface;


public abstract class Service implements ServiceInterface {

    @Override
    public void infoAboutService(){
        System.out.println("Abstract service");
    }

}
