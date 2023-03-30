package org.example;
import java.time.LocalDate;
class Antiinflamatorio extends Medicamento {
    public Antiinflamatorio(String nombre, double precioUnitarioSinIVA, String registroINVIMA, String fabricante,
                            LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        super(nombre, precioUnitarioSinIVA, registroINVIMA, fabricante, fechaVencimiento, fechaFabricacion);
    }

    @Override
    public double calcularCostoConDescuento() {
        double precioConIVA = precioUnitarioSinIVA * 1.19;
        return precioConIVA * 0.90;
    }
}
