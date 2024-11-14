package com.mycompany.impal;

public class AutoCarRPL implements Transportasi {
    private String bahanBakar;
    private int kecepatan;
    private Roda[] roda;
    private Mesin mesin;
    private Setir setir;

    public AutoCarRPL(String bahanBakar, int kecepatan, Mesin mesin, Setir setir) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        this.mesin = mesin;
        this.setir = setir;
        this.roda = new Roda[4]; 
        for (int i = 0; i < 4; i++) {
            this.roda[i] = new Roda("Standard"); 
        }
    }

    @Override
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public String getBahanBakar() {
        return bahanBakar;
    }

    @Override
    public int getKecepatan() {
        return kecepatan;
    }

    public void start() {
        System.out.println("AutoCarRPL started with engine type: " + mesin.getTipe());
    }

    public void drive() {
        System.out.println("AutoCarRPL is driving at speed: " + kecepatan + " km/h");
    }
}
