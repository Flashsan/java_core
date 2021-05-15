package com.raman.lis.task05.alexander.grigorovich.car.parametrs.passengerCar;

public enum PassengerVolumeEngine {
    ONE_AND_FOUR("ONE_AND_FOUR"),
    ONE_AND_SIX("ONE_AND_SIX"),
    ONE_AND_EIGHT("ONE_AND_EIGHT"),
    ONE_AND_NINE("ONE_AND_NINE"),
    TWO_AND_ZERO("TWO_AND_ZERO"),
    TWO_AND_TWO("TWO_AND_TWO"),
    TWO_AND_FIVE("TWO_AND_FIVE");

    private String passengerVolumeEngine;

    PassengerVolumeEngine(String passengerVolumeEngine) {
        this.passengerVolumeEngine = passengerVolumeEngine;
    }

    public String getPassengerVolumeEngine() {
        return passengerVolumeEngine;
    }

    @Override
    public String toString() {
        return "PassengerVolumeEngine{" +
                "passengerVolumeEngine=" + passengerVolumeEngine +
                '}';
    }
}
