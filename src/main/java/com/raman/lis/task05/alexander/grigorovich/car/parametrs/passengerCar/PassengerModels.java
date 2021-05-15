package com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar;

public enum PassengerModels {

    AUDI_A3("AUDI_A3"),
    AUDI_A4("AUDI_A4"),
    AUDI_A5("Audi A5"),
    AUDI_A6("Audi A6"),

    VOLVO_S60("VOLVO_S60"),
    VOLVO_S80("VOLVO_S80"),
    VOLVO_V70("VOLVO_V70");

    private String passengerModels;

    PassengerModels(String passengerModels) {
        this.passengerModels = passengerModels;
    }

    public String getPassengerModels() {
        return passengerModels;
    }

    @Override
    public String toString() {
        return "PassengerModels{" +
                "passengerModels='" + passengerModels + '\'' +
                '}';
    }
}
