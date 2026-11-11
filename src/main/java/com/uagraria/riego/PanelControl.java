package com.uagraria.riego;

public class PanelControl implements Observador {
    @Override
    public void actualizar(Alerta alerta, String mensaje) {
        System.out.println("[Panel de Control] ⚠️ Recibida alerta: " + alerta);
        System.out.println("    Mensaje: " + mensaje);
        System.out.println("    Acción: Registrar evento en bitácora.\n");
    }
}
