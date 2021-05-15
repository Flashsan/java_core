package com.raman.lis.task05.alexander.grigorovich.car.factory;

import com.raman.lis.task05.alexander.grigorovich.car.PassengerCar;
import com.raman.lis.task05.alexander.grigorovich.car.TruckCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.PassengerCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.TruckCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.Color;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckModels;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeColorService;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeWheelsService;
import com.raman.lis.task05.alexander.grigorovich.car.service.AdditionalOptionsService;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckVolumeEngine;


public class VolvoCarFactory extends CarFactory implements PassengerCarFactoryInterface,
        TruckCarFactoryInterface {

    public VolvoCarFactory(
            AdditionalOptionsService additionalOptionsService,
            ChangeColorService changeColorService,
            ChangeWheelsService changeWheelsService
    ) {
        super(additionalOptionsService, changeColorService, changeWheelsService);

        addPassengerCarInStorage(new PassengerCar(
                Color.WHITE.getColor(),
                PassengerModels.VOLVO_S80.getPassengerModels(),
                super.getYEAR_OF_PRODUCTION(),
                PassengerDiameterWheels.SEVENTEENTH.getPassengerDiameterWheels(),
                PassengerVolumeEngine.TWO_AND_FIVE.getPassengerVolumeEngine()));

        addTruckCarInStorage(new TruckCar(
                Color.WHITE.getColor(),
                TruckModels.VOLVO_FN.getTruckModels(),
                super.getYEAR_OF_PRODUCTION(),
                TruckDiameterWheels.TWENTY_FOUR.getTruckDiameterWheels(),
                TruckVolumeEngine.SEVEN_AND_SEVEN.getTruckVolumeEngine(),
                20_000));
    }

}

