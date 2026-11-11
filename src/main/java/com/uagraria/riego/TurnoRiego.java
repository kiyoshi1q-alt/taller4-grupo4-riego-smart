package com.uagraria.riego;

public class TurnoRiego extends Producto {
    private int minutos;
    private double costoPorMinuto;

    public TurnoRiego(String nombre, double cantidad, int minutos, double costoPorMinuto) {
        super(nombre, cantidad);
        this.minutos = minutos;
        this.costoPorMinuto = costoPorMinuto;
    }

    @Override
    public double calcularCosto() {
        return cantidad * minutos * costoPorMinuto;
    }

    public int getMinutos() { return minutos; }
    public double getCostoPorMinuto() { return costoPorMinuto; }
}
