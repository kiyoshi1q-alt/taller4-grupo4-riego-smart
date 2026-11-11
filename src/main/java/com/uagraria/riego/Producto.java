package com.uagraria.riego;

public abstract class Producto {
    protected String nombre;
    protected double cantidad;

    public Producto(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public abstract double calcularCosto();

    public String getNombre() { return nombre; }
    public double getCantidad() { return cantidad; }
}
