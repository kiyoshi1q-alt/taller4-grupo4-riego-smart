package com.uagraria.riego;

public class FabricaProducto {
    public static Producto crearProducto(String tipo, String nombre, double cantidad, double... extras) {
        return switch (tipo.toUpperCase()) {
            case "CULTIVO" -> new Cultivo(nombre, cantidad, extras[0]);
            case "TURNO_RIEGO" -> new TurnoRiego(nombre, cantidad, (int) extras[0], extras[1]);
            case "INSUMO_RIEGO" -> new InsumoRiego(nombre, cantidad, extras[0]);
            default -> throw new IllegalArgumentException("Tipo desconocido: " + tipo);
        };
    }
}
