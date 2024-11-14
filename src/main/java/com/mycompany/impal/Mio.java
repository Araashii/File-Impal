package com.mycompany.impal;

public class Mio extends AutoCarRPL {
    public Mio(String bahanBakar, int kecepatan, Mesin mesin, Setir setir) {
        super(bahanBakar, kecepatan, mesin, setir);
    }

    @Override
    public void drive() {
        System.out.println("Mio is driving at a relaxed speed of: " + getKecepatan() + " km/h");
    }
}
