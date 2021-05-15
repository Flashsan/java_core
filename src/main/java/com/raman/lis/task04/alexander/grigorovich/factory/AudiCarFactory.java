package com.raman.lis.task04.alexander.grigorovich.factory;

import com.raman.lis.task04.alexander.grigorovich.model.PassengerCar;
import com.raman.lis.task04.alexander.grigorovich.model.SportCar;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.*;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Lamborghini.LamborghiniDiameterWheel;
import com.raman.lis.task04.alexander.grigorovich.service.AdditionalOptionsService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeColorService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeWheelsService;

import java.util.Arrays;

public class AudiCarFactory extends CarFactory implements PassengerCarFactoryInterface,
        SportCarFactoryInterface {

    private StringBuffer stringBuffer = new StringBuffer();

    private final String BRAND = "AUDI";

    public AudiCarFactory(AdditionalOptionsService additionalOptionsService, ChangeColorService changeColorService,
                          ChangeWheelsService changeWheelsService) {
        super(additionalOptionsService, changeColorService, changeWheelsService);

        addCarInStorage(new PassengerCar(BRAND,
                AudiColor.BLACK_GOLD.getAudiColor(),
                AudiModel.AUDI_A4.getAudiModel(),
                super.getYEAR_OF_PRODUCTION(),
                AudiDiameterWheel.SEVENTEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.ONE_AND_NINE.getAudiVolumeEngine()));

        addCarInStorage(new PassengerCar(BRAND,
                AudiColor.WHITE.getAudiColor(),
                AudiModel.AUDI_A6.getAudiModel(),
                super.getYEAR_OF_PRODUCTION(),
                AudiDiameterWheel.SEVENTEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.TWO_AND_ZERO.getAudiVolumeEngine()));

        addCarInStorage(new SportCar(BRAND,
                AudiColor.BLACK.getAudiColor(),
                AudiModel.AUDI_A4.getAudiModel(),
                super.getYEAR_OF_PRODUCTION(),
                AudiDiameterWheel.EIGHTEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.TWO_AND_ZERO.getAudiVolumeEngine(),
                2, 1600));
    }

    @Override
    public void addressFactory() {
        System.out.println("Ingolstadt, Germany");
    }

    @Override
    public void printPossibleCompleteFactoryCar() {
        System.out.println(
                stringBuffer.append("List possible color " + BRAND + ": ")
                        .append(Arrays.toString(AudiColor.values()))
                        .append(",\n")
                        .append("List possible models " + BRAND + ": ")
                        .append(Arrays.toString(AudiModel.values()))
                        .append(",\n")
                        .append("List possible installed motors " + BRAND + " : ")
                        .append(Arrays.toString(AudiVolumeEngine.values()))
                        .append(",\n")
                        .append("List possible installed wheels " + BRAND + " : ")
                        .append(Arrays.toString(AudiDiameterWheel.values()))
                        .append(",\n")
                        .append("List possible additional options " + BRAND + " : ")
                        .append(Arrays.toString(AudiAdditionalOptions.values()))
                        .append(",\n"));
    }

    @Override
    public PassengerCar createNewPassengerCar(String color, String model,
                                              int diameterOfWheels, double volumeOfEngine)
            throws IllegalArgumentException {
        if (diameterOfWheels < AudiDiameterWheel.SIXTEENTH.getAudiDiameterWheel()
                && diameterOfWheels > AudiDiameterWheel.NINETEENTH.getAudiDiameterWheel()) {
            throw new IllegalArgumentException(
                    "This factory cannot create car with this parameters."
            );
        } else {
            return new PassengerCar(BRAND, color, model,
                    super.getYEAR_OF_PRODUCTION(), diameterOfWheels, volumeOfEngine);
        }
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
