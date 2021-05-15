package com.raman.lis.task05.alexander.grigorovich.car.factory;

import com.raman.lis.task05.alexander.grigorovich.car.PassengerCar;
import com.raman.lis.task05.alexander.grigorovich.car.SportCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.PassengerCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.SportCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.Color;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeWheelsService;
import com.raman.lis.task05.alexander.grigorovich.car.service.AdditionalOptionsService;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeColorService;

public class AudiCarFactory extends CarFactory implements PassengerCarFactoryInterface,
        SportCarFactoryInterface {

    public AudiCarFactory(AdditionalOptionsService additionalOptionsService, ChangeColorService changeColorService,
                          ChangeWheelsService changeWheelsService) {
        super(additionalOptionsService, changeColorService, changeWheelsService);

        addPassengerCarInStorage(new PassengerCar(
                Color.GOLD.getColor(),
                PassengerModels.AUDI_A4.getPassengerModels(),
                super.getYEAR_OF_PRODUCTION(),
                PassengerDiameterWheels.SEVENTEENTH.getPassengerDiameterWheels(),
                PassengerVolumeEngine.ONE_AND_NINE.getPassengerVolumeEngine()));

        addPassengerCarInStorage(new PassengerCar(
                Color.WHITE.getColor(),
                PassengerModels.AUDI_A6.getPassengerModels(),
                super.getYEAR_OF_PRODUCTION(),
                PassengerDiameterWheels.SEVENTEENTH.getPassengerDiameterWheels(),
                PassengerVolumeEngine.TWO_AND_TWO.getPassengerVolumeEngine()));

        addSportCarInStorage(new SportCar(
                Color.BLACK.getColor(),
                SportModels.AUDI_R8.getSportModels(),
                super.getYEAR_OF_PRODUCTION(),
                SportDiameterWheels.TWENTY_FIRST.getSportDiameterWheels(),
                SportVolumeEngine.FIVE_AND_FOUR.getSportVolumeEngine(),
                2, 1600));
    }
}
