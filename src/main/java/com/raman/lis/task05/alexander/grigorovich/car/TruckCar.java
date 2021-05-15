package com.raman.lis.task05.alexander.grigorovich.car;

public class TruckCar extends AbstractCar {

    private int liftingCapacity;

    public TruckCar(String color, String model, int yearOfProduction,
                    String diameterOfWheels, String volumeOfEngine,
                    int liftingCapacity) {

        super(color, model, yearOfProduction,
                diameterOfWheels, volumeOfEngine);
        this.liftingCapacity = liftingCapacity;
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
                    .append(",\nliftingCapacity: ").append(getLiftingCapacity());
            if (getAdditionalOptions() != null) {
                stringBuffer.append("\nadditionalOptions: ").append(getAdditionalOptions());
            } else {
                stringBuffer.append("\nCar don't have additional options!");
            }
            System.out.println(stringBuffer);
        }

        @Override
        public String toString () {
            return "TruckCar{" +
                    "color='" + getColor() + '\'' +
                    ", model='" + getModel() + '\'' +
                    ", yearOfProduction=" + getYearOfProduction() +
                    ", diameterOfWheels=" + getDiameterOfWheels() +
                    ", volumeOfEngine=" + getVolumeOfEngine() +
                    ", liftingCapacity: " + liftingCapacity +
                    ", additionalOptions=" + getAdditionalOptions() +
                    '}';
        }

        public int getLiftingCapacity () {
            return liftingCapacity;
        }

        public void setLiftingCapacity ( int liftingCapacity){
            this.liftingCapacity = liftingCapacity;
        }
    }
