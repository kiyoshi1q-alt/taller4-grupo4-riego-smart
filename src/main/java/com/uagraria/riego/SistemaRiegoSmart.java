package com.uagraria.riego;

public class SistemaRiegoSmart {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ALERTAS — RIEGO SMART ===\n");

        // 1. Creamos el sujeto de alertas
        SujetoAlerta gestorAlertas = new SujetoAlerta();

        // 2. Creamos y suscribimos observadores
        Observador correo = new SistemaNotificacion("Correo Institucional");
        Observador pantalla = new PanelControl();

        gestorAlertas.agregarObservador(correo);
        gestorAlertas.agregarObservador(pantalla);

        // 3. Disparamos las 3 alertas del grupo
        System.out.println("--- Emitiendo alerta 1/3 ---");
        gestorAlertas.notificar(Alerta.HUMEDAD_SUELO_BAJA,
                "El nivel de humedad del suelo descendió al 18%. Se recomienda activar riego.");

        System.out.println("--- Emitiendo alerta 2/3 ---");
        gestorAlertas.notificar(Alerta.TURNO_VENCIDO,
                "El turno de riego programado para las 06:00 ya venció. Verificar ejecución.");

        System.out.println("--- Emitiendo alerta 3/3 ---");
        gestorAlertas.notificar(Alerta.CUOTA_EXCEDIDA,
                "El consumo de agua de esta semana superó la cuota asignada en un 12%.");

        // 4. Probamos la Fábrica de Productos
        System.out.println("\n=== PRUEBA DE FÁBRICA DE PRODUCTOS ===");

        Producto cultivo = FabricaProducto.crearProducto("CULTIVO", "Maíz", 500, 0.75);
        System.out.println("✅ Producto: " + cultivo.getNombre() +
                " | Costo: $" + cultivo.calcularCosto());

        Producto turno = FabricaProducto.crearProducto("TURNO_RIEGO", "Parcela Norte", 2, 45, 0.50);
        System.out.println("✅ Producto: " + turno.getNombre() +
                " | Costo: $" + turno.calcularCosto());

        Producto insumo = FabricaProducto.crearProducto("INSUMO_RIEGO", "Fertilizante", 25.5, 12.80);
        System.out.println("✅ Producto: " + insumo.getNombre() +
                " | Costo: $" + insumo.calcularCosto());

        System.out.println("\n=== TODAS LAS PRUEBAS COMPLETADAS ===");
    }
}
