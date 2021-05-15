package com.raman.lis.task05.alexander.grigorovich.car.factory;

import com.raman.lis.task05.alexander.grigorovich.car.SportCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.SportCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.Color;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeColorService;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeWheelsService;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportModels;
import com.raman.lis.task05.alexander.grigorovich.car.service.AdditionalOptionsService;

public class LamborghiniCarFactory extends CarFactory implements SportCarFactoryInterface {


    public LamborghiniCarFactory(AdditionalOptionsService additionalOptionsService, ChangeColorService changeColorService,
                                 ChangeWheelsService changeWheelsService) {
        super(additionalOptionsService, changeColorService, changeWheelsService);

        addSportCarInStorage(new SportCar(
                Color.RED.getColor(),
                SportModels.LAMBORGHINI_GALLARDO.getSportModels(),
                super.getYEAR_OF_PRODUCTION(),
                SportDiameterWheels.TWENTY_FIRST.getSportDiameterWheels(),
                SportVolumeEngine.FIVE_AND_FOUR.getSportVolumeEngine(),
                2, 2000));
    }

}
