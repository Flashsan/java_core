package com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar;

public enum PassengerDiameterWheels {
    FIFTEEN("FIFTEEN"),
    SIXTEENTH("SIXTEENTH"),
    SEVENTEENTH("SEVENTEENTH"),
    EIGHTEENTH("EIGHTEENTH"),
    NINETEENTH("NINETEENTH");

    private String passengerDiameterWheels;

    PassengerDiameterWheels(String passengerDiameterWheels) {
        this.passengerDiameterWheels = passengerDiameterWheels;
    }

    public String getPassengerDiameterWheels() {
        return passengerDiameterWheels;
    }

    @Override
    public String toString() {
        return "PassengerDiameterWheels{" +
                "passengerDiameterWheels=" + passengerDiameterWheels +
                '}';
    }
}
