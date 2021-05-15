package com.raman.lis.task05.alexander.grigorovich.menu.department;


import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.SportCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.AudiCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.LamborghiniCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.VolvoCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.AdditionalOptions;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.Color;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SportDepartment extends Department {

    public SportDepartment(AudiCarFactory audiCarFactory, LamborghiniCarFactory lamborghiniCarFactory,
                           VolvoCarFactory volvoCarFactory) {
        super(audiCarFactory, lamborghiniCarFactory, volvoCarFactory);
    }

    public SportDepartment(String model, String color, String volumeOfEngine, int yearOfProduction,
                           String diameterOfWheels, ArrayList<String> additionalOptions,
                           ArrayList<AbstractCar> carsReadyForDelivery,
                           int numberOfSeats, int weightSportCar) {
        super(model, color, volumeOfEngine, yearOfProduction, diameterOfWheels,
                additionalOptions, carsReadyForDelivery, numberOfSeats,
                weightSportCar);

    }

    Scanner scanner = new Scanner(System.in);
    private SportCar sportCar;

    @Override
    public void department() throws CarException {
        while (true) {
            System.out.println("\nSelect operation:"
                    + "\n1 - List possible color, model, wheels, volume engine, additional options."
                    + "\n2 - Create new sport car."
                    + "\n3 - List car on storage."
                    + "\n4 - Order car from storage."
                    + "\n5 - Delivery list."
                    + "\n6 - BACK TO MAIN MENU."
                    + "\n7 - EXIT."
                    + "\nEnter the operation from 1 to 7.\n");
            if (scanner.hasNextInt()) {
                int codeTypeOperation = scanner.nextInt();
                switch (codeTypeOperation) {
                    case 1:
                        printPossibleCompleteCar();
                        break;
                    case 2:
                        orderCar();
                        break;
                    case 3:
                        listCarFromStorage();
                        break;
                    case 4:
                        orderCarFromStorage();
                        break;
                    case 5:
                        System.out.println("Delivery list:");
                        loadCarForDeliveryList();
                        break;
                    case 6:
                        return;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Try again enter the correct value.");
                }
            } else {
                System.out.println("Enter the correct value!");
                scanner.next();
                System.out.println();
            }
        }
    }

    @Override
    public void printPossibleCompleteCar() {
        System.out.println("\nList possible sport color:\n"
                + Arrays.toString(Color.values())
                + ",\nList possible sport models:\n"
                + Arrays.toString(SportModels.values())
                + ",\nList possible installed sport motors:\n"
                + Arrays.toString(SportVolumeEngine.values())
                + ",\nList possible installed sport  wheels:\n"
                + Arrays.toString(SportDiameterWheels.values())
                + ",\nList possible additional sport options:\n"
                + Arrays.toString(AdditionalOptions.values()));
    }

    @Override
    public void orderCar() {
        int orderModel;
        System.out.println("\nSelect model passenger car."
                + "\n1 - Audi."
                + "\n2 - Lamborghini."
                + "\n3 - BACK."
                + "\n4 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            orderModel = scanner.nextInt();
            printPossibleCompleteCar();
            switch (orderModel) {
                case 1:
                    enterNewSportCarParameters();
                    sportCar = audiCarFactory.createNewSportCar(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine(), getNumberOfSeats(), getWeightSportCar());
                    break;
                case 2:
                    enterNewSportCarParameters();
                    sportCar = lamborghiniCarFactory.createNewSportCar(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine(), getNumberOfSeats(), getWeightSportCar());
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Model with this name not found!");
            }
        } else {
            System.out.println("Enter the correct value!");
            scanner.next();
            System.out.println();
        }
        System.out.println("You order new car with next parameters:");
        sportCar.infoForPrint();
        saveCarForDeliveryList();
    }

    @Override
    public void listCarFromStorage() {
        int codeStorage;
        System.out.println("\nSelect model passenger car."
                + "\n1 - Audi."
                + "\n2 - Lamborghini."
                + "\n3 - BACK."
                + "\n4 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            codeStorage = scanner.nextInt();
            switch (codeStorage) {
                case 1:
                    audiCarFactory.listInfoAboutSportCarOnStorage();
                    break;
                case 2:
                    lamborghiniCarFactory.listInfoAboutSportCarOnStorage();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Model with this name not found!");
            }
        } else {
            System.out.println("Enter the correct value!");
            scanner.next();
            System.out.println();
        }
    }

    @Override
    public void orderCarFromStorage()  {
        System.out.println("\nSelect model passenger car."
                + "\n1 - Audi."
                + "\n2 - Lamborghini."
                + "\n3 - BACK."
                + "\n4 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            int codeStorage = scanner.nextInt();
            switch (codeStorage) {
                case 1:
                    enterNewSportCarParameters();
                    sportCar = audiCarFactory.getCarInSportStorage(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine(), getNumberOfSeats(), getWeightSportCar());
                    break;
                case 2:
                    enterNewSportCarParameters();
                    sportCar = volvoCarFactory.getCarInSportStorage(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine(), getNumberOfSeats(), getWeightSportCar());
                    ;
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Model with this name not found!");
            }
        } else {
            System.out.println("Enter the correct value!");
            scanner.next();
            System.out.println();
        }
        storage();
    }

}
