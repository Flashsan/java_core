package com.raman.lis.task02.alexander.grigorovich.task02;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        MachineService machineService = new MachineService();
        AutoShowRoom autoShowRoom = new AutoShowRoom();


        Car car0 = new Car("Pink", "Mersedes", 1999, 17, 4.4, "Towbar", "another");
        car0.printInfoAboutCar();
        car0.setColor("Grey");
        car0.setDiameterWheel(21);
        car0.addAdditionalOption("Bluetooth");
        car0.printInfoAboutCar();

        System.out.println("");

        carFactory.listOfDifferentConfigurations();

        System.out.println("");

        carFactory.printInfoAboutCarInWareHouse();

        System.out.println("");

        Car car2 = carFactory.createNewCar(Color.WHITE.getColor(), Model.AUDI_A5.getModel(), 2021, DiameterWheel.SIXTEENTH.getDiameterWheel(), VolumeEngine.ONE_AND_NINE.getVolumeEngine());
        car2.printInfoAboutCar();
        machineService.changeDiameterWheel(car2, 21);
        car2.printInfoAboutCar();

        System.out.println("");

        Car car3 = autoShowRoom.OrderCarInFactory(Color.WHITE.getColor(), Model.AUDI_A6.getModel(),2021, DiameterWheel.SEVENTEENTH.getDiameterWheel(), VolumeEngine.ONE_AND_NINE.getVolumeEngine());
        autoShowRoom.addAdditionalOptionsInService(car3, AdditionalOptions.PARKTRONIC.getAdditionalOptions());
        car3.printInfoAboutCar();

        System.out.println("");

        Car car4 = autoShowRoom.OrderCarInFactory("White", "Audi A6", 2021, 17, 1.9);
        car4.printInfoAboutCar();

        System.out.println("");

        carFactory.printInfoAboutCarInWareHouse();

        System.out.println("");

        Car car5 = autoShowRoom.getCarFromWareHouseInFactory("White", "Audi A6", 17, 1.9);


    }
}

