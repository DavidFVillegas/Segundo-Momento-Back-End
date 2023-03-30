package org.example;
import java.time.LocalDate;

class Antialergenico extends Medicamento {
    public Antialergenico(String nombre, double precioUnitarioSinIVA, String registroINVIMA, String fabricante,
                          LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precioUnitarioSinIVA, registroINVIMA, fabricante, fechaVencimiento, fechaFabricacion);
    }

    @Override
    public double calcularCostoConDescuento() {
        double precioConIVA = precioUnitarioSinIVA * 1.19;
        return precioConIVA * 0.92;
    }
}
