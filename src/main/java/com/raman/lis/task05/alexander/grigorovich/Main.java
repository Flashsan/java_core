package com.raman.lis.task05.alexander.grigorovich;


import com.raman.lis.task05.alexander.grigorovich.exception.CarException;
import com.raman.lis.task05.alexander.grigorovich.menu.SalonSelection;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws CarException, FileNotFoundException {

        SalonSelection salonSelection = new SalonSelection();
        salonSelection.salonSelection();

    }
}
