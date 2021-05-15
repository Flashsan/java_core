package com.raman.lis.task05.alexander.grigorovich.menu.department;


import com.raman.lis.task05.alexander.grigorovich.car.AbstractCar;
import com.raman.lis.task05.alexander.grigorovich.car.PassengerCar;
import com.raman.lis.task05.alexander.grigorovich.car.SportCar;
import com.raman.lis.task05.alexander.grigorovich.car.TruckCar;
import com.raman.lis.task05.alexander.grigorovich.car.factory.AudiCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.LamborghiniCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.factory.VolvoCarFactory;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.Color;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar.PassengerVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.sportCar.SportVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckDiameterWheels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckModels;
import com.raman.lis.task05.alexander.grigorovich.car.parametrs.truckCar.TruckVolumeEngine;
import com.raman.lis.task05.alexander.grigorovich.exception.CarException;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Department {

    private String model;
    private int yearOfProduction = 2021;
    private String volumeOfEngine;
    private String color;
    private String diameterOfWheels;
    private int numberOfSeats;
    private int weightSportCar;
    private int liftingCapacity;

    private ArrayList<String> additionalOptions;
    private ArrayList<AbstractCar> carsReadyForDelivery;

    AbstractCar abstractCar;

    public Department(String model, String color, String volumeOfEngine,
                      int yearOfProduction, String diameterOfWheels,
                      ArrayList<String> additionalOptions,
                      ArrayList<AbstractCar> carsReadyForDelivery) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.volumeOfEngine = volumeOfEngine;
        this.diameterOfWheels = diameterOfWheels;
        this.additionalOptions = additionalOptions;
        this.carsReadyForDelivery = carsReadyForDelivery;
    }

    public Department(String model, String color, String volumeOfEngine,
                      int yearOfProduction, String diameterOfWheels,
                      ArrayList<String> additionalOptions,
                      ArrayList<AbstractCar> carsReadyForDelivery,
                      int numberOfSeats, int weightSportCar) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.volumeOfEngine = volumeOfEngine;
        this.diameterOfWheels = diameterOfWheels;
        this.additionalOptions = additionalOptions;
        this.carsReadyForDelivery = carsReadyForDelivery;
        this.numberOfSeats = numberOfSeats;
        this.weightSportCar = weightSportCar;
    }

    public Department(String model, String color, String volumeOfEngine,
                      int yearOfProduction, String diameterOfWheels,
                      ArrayList<String> additionalOptions,
                      ArrayList<AbstractCar> carsReadyForDelivery,
                      int liftingCapacity) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.volumeOfEngine = volumeOfEngine;
        this.diameterOfWheels = diameterOfWheels;
        this.additionalOptions = additionalOptions;
        this.carsReadyForDelivery = carsReadyForDelivery;
        this.liftingCapacity = liftingCapacity;
    }

    AudiCarFactory audiCarFactory;
    LamborghiniCarFactory lamborghiniCarFactory;
    VolvoCarFactory volvoCarFactory;

    public Department(AudiCarFactory audiCarFactory,
                      LamborghiniCarFactory lamborghiniCarFactory,
                      VolvoCarFactory volvoCarFactory) {
        this.audiCarFactory = audiCarFactory;
        this.lamborghiniCarFactory = lamborghiniCarFactory;
        this.volvoCarFactory = volvoCarFactory;
    }

    Scanner scanner = new Scanner(System.in);

    /**
     * The main method.Represent operation for selections.
     */
    public abstract void department() throws CarException;

    /**
     * The first operation method in department.
     * This method show possible color, models, volume engines,
     * diameter wheels,additional options
     */
    public abstract void printPossibleCompleteCar();

    /**
     * The second operation method in department.
     * This method creates an order for a new car.
     */
    public abstract void orderCar();

    /**
     * The third operation method in department.
     * This method list show available car
     */
    public abstract void listCarFromStorage();

    /**
     * The fourth operation method in department.
     * This method return car from storage do you want.
     */
    public abstract void orderCarFromStorage() throws CarException;

    /**
     * Method for enter value for create new passenger car
     */
    public void enterNewPassengerCarParameters() {
        System.out.println("Write color:");
        Color enumColor = null;
        while (enumColor == null) {
            color = scanner.nextLine();
            try {
                enumColor = Color.valueOf(color.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter color not found in enum color.");
            }
        }

        System.out.println("Write model:");
        PassengerModels enumModel = null;
        while (enumModel == null) {
            model = scanner.nextLine();
            try {
                enumModel = PassengerModels.valueOf(model.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter model not found in enum passenger model.");
            }
        }

        System.out.println("Write diameter wheels:");
        PassengerDiameterWheels enumWheels = null;
        while (enumWheels == null) {
            diameterOfWheels = scanner.nextLine();
            try {
                enumWheels = PassengerDiameterWheels.valueOf(diameterOfWheels.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter diameter wheels not found in enum passenger diameter wheels.");
            }
        }

        System.out.println("Write volume engine:");
        PassengerVolumeEngine enumEngine = null;
        while (enumEngine == null) {
            volumeOfEngine = scanner.nextLine();
            try {
                enumEngine = PassengerVolumeEngine.valueOf(volumeOfEngine.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter volume engine not found in enum passenger volume engine.");
            }
        }
        setColor(this.color);
        setModel(this.model);
        setDiameterOfWheels(this.diameterOfWheels);
        setDiameterOfWheels(this.diameterOfWheels);
    }

    /**
     * Method for enter value for create new sport car
     */
    public void enterNewSportCarParameters() {
        System.out.println("Write color:");
        Color enumColor = null;
        while (enumColor == null) {
            color = scanner.nextLine();
            try {
                enumColor = Color.valueOf(color.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter color not found in enum color.");
            }
        }

        System.out.println("Write model:");
        SportModels enumModel = null;
        while (enumModel == null) {
            model = scanner.nextLine();
            try {
                enumModel = SportModels.valueOf(model.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter model not found in enum passenger model.");
            }
        }

        System.out.println("Write diameter wheels:");
        SportDiameterWheels enumWheels = null;
        while (enumWheels == null) {
            diameterOfWheels = scanner.nextLine();
            try {
                enumWheels = SportDiameterWheels.valueOf(diameterOfWheels.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter diameter wheels not found in enum passenger diameter wheels.");
            }
        }

        System.out.println("Write volume engine:");
        SportVolumeEngine enumEngine = null;
        while (enumEngine == null) {
            volumeOfEngine = scanner.nextLine();
            try {
                enumEngine = SportVolumeEngine.valueOf(volumeOfEngine.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter volume engine not found in enum passenger volume engine.");
            }
        }

        System.out.println("Write number of seats:");
        if (scanner.hasNextInt()) {
            numberOfSeats = scanner.nextInt();
            if (numberOfSeats < 0 && numberOfSeats > 3) {
                throw new IllegalArgumentException("Enter number of seats must be in" +
                        " the range from 1 to 2.");
            }
        } else {
            System.out.println("Enter the correct value!");
            scanner.next();
        }

        System.out.println("Write weight sport car:");
        if (scanner.hasNextInt()) {
            weightSportCar = scanner.nextInt();
            if (numberOfSeats < 1_000 && numberOfSeats > 2_000) {
                throw new IllegalArgumentException("Enter weight sport car must be in " +
                        "the range from 1000 to 2000 kg.");
            }
        } else {
            System.out.println("Enter the correct value!");
            scanner.next();

        }

        setColor(this.color);
        setModel(this.model);
        setDiameterOfWheels(this.diameterOfWheels);
        setDiameterOfWheels(this.diameterOfWheels);
        setNumberOfSeats(this.weightSportCar);
        setWeightSportCar(this.weightSportCar);
    }

    /**
     * Method for enter value for create new truck car
     */
    public void enterNewTruckCarParameters() {
        System.out.println("Write color:");
        Color enumColor = null;
        while (enumColor == null) {
            color = scanner.nextLine();
            try {
                enumColor = Color.valueOf(color.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter color not found in enum color.");
            }
        }

        System.out.println("Write model:");
        TruckModels enumModel = null;
        while (enumModel == null) {
            model = scanner.nextLine();
            try {
                enumModel = TruckModels.valueOf(model.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter model not found in enum passenger model.");
            }
        }

        System.out.println("Write diameter wheels:");
        TruckDiameterWheels enumWheels = null;
        while (enumWheels == null) {
            diameterOfWheels = scanner.nextLine();
            try {
                enumWheels = TruckDiameterWheels.valueOf(diameterOfWheels.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter diameter wheels not found in enum passenger diameter wheels.");
            }
        }

        System.out.println("Write volume engine:");
        TruckVolumeEngine enumEngine = null;
        while (enumEngine == null) {
            volumeOfEngine = scanner.nextLine();
            try {
                enumEngine = TruckVolumeEngine.valueOf(volumeOfEngine.toUpperCase().trim());
            } catch (IllegalArgumentException e) {
                System.out.println("Enter volume engine not found in enum passenger volume engine.");
            }
        }

        System.out.println("Write lifting capacity car:");
        if (scanner.hasNextInt()) {
            weightSportCar = scanner.nextInt();
            if (liftingCapacity < 1_0000 && liftingCapacity > 3_0000) {
                throw new IllegalArgumentException("Enter lifting must be in " +
                        "the range from 10_000 to 30_000 kg.");
            }
        } else {
            System.out.println("Enter the correct value!");
            scanner.next();

        }

        setColor(this.color);
        setModel(this.model);
        setDiameterOfWheels(this.diameterOfWheels);
        setDiameterOfWheels(this.diameterOfWheels);
        setLiftingCapacity(this.liftingCapacity);
    }

    /**
     * This method for serializing car objects.
     */
    public void saveCarForDeliveryList() {
        ArrayList<AbstractCar> carsReadyForDelivery = new ArrayList<>();
        System.out.println("Save car as:\n"
                + "\n1-passenger car."
                + "\n2-sport car."
                + "\n3-truck car."
                + "\nSelect operation:");
        if (scanner.hasNextInt()) {
            int codeOperation = scanner.nextInt();
            switch (codeOperation) {
                case 1:
                    carsReadyForDelivery.add(new PassengerCar(getColor(), getModel(), getYearOfProduction(),
                            getDiameterOfWheels(), getVolumeOfEngine()));
                    break;
                case 2:
                    carsReadyForDelivery.add(new SportCar(getColor(), getModel(), getYearOfProduction(),
                            getDiameterOfWheels(), getVolumeOfEngine(),
                            getNumberOfSeats(), getWeightSportCar()));
                    break;
                case 3:
                    carsReadyForDelivery.add(new TruckCar(getColor(), getModel(), getYearOfProduction(),
                            getDiameterOfWheels(), getVolumeOfEngine(), getLiftingCapacity()));

                    break;
                default:
                    System.out.println("Operation not found.Try again!");
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("carsReadyForDelivery.data");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(carsReadyForDelivery);
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Written is successful in file carsReadyForDelivery.data");
        } else {
            System.out.println("Enter the correct value!");
            scanner.next();
            System.out.println();
        }

    }

    /**
     * This method for deserialize  abstract car objects
     * and show list save object on collection "carsReadyForDelivery"
     */
    public void loadCarForDeliveryList() {
        try {
            FileInputStream fileInputStream = new FileInputStream("carsReadyForDelivery.data");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            carsReadyForDelivery = (ArrayList<AbstractCar>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Reading file.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }
        for (AbstractCar car : carsReadyForDelivery) {
            System.out.println(car);
        }
    }

    /**
     * This method checks object for @null
     * and and offers to create a new car
     */
    public void storage() {
        if (abstractCar == null) {
            System.out.println("Car with you parameters absent.");
            System.out.println("Do you want order car?"
                    + "\n1 - YES"
                    + "\n2 - NO"
            );
            int enterCodeOperation = scanner.nextInt();
            switch (enterCodeOperation) {
                case 1:
                    orderCar();
                    break;
                case 2:
                    break;
            }
        } else {
            saveCarForDeliveryList();
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(String volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiameterOfWheels() {
        return diameterOfWheels;
    }

    public void setDiameterOfWheels(String diameterOfWheels) {
        this.diameterOfWheels = diameterOfWheels;
    }

    public ArrayList<String> getAdditionalOptions() {
        return additionalOptions;
    }

    public void setAdditionalOptions(ArrayList<String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    public ArrayList<AbstractCar> getCarsReadyForDelivery() {
        return carsReadyForDelivery;
    }

    public void setCarsReadyForDelivery(ArrayList<AbstractCar> carsReadyForDelivery) {
        this.carsReadyForDelivery = carsReadyForDelivery;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getWeightSportCar() {
        return weightSportCar;
    }

    public void setWeightSportCar(int weightSportCar) {
        this.weightSportCar = weightSportCar;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }
}

