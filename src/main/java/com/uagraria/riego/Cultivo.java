package com.uagraria.riego;

public class Cultivo extends Producto {
    private double precioUnitario;

    public Cultivo(String nombre, double cantidad, double precioUnitario) {
        super(nombre, cantidad);
        this.precioUnitario = precioUnitario;
    }

    @Override
    public double calcularCosto() {
        return cantidad * precioUnitario;
    }

    public double getPrecioUnitario() { return precioUnitario; }
}
