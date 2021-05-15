package com.raman.lis.task03.alexander.grigorovich;

import com.raman.lis.task03.alexander.grigorovich.ENUM.Audi.*;
import com.raman.lis.task03.alexander.grigorovich.ENUM.Lamborghini.*;
import com.raman.lis.task03.alexander.grigorovich.ENUM.Volvo.*;
import com.raman.lis.task03.alexander.grigorovich.factory.*;
import com.raman.lis.task03.alexander.grigorovich.model.*;
import com.raman.lis.task03.alexander.grigorovich.salon.Salon;
import com.raman.lis.task03.alexander.grigorovich.service.*;

public class Main {
    public static void main(String[] args) {

        PassengerCar passengerCar = new PassengerCar();
        SportCar sportCar = new SportCar();
        TruckCar truckCar = new TruckCar();

        AudiFactory audiFactory = new AudiFactory(passengerCar, sportCar,truckCar);
        VolvoFactory volvoFactory = new VolvoFactory(passengerCar, sportCar,truckCar);
        LamborghiniFactory lamborghiniFactory = new LamborghiniFactory(passengerCar, sportCar,truckCar);

        AdditionalEquipmentService additionalEquipmentService = new AdditionalEquipmentService();
        PaintingService paintingService = new PaintingService();
        TireFittingService tireFittingService = new TireFittingService();

        Salon salon = new Salon();

        audiFactory.listOfModelCar();
        audiFactory.listOfInstalledMotors();
        audiFactory.listOfInstalledColor();
        audiFactory.listOfInstalledWheels();
        audiFactory.listOfInstalledAdditionalOptions();

        PassengerCar passengerCar1 = salon.createPassengerCarOnFactory(audiFactory,
                AudiColor.BLACK.getAudiColor(),
                AudiModel.AUDI_A4.getAudiModel(),
                AudiDiameterWheel.SIXTEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.ONE_AND_NINE.getAudiVolumeEngine());

        passengerCar1.info();
        audiFactory.listCarOnStorage();
        System.out.println("__________________________");
        salon.getCarFromStorage(audiFactory,1);
        System.out.println("__________________________");

        TruckCar truckCar1 = salon.createTruckCarOnFactory(volvoFactory,
                VolvoColor.BLACK.getVolvoColor(),
                VolvoModel.VOLVO_FN.getVolvoModel(),
                VolvoDiameterWheel.NINETEENTH.getVolvoDiameterWheel(),
                VolvoVolumeEngine.TWO_AND_FIVE.getVolvoVolumeEngine(),
                50_000);

        truckCar1.info();
        paintingService.changeColor(truckCar1,"Blue");
        System.out.println("__________________________");
        truckCar1.info();

        System.out.println("__________________________");

        SportCar sportCar1 = salon.createSportCarOnFactory(lamborghiniFactory,
                LamborghiniColor.RED.getLamborghiniColor(),
                LamborghiniModel.LAMBORGHINI_GALLARDO.getLamborghiniModel(),
                LamborghiniDiameterWheel.TWENTY_FIRST.getLamborghiniDiameter(),
                LamborghiniVolumeEngine.FIVE_AND_FOUR.getLamborghiniVolumeEngine(),
                2, 1700);

        sportCar1.info();
        System.out.println("__________________________");






    }

}
