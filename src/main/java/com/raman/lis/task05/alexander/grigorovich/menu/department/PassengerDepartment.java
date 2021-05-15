package com.raman.lis.task05.alexander.grigorovich.menu.department;


import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.PassengerCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.AudiCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.LamborghiniCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.VolvoCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.AdditionalOptions;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.Color;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

import java.util.ArrayList;
import java.util.Arrays;

public class PassengerDepartment extends Department {

    public PassengerDepartment(AudiCarFactory audiCarFactory,
                               LamborghiniCarFactory lamborghiniCarFactory,
                               VolvoCarFactory volvoCarFactory) {
        super(audiCarFactory, lamborghiniCarFactory, volvoCarFactory);
    }

    protected PassengerDepartment(String model, String color, String volumeOfEngine,
                                  int yearOfProduction, String diameterOfWheels,
                                  ArrayList<String> additionalOptions,
                                  ArrayList<AbstractCar> carsReadyForDelivery) {
        super(model, color, volumeOfEngine, yearOfProduction, diameterOfWheels,
                additionalOptions, carsReadyForDelivery);
    }

    private PassengerCar passengerCar;

    @Override
    public void department() throws CarException {
        while (true) {
            System.out.println("\nSelect operation:"
                    + "\n1 - List possible color, model, wheels, volume engine, additional options."
                    + "\n2 - Create new passenger car."
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
        System.out.println("\nList possible passenger color:\n"
                + Arrays.toString(Color.values())
                + ",\nList possible passenger models:\n"
                + Arrays.toString(PassengerModels.values())
                + ",\nList possible installed passenger motors:\n"
                + Arrays.toString(PassengerVolumeEngine.values())
                + ",\nList possible installed passenger  wheels:\n"
                + Arrays.toString(PassengerDiameterWheels.values())
                + ",\nList possible additional passenger options:\n"
                + Arrays.toString(AdditionalOptions.values()));
    }

    @Override
    public void orderCar() {
        int orderModel;
        System.out.println("\nSelect model passenger car."
                + "\n1 - Audi."
                + "\n2 - Volvo."
                + "\n3 - BACK."
                + "\n4 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            orderModel = scanner.nextInt();
            printPossibleCompleteCar();
            switch (orderModel) {
                case 1:
                    enterNewPassengerCarParameters();
                    passengerCar = audiCarFactory.createNewPassengerCar(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine());
                    break;
                case 2:
                    enterNewPassengerCarParameters();
                    passengerCar = volvoCarFactory.createNewPassengerCar(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine());
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
        passengerCar.infoForPrint();
        saveCarForDeliveryList();
    }

    @Override
    public void listCarFromStorage() {
        System.out.println("\nSelect model passenger car."
                + "\n1 - Audi."
                + "\n2 - Volvo."
                + "\n3 - BACK."
                + "\n4 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            int codeStorage;
            codeStorage = scanner.nextInt();
            switch (codeStorage) {
                case 1:
                    audiCarFactory.listInfoAboutPassengerCarOnStorage();
                    break;
                case 2:
                    volvoCarFactory.listInfoAboutPassengerCarOnStorage();
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
    public void orderCarFromStorage() throws CarException {
        System.out.println("\nSelect model passenger car."
                + "\n1 - Audi."
                + "\n2 - Volvo."
                + "\n3 - BACK."
                + "\n4 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            int codeStorage = scanner.nextInt();
            switch (codeStorage) {
                case 1:
                    enterNewPassengerCarParameters();
                    passengerCar = audiCarFactory.getCarInPassengerStorage(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine());
                    break;
                case 2:
                    enterNewPassengerCarParameters();
                    passengerCar = volvoCarFactory.getCarInPassengerStorage(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine());
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