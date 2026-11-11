package com.uagraria.riego;

import java.util.ArrayList;
import java.util.List;

public class SujetoAlerta {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void eliminarObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void notificar(Alerta alerta, String mensaje) {
        for (Observador obs : observadores) {
            obs.actualizar(alerta, mensaje);
        }
    }
}
