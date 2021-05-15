package com.raman.lis.task04.alexander.grigorovich.factory;


import com.raman.lis.task03.alexander.grigorovich.ENUM.Lamborghini.LamborghiniVolumeEngine;
import com.raman.lis.task04.alexander.grigorovich.model.SportCar;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini.LamborghiniAdditionalOptions;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini.LamborghiniColor;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini.LamborghiniDiameterWheel;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini.LamborghiniModel;
import com.raman.lis.task04.alexander.grigorovich.service.AdditionalOptionsService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeColorService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeWheelsService;

import java.util.Arrays;

public class LamborghiniCarFactory extends CarFactory implements SportCarFactoryInterface {

    private final String BRAND = "Lamborghini";

    private StringBuffer stringBuffer = new StringBuffer();

    public LamborghiniCarFactory(AdditionalOptionsService additionalOptionsService, ChangeColorService changeColorService,
                                 ChangeWheelsService changeWheelsService) {
        super(additionalOptionsService, changeColorService, changeWheelsService);

        addCarInStorage(new SportCar(BRAND,
                LamborghiniColor.RED.getLamborghiniColor(),
                LamborghiniModel.LAMBORGHINI_GALLARDO.getLamborghiniModel(),
                super.getYEAR_OF_PRODUCTION(),
                LamborghiniDiameterWheel.TWENTY_FIRST.getLamborghiniDiameter(),
                LamborghiniVolumeEngine.FIVE_AND_FOUR.getLamborghiniVolumeEngine(),
                2, 2000));
    }

    @Override
    public void addressFactory() {
        System.out.println("Unknown");
    }

    @Override
    public void printPossibleCompleteFactoryCar() {
        System.out.println(
                stringBuffer.append("List possible color " + BRAND + ": ")
                        .append(Arrays.toString(LamborghiniColor.values()))
                        .append(",\n")
                        .append("List possible models " + BRAND + ": ")
                        .append(Arrays.toString(LamborghiniModel.values()))
                        .append(",\n")
                        .append("List possible installed motors " + BRAND + " : ")
                        .append(Arrays.toString(LamborghiniVolumeEngine.values()))
                        .append(",\n")
                        .append("List possible installed wheels " + BRAND + " : ")
                        .append(Arrays.toString(LamborghiniDiameterWheel.values()))
                        .append(",\n")
                        .append("List possible additional options " + BRAND + " : ")
                        .append(Arrays.toString(LamborghiniAdditionalOptions.values()))
                        .append(",\n"));
    }

    @Override
    public SportCar createNewSportCar(String color, String model,
                                      int diameterOfWheels, double volumeOfEngine,
                                      int numberOfSeats, int weightSportCar) throws IllegalArgumentException {
        if (diameterOfWheels != LamborghiniDiameterWheel.TWENTY_FIRST.getLamborghiniDiameter()) {
            throw new IllegalArgumentException(
                    "This factory cannot create car with this parameters."
            );
        } else {
            return new SportCar(BRAND, color, model, super.getYEAR_OF_PRODUCTION(),
                    diameterOfWheels, volumeOfEngine, numberOfSeats, weightSportCar);
        }
    }

}
