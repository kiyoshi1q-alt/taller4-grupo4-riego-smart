package com.uagraria.riego;

public class SistemaNotificacion implements Observador {
    private String nombre;

    public SistemaNotificacion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Alerta alerta, String mensaje) {
        System.out.println("[" + nombre + "] 🔔 ALERTA: " + alerta);
        System.out.println("    → " + mensaje);
    }

    public String getNombre() { return nombre; }
}
