package com.raman.lis.task04.alexander.grigorovich;

import com.raman.lis.task04.alexander.grigorovich.factory.AudiCarFactory;
import com.raman.lis.task04.alexander.grigorovich.factory.LamborghiniCarFactory;
import com.raman.lis.task04.alexander.grigorovich.factory.VolvoCarFactory;
import com.raman.lis.task04.alexander.grigorovich.model.PassengerCar;
import com.raman.lis.task04.alexander.grigorovich.model.TruckCar;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiColor;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiDiameterWheel;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiModel;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Audi.AudiVolumeEngine;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Volvo.VolvoColor;
import com.raman.lis.task04.alexander.grigorovich.parametrs.Volvo.VolvoModel;
import com.raman.lis.task04.alexander.grigorovich.salon.Salon;
import com.raman.lis.task04.alexander.grigorovich.service.AdditionalOptionsService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeColorService;
import com.raman.lis.task04.alexander.grigorovich.service.ChangeWheelsService;

//В следующей домашке, попробую сделать проверку ввода лямбда-выражениями

public class Main {
    public static void main(String[] args) {

        AdditionalOptionsService additionalOptionsService = new AdditionalOptionsService();
        ChangeWheelsService changeWheelsService = new ChangeWheelsService();
        ChangeColorService changeColorService = new ChangeColorService();

        AudiCarFactory audiCarFactory = new AudiCarFactory(additionalOptionsService, changeColorService,
                changeWheelsService);
        LamborghiniCarFactory lamborghiniFactory = new LamborghiniCarFactory(additionalOptionsService,
         changeColorService, changeWheelsService);
        VolvoCarFactory volvoFactory = new VolvoCarFactory(additionalOptionsService,
         changeColorService, changeWheelsService);


        Salon salon = new Salon();

        PassengerCar passengerCar1 = salon.createNewAudiPassengerCar(audiCarFactory,
                AudiColor.BLACK_GOLD.getAudiColor(),
                AudiModel.AUDI_A4.getAudiModel(),
                AudiDiameterWheel.EIGHTEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.TWO_AND_ZERO.getAudiVolumeEngine());

        passengerCar1.info();
/*
        SportCar sportCar1 = salon.createNewAudiSportCar(audiCarFactory,
                AudiColor.BLACK_GOLD.getAudiColor(),
                AudiModel.AUDI_A4.getAudiModel(),
                AudiDiameterWheel.EIGHTEENTH.getAudiDiameterWheel(),
                AudiVolumeEngine.TWO_AND_ZERO.getAudiVolumeEngine(),
                2, 1600);

        sportCar1.info();
*/
        audiCarFactory.listInfoAboutCarOnStorage();
        System.out.println("________________________");
        audiCarFactory.getCarFromStorage(1);
        System.out.println("________________________");
        audiCarFactory.printPossibleCompleteFactoryCar();
        System.out.println("________________________");
        audiCarFactory.addressFactory();

        System.out.println("________________________");

        PassengerCar passengerCar2 = salon.createNewAudiPassengerCar(audiCarFactory,
                AudiColor.BLACK_GOLD.getAudiColor(),
                AudiModel.AUDI_A4.getAudiModel(),
                30,
                AudiVolumeEngine.TWO_AND_ZERO.getAudiVolumeEngine());

        passengerCar2.info();

        TruckCar truckCar1 = salon.createNewVolvoTruckCar(volvoFactory,
                VolvoColor.BLACK.getVolvoColor(),
                VolvoModel.VOLVO_FN.getVolvoModel(),
                35,
                7.9, 15_000);

        truckCar1.info();
    }


}
