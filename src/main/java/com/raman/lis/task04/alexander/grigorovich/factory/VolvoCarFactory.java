package com.raman.lis.task04.alexander.grigorovich.factory;

import com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo.VolvoColor;
import com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo.VolvoDiameterWheel;
import com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo.VolvoModel;
import com.raman.lis.task04.alexander.grigorovich.model.PassengerCar;
import com.raman.lis.task04.alexander.grigorovich.model.TruckCar;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Volvo.VolvoAdditionalOptions;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Volvo.VolvoVolumeEngine;
import com.raman.lis.task04.alexander.grigorovich.service.AdditionalOptionsService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeColorService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeWheelsService;

import java.util.Arrays;

public class VolvoCarFactory extends CarFactory implements PassengerCarFactoryInterface,
        TruckCarFactoryInterface {

    StringBuffer stringBuffer = new StringBuffer();

    private final String BRAND = "Volvo";

    public VolvoCarFactory(AdditionalOptionsService additionalOptionsService, ChangeColorService changeColorService,
                           ChangeWheelsService changeWheelsService) {
        super(additionalOptionsService, changeColorService, changeWheelsService);

        addCarInStorage(new PassengerCar(BRAND,
                VolvoColor.WHITE.getVolvoColor(),
                VolvoModel.VOLVO_S80.getVolvoModel(),
                super.getYEAR_OF_PRODUCTION(),
                VolvoDiameterWheel.SEVENTEENTH.getVolvoDiameterWheel(),
                VolvoVolumeEngine.TWO_AND_FIVE.getVolvoVolumeEngine()));

        addCarInStorage(new TruckCar(BRAND,
                VolvoColor.WHITE.getVolvoColor(),
                VolvoModel.VOLVO_FN.getVolvoModel(),
                super.getYEAR_OF_PRODUCTION(),
                25,
                7.9,
                20_000));
    }

    @Override
    public void addressFactory() {
        System.out.println("Unknown");
    }

    @Override
    public void printPossibleCompleteFactoryCar() {
        System.out.println(
                stringBuffer.append("List possible color " + BRAND + ": ")
                        .append(Arrays.toString(VolvoColor.values()))
                        .append(",\n")
                        .append("List possible models " + BRAND + ": ")
                        .append(Arrays.toString(VolvoColor.values()))
                        .append(",\n")
                        .append("List possible installed motors " + BRAND + " : ")
                        .append(Arrays.toString(VolvoVolumeEngine.values()))
                        .append(",\n")
                        .append("List possible installed wheels " + BRAND + " : ")
                        .append(Arrays.toString(VolvoDiameterWheel.values()))
                        .append(",\n")
                        .append("List possible additional options " + BRAND + " : ")
                        .append(Arrays.toString(VolvoAdditionalOptions.values()))
                        .append(",\n"));
    }

    @Override
    public PassengerCar createNewPassengerCar(String color, String model,
                                              int diameterOfWheels, double volumeOfEngine)
            throws IllegalArgumentException {
        if (diameterOfWheels < VolvoDiameterWheel.SIXTEENTH.getVolvoDiameterWheel()
                && diameterOfWheels > VolvoDiameterWheel.NINETEENTH.getVolvoDiameterWheel()) {
            throw new IllegalArgumentException(
                    "This factory cannot create car with this parameters."
            );
        } else {
            return new PassengerCar(BRAND, color, model,
                    super.getYEAR_OF_PRODUCTION(), diameterOfWheels, volumeOfEngine);
        }
    }

    @Override
    public TruckCar createNewTruckCar(String color, String model, int diameterOfWheels,
                                      double volumeOfEngine, int liftingCapacity) throws IllegalArgumentException {

        if ((diameterOfWheels < 27 && diameterOfWheels > 24)
                || (liftingCapacity > 10_000 && liftingCapacity < 50_000)) {
            throw new IllegalArgumentException(
                    "This factory cannot create car with this parameters."
            );
        } else {
            return new TruckCar(BRAND, color, model,
                    super.getYEAR_OF_PRODUCTION(), diameterOfWheels, volumeOfEngine, liftingCapacity);
        }
    }
}


