package com.mycompany.impal;

public class Impal {

    public static void main(String[] args) {
        // Create engine and steering components
        Mesin mesin = new Mesin("V8 Engine");
        Setir setir = new Setir("Power Steering");

        // Create an AutoCarRPL
        AutoCarRPL autoCar = new AutoCarRPL("Gasoline", 120, mesin, setir);
        autoCar.start();
        autoCar.drive();

        // Create a Mio (specialized version of AutoCarRPL)
        Mio mio = new Mio("Gasoline", 60, mesin, setir);
        mio.start();
        mio.drive();
    }
}
