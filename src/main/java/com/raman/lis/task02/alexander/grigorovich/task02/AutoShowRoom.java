package com.raman.lis.task02.alexander.grigorovich.task02;

public class AutoShowRoom {
    private static final CarFactory CAR_FACTORY = new CarFactory();
    MachineService machineService = new MachineService();

    void changeColorInService(Car car, String color) {
        machineService.changeColor(car, color);
    }

    void changeDiameterWheelInService(Car car, int diameterWheel) {
        machineService.changeDiameterWheel(car, diameterWheel);
    }

    void addAdditionalOptionsInService(Car car, String addOption) {
        machineService.addAdditionalOption(car, addOption);
    }

    void removeAdditionalOptionsInService(Car car, String removeOption) {
        machineService.removeAdditionalOption(car, removeOption);
    }

    Car OrderCarInFactory(String color, String model, int productionYear ,int diameterWheel,
                          double volumeEngine) {
        return CAR_FACTORY.createNewCar(color, model, productionYear, diameterWheel, volumeEngine);
    }

    Car getCarFromWareHouseInFactory (String color, String model, int diameterWheel,
                                      double volumeEngine){
        return CAR_FACTORY.getNewCarFromWareHouse(color,model,diameterWheel,volumeEngine);
    }

}
