package com.raman.lis.task05.alexander.grigorovich.car;

public class SportCar extends AbstractCar {

    private int numberOfSeats;
    private int weightSportCar;

    public SportCar(String color, String model,
                    int yearOfProduction, String diameterOfWheels,
                    String volumeOfEngine,
                    int numberOfSeats, int weightSportCar) {

        super(color, model, yearOfProduction,
                diameterOfWheels, volumeOfEngine);
        this.numberOfSeats = numberOfSeats;
        this.weightSportCar = weightSportCar;
    }

    @Override
    public void infoForPrint() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Information about car:")
                .append("\ncolor: ").append(getColor())
                .append(",\nmodel: ").append(getModel())
                .append(",\nyearOfProduction: ").append(getYearOfProduction())
                .append(",\ndiameterOfWheels: ").append(getDiameterOfWheels())
                .append(",\nvolumeOfEngine: ").append(getVolumeOfEngine())
                .append(",\nnumberOfSeats: ").append(getNumberOfSeats())
                .append(",\nweightSportCar: ").append(getWeightSportCar());
        if (getAdditionalOptions() != null) {
            stringBuffer.append("\nadditionalOptions: ").append(getAdditionalOptions());
        } else {
            stringBuffer.append("\nCar don't have additional options!");
        }
        System.out.println(stringBuffer);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "color='" + getColor() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                ", diameterOfWheels=" + getDiameterOfWheels() +
                ", volumeOfEngine=" + getVolumeOfEngine() +
                ", numberOfSeats=" + getNumberOfSeats() +
                ", weightSportCar=" + getWeightSportCar() +
                ", additionalOptions=" + getAdditionalOptions() +
                '}';
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

}
