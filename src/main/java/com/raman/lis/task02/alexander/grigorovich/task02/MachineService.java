package com.raman.lis.task02.alexander.grigorovich.task02;

public class MachineService {

    void changeColor(Car car,String color) {
        car.setColor(color);
    }

    void changeDiameterWheel(Car car,int diameterWheel) {
        car.setDiameterWheel(diameterWheel);
    }

    void addAdditionalOption(Car car,String addOption) {
        car.addAdditionalOption(addOption);
    }

    void removeAdditionalOption(Car car,String removeOption) {
        car.removeAdditionalOption(removeOption);
    }

}



