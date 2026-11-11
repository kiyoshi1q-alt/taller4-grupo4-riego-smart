package com.uagraria.riego;

public class InsumoRiego extends Producto {
    private double precioPorKg;

    public InsumoRiego(String nombre, double cantidad, double precioPorKg) {
        super(nombre, cantidad);
        this.precioPorKg = precioPorKg;
    }

    @Override
    public double calcularCosto() {
        return cantidad * precioPorKg;
    }

    public double getPrecioPorKg() { return precioPorKg; }
}
