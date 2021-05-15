package com.raman.lis.task05.alexander.grigorovich.car;


public class PassengerCar extends AbstractCar {

    public PassengerCar(String color, String model, int yearOfProduction,
                        String diameterOfWheels, String volumeOfEngine) {

        super(color, model, yearOfProduction, diameterOfWheels,
                volumeOfEngine);
    }

    @Override
    public void infoForPrint()  {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Information about car:")
                .append("\ncolor: ").append(getColor())
                .append(",\nmodel: ").append(getModel())
                .append(",\nyearOfProduction: ").append(getYearOfProduction())
                .append(",\ndiameterOfWheels: ").append(getDiameterOfWheels())
                .append(",\nvolumeOfEngine: ").append(getVolumeOfEngine());
        if (getAdditionalOptions() != null) {
            stringBuffer.append("\nadditionalOptions: ").append(getAdditionalOptions());
        } else {
            stringBuffer.append("\nCar don't have additional options!");
        }
        System.out.println(stringBuffer);
    }


}
