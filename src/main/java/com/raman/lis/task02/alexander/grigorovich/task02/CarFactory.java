package com.raman.lis.task02.alexander.grigorovich.task02;

import java.util.Arrays;

public class CarFactory {

    private static final Car CAR = new Car();
    private int PRODUCTION_YEAR = 2021;
    Car[] carsInWareHouse = new Car[2];

    CarFactory() {
        carsInWareHouse[0] = new Car("White", "Audi A6", PRODUCTION_YEAR, 17, 1.9);
        carsInWareHouse[1] = new Car("Blue", "Audi A3", PRODUCTION_YEAR, 15, 1.4, new String[]{"Xenon", "Heated windshield"});

    }

    void listOfDifferentConfigurations() {
        Color[] color = Color.values();
        Model[] model = Model.values();
        VolumeEngine[] volumeEngines = VolumeEngine.values();
        DiameterWheel[] diameterWheel = DiameterWheel.values();
        AdditionalOptions[] additionalOptions = AdditionalOptions.values();

        System.out.println("List:" + "\n" +
                "List of colors use by factory: " + "\n" +
                Arrays.toString(color) + "\n" +
                "List of model use by factory: " + "\n" +
                Arrays.toString(model) + "\n" +
                "List of volume engine use by factory: " + "\n" +
                Arrays.toString(volumeEngines) + "\n" +
                "List of volume engine use by factory: " + "\n" +
                Arrays.toString(diameterWheel) + "\n" +
                "List of additional options use by factory: " + "\n" +
                Arrays.toString(additionalOptions));
    }


    void printInfoAboutCarInWareHouse() {

        for (int i = 0; i < carsInWareHouse.length; i++) {
            carsInWareHouse[i].printInfoAboutCar();
        }
    }

    Car createNewCar(String color, String model, int productionYear, int diameterWheel,
                     double volumeEngine) {
        Car newCar = new Car(color, model, PRODUCTION_YEAR, diameterWheel, volumeEngine);


        for (int i = 0; i < carsInWareHouse.length; i++) {
            if (newCar.equals(carsInWareHouse[i])) {
                newCar = carsInWareHouse[i];

                for (int j = 0; j < carsInWareHouse.length - 1; j++) {
                    carsInWareHouse[i] = carsInWareHouse[i + 1];
                }

                Car[] arrays = Arrays.copyOf(carsInWareHouse, carsInWareHouse.length - 1);
                carsInWareHouse = arrays;
                return newCar;

            }
        }
        return newCar;
    }

    Car getNewCarFromWareHouse(String color, String model, int diameterWheel,
                               double volumeEngine) {
        Car newCar = new Car(color, model, PRODUCTION_YEAR, diameterWheel, volumeEngine);
        for (int i = 0; i < carsInWareHouse.length; i++) {
            if (newCar.getModel().equals(carsInWareHouse[i].getModel())
            && (newCar.getProductionYear() == carsInWareHouse[i].getProductionYear())
            &&  (newCar.getVolumeEngine() == carsInWareHouse[i].getVolumeEngine())) {
                newCar = carsInWareHouse[i];

                for (int j = 0; j < carsInWareHouse.length - 1; j++) {
                    carsInWareHouse[i] = carsInWareHouse[i + 1];
                }

                Car[] arrays = Arrays.copyOf(carsInWareHouse, carsInWareHouse.length - 1);
                carsInWareHouse = arrays;
                return newCar;

            }else {
                System.out.println("Don't have car with this parameters!");
            return newCar;
            }
        }
        return newCar;
    }
}
