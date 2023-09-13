package com.systechafrica.understandingclasses;

import com.systechafrica.understandingclasses.automobiles.BikeX;
import com.systechafrica.understandingclasses.automobiles.CarsX;

public class Allthem {
    
    private static CarsX car;
    private static BikeX bike;
    public static void main(String[] args) {
        CarsX car = new CarsX();
        BikeX bike = new BikeX();

        bike.kick();
        car.key();
    }
}
