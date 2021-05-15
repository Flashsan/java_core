package com.raman.lis.task05.alexander.grigorovich.menu.department;

import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.TruckCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.AudiCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.LamborghiniCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.VolvoCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.AdditionalOptions;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.Color;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TruckDepartment extends Department {

    Scanner scanner = new Scanner(System.in);
    private TruckCar truckCar;

    public TruckDepartment(AudiCarFactory audiCarFactory, LamborghiniCarFactory lamborghiniCarFactory,
                           VolvoCarFactory volvoCarFactory) {
        super(audiCarFactory, lamborghiniCarFactory, volvoCarFactory);
    }

    public TruckDepartment(String model, String color, String volumeOfEngine,
                           int yearOfProduction, String diameterOfWheels,
                           ArrayList<String> additionalOptions,
                           ArrayList<AbstractCar> carsReadyForDelivery,
                           int liftingCapacity) {
        super(model, color, volumeOfEngine, yearOfProduction,
                diameterOfWheels, additionalOptions, carsReadyForDelivery,
                liftingCapacity);
    }

    @Override
    public void department() throws CarException {
        while (true) {
            System.out.println("\nSelect operation:"
                    + "\n1 - List possible color, model, wheels, volume engine, additional options."
                    + "\n2 - Create new truck car."
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

    public void printPossibleCompleteCar() {
        System.out.println("List possible truck color: "
                + Arrays.toString(Color.values())
                + ",\nList possible truck models:"
                + Arrays.toString(TruckModels.values())
                + ",\nList possible installed truck motors:"
                + Arrays.toString(TruckVolumeEngine.values())
                + ",\nList possible installed truck wheels:"
                + Arrays.toString(TruckDiameterWheels.values())
                + ",\nList possible additional truck options:"
                + Arrays.toString(AdditionalOptions.values()));
    }


    @Override
    public void orderCar() {
        int orderModel;
        System.out.println("\nSelect model passenger car."
                + "\n1 - Volvo."
                + "\n2 - BACK."
                + "\n3 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            orderModel = scanner.nextInt();
            printPossibleCompleteCar();
            switch (orderModel) {
                case 1:
                    enterNewTruckCarParameters();
                    truckCar = volvoCarFactory.createNewTruckCar(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine(), getLiftingCapacity());
                    break;
                case 2:
                    return;
                case 3:
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
        truckCar.infoForPrint();
        saveCarForDeliveryList();
    }

    @Override
    public void listCarFromStorage() {
        int codeStorage;
        System.out.println("\nSelect model passenger car."
                + "\n1 - Volvo."
                + "\n2 - BACK."
                + "\n3 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            codeStorage = scanner.nextInt();
            switch (codeStorage) {
                case 1:
                    volvoCarFactory.listInfoAboutTruckCarOnStorage();
                    break;
                case 2:
                    return;
                case 3:
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
    public void orderCarFromStorage() {
        System.out.println("\nSelect model passenger car."
                + "\n1 - Volvo."
                + "\n2 - BACK."
                + "\n3 - EXIT."
                + "\nEnter the brand from 1 to 4.\n");
        if (scanner.hasNextInt()) {
            int codeStorage = scanner.nextInt();
            switch (codeStorage) {
                case 1:
                    enterNewTruckCarParameters();
                    truckCar = volvoCarFactory.getCarInTruckStorage(getColor(), getModel(),
                            getDiameterOfWheels(), getVolumeOfEngine(), getLiftingCapacity());
                    ;
                    break;
                case 2:
                    return;
                case 3:
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
