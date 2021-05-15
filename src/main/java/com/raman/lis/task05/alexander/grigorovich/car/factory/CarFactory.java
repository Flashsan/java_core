package com.raman.lis.task05.alexander.grigorovich.car.factory;


import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.PassengerCar;
import com.raman.lis.task05.alexander.grigorovich.car.SportCar;
import com.raman.lis.task05.alexander.grigorovich.car.TruckCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.CarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.PassengerCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.SportCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.factory.factoryInterface.TruckCarFactoryInterface;
import com.raman.lis.task05.alexander.grigorovich.car.service.AdditionalOptionsService;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeColorService;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeWheelsService;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFactory implements CarFactoryInterface,
        PassengerCarFactoryInterface,
        TruckCarFactoryInterface,
        SportCarFactoryInterface {

    private final int YEAR_OF_PRODUCTION = 2021;

    private List<PassengerCar> passengerCarsStorage = new ArrayList<>();
    private List<TruckCar> truckCarsStorage = new ArrayList<>();
    private List<SportCar> sportCarsStorage = new ArrayList<>();

    private AdditionalOptionsService additionalOptionsService;
    private ChangeColorService changeColorService;
    private ChangeWheelsService changeWheelsService;

    public CarFactory(AdditionalOptionsService additionalOptionsService,
                      ChangeColorService changeColorService,
                      ChangeWheelsService changeWheelsService) {
        this.additionalOptionsService = additionalOptionsService;
        this.changeColorService = changeColorService;
        this.changeWheelsService = changeWheelsService;
    }

    public void listInfoAboutPassengerCarOnStorage() {
        Object[] carsArray = passengerCarsStorage.toArray();
        for (Object carsPassenger : carsArray) {
            System.out.println(carsPassenger);
        }
    }

    public void listInfoAboutSportCarOnStorage() {
        Object[] carsArray = sportCarsStorage.toArray();
        for (Object carsSport : carsArray) {
            System.out.println(carsSport);
        }
    }

    public void listInfoAboutTruckCarOnStorage() {
        Object[] carsArray = truckCarsStorage.toArray();
        for (Object carsTruck : carsArray) {
            System.out.println(carsTruck);
        }
    }

    protected void addPassengerCarInStorage(PassengerCar passengerCar) {
        passengerCarsStorage.add(passengerCar);
    }

    protected void addTruckCarInStorage(TruckCar truckCar) {
        truckCarsStorage.add(truckCar);
    }

    protected void addSportCarInStorage(SportCar sportCar) {
        sportCarsStorage.add(sportCar);
    }

    public PassengerCar getCarInPassengerStorage(String color, String model,
                                                 String diameterWheels, String volumeOfEngine) {
        for (int i = 0; i < passengerCarsStorage.size(); i++) {
            PassengerCar passengerCar = passengerCarsStorage.get(i);
            if (passengerCar.getColor().equals(color)
                    && passengerCar.getModel().equals(model)
                    && passengerCar.getDiameterOfWheels().equals(diameterWheels)
                    && passengerCar.getVolumeOfEngine().equals(volumeOfEngine)) {
                passengerCarsStorage.remove(passengerCar);
                return passengerCar;
            }
        }
        return null;
    }

    public SportCar getCarInSportStorage(String color, String model,
                                         String diameterOfWheels, String volumeOfEngine,
                                         int numberOfSeats, int weightSportCar) {
        for (int i = 0; i < sportCarsStorage.size(); i++) {
            SportCar sportCar = sportCarsStorage.get(i);
            if (sportCar.getColor().equals(color)
                    && sportCar.getModel().equals(model)
                    && sportCar.getDiameterOfWheels().equals(diameterOfWheels)
                    && sportCar.getVolumeOfEngine().equals(volumeOfEngine)
                    && sportCar.getNumberOfSeats() == numberOfSeats
                    && sportCar.getWeightSportCar() == weightSportCar) {
                sportCarsStorage.remove(sportCar);
                return sportCar;
            }
        }
        return null;
    }

    public TruckCar getCarInTruckStorage(String color, String model,
                                         String diameterOfWheels, String volumeOfEngine,
                                         int liftingCapacity) {
        for (int i = 0; i < truckCarsStorage.size(); i++) {
            TruckCar truckCar = truckCarsStorage.get(i);
            if (truckCar.getColor().equals(color)
                    && truckCar.getModel().equals(model)
                    && truckCar.getDiameterOfWheels().equals(diameterOfWheels)
                    && truckCar.getVolumeOfEngine().equals(volumeOfEngine)
                    && truckCar.getLiftingCapacity() == liftingCapacity) {
                truckCarsStorage.remove(truckCar);
                return truckCar;
            }
        }
        return null;
    }

    public PassengerCar createNewPassengerCar(String model, String color,
                                              String volumeOfEngine,
                                              String diameterOfWheels) throws IllegalArgumentException {
        if (model != null
                || color != null
                || volumeOfEngine != null
                || diameterOfWheels != null) {
            System.out.println("create new passenger car");
            return new PassengerCar(color, model,
                    getYEAR_OF_PRODUCTION(), diameterOfWheels, volumeOfEngine);
        } else {
            throw new IllegalArgumentException(
                    "This factory cannot create car with this parameters.");
        }
    }

    public SportCar createNewSportCar(String color, String model,
                                      String diameterOfWheels, String volumeOfEngine,
                                      int numberOfSeats, int weightSportCar) throws IllegalArgumentException {
        if ((numberOfSeats > 0 && numberOfSeats < 3)
                || (weightSportCar > 999 && weightSportCar < 3001)) {
            return new SportCar(color, model, getYEAR_OF_PRODUCTION(),
                    diameterOfWheels, volumeOfEngine, numberOfSeats, weightSportCar);
        } else {
            throw new IllegalArgumentException(
                    "This factory cannot create car with this parameters."
            );
        }
    }

    public TruckCar createNewTruckCar(String color, String model,
                                      String diameterOfWheels, String volumeOfEngine,
                                      int liftingCapacity) throws IllegalArgumentException {
        if ((liftingCapacity > 9999 && liftingCapacity < 30001)) {
            return new TruckCar(color, model,
                    getYEAR_OF_PRODUCTION(), diameterOfWheels, volumeOfEngine, liftingCapacity);
        } else {
            throw new IllegalArgumentException(
                    "This factory cannot create car with this parameters."
            );
        }
    }

    protected void addAdditionalOptionsOnService(AdditionalOptionsService additionalOptionsService,
                                                 AbstractCar abstractCar,
                                                 String option) throws CarException {
        additionalOptionsService.addAdditionalOptions(abstractCar, option);
    }

    protected void removeAdditionalOptionsOnService(AdditionalOptionsService additionalOptionsService,
                                                    AbstractCar abstractCar,
                                                    String option) throws CarException {
        additionalOptionsService.removeAdditionalOptions(abstractCar, option);
    }

    protected void changeColorOnService(ChangeColorService changeColorService,
                                        AbstractCar abstractCar,
                                        String color) throws CarException {
        changeColorService.changeColor(abstractCar, color);
    }

    protected void changeWheelsOnService(ChangeWheelsService changeWheelsService,
                                         AbstractCar abstractCar,
                                         String diameterWheels) throws CarException {
        changeWheelsService.changeWheels(abstractCar, diameterWheels);
    }

    protected int getYEAR_OF_PRODUCTION() {
        return YEAR_OF_PRODUCTION;
    }
}


