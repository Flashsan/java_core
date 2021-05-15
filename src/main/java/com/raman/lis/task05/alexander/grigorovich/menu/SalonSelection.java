package com.raman.lis.task05.alexander.grigorovich.menu;

import com.raman.lis.task05.alexander.grigorovich.car.factory.AudiCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.LamborghiniCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.VolvoCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.service.AdditionalOptionsService;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeColorService;
import com.raman.lis.task05.alexander.grigorovich.car.service.ChangeWheelsService;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;
import com.raman.lis.task05.alexander.grigorovich.menu.department.PassengerDepartment;
import com.raman.lis.task05.alexander.grigorovich.menu.department.SportDepartment;
import com.raman.lis.task05.alexander.grigorovich.menu.department.TruckDepartment;

import java.util.Scanner;

public class SalonSelection {
    AdditionalOptionsService additionalOptionsService = new AdditionalOptionsService();
    ChangeColorService changeColorService = new ChangeColorService();
    ChangeWheelsService changeWheelsService = new ChangeWheelsService();

    AudiCarFactory audiCarFactory = new AudiCarFactory(additionalOptionsService,
            changeColorService,changeWheelsService);
    LamborghiniCarFactory lamborghiniFactory = new LamborghiniCarFactory(additionalOptionsService,
            changeColorService,changeWheelsService);
    VolvoCarFactory volvoCarFactory = new VolvoCarFactory(additionalOptionsService,
            changeColorService,changeWheelsService);

    PassengerDepartment passengerDepartment = new PassengerDepartment(audiCarFactory,
            lamborghiniFactory, volvoCarFactory);
    SportDepartment sportDepartment = new SportDepartment(audiCarFactory,
            lamborghiniFactory, volvoCarFactory);
    TruckDepartment truckDepartment = new TruckDepartment(audiCarFactory,
            lamborghiniFactory, volvoCarFactory);

    Scanner scanner = new Scanner(System.in);

    public void salonSelection() throws CarException {
        while (true) {
            int codeTypeDepartment;
            System.out.println("In which type car would you like to buy?"
                    + "\n1 - Passenger car."
                    + "\n2 - Sport car."
                    + "\n3 - Truck car."
                    + "\n4 - EXIT."
                    + "\nEnter the type car from 1 to 3.\n");
            if (scanner.hasNextInt()) {
                codeTypeDepartment = scanner.nextInt();
                switch (codeTypeDepartment) {
                    case 1:
                        passengerDepartment.department();
                        break;
                    case 2:
                        sportDepartment.department();
                        break;
                    case 3:
                        truckDepartment.department();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Department with this name not found!");
                }
            } else {
                System.out.println("Enter the correct value!");
                scanner.next();
            }
            System.out.println();
        }
    }

}









