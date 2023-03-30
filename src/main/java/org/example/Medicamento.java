package org.example;
import java.time.LocalDate;

abstract class Medicamento {
    protected String nombre;
    protected double precioUnitarioSinIVA;
    protected String registroINVIMA;
    protected String fabricante;
    protected LocalDate fechaVencimiento;
    protected LocalDate fechaFabricacion;

    public Medicamento(String nombre, double precioUnitarioSinIVA, String registroINVIMA, String fabricante,
                       LocalDate fechaVencimiento, LocalDate fechaFabricacion) {
        this.nombre = nombre;
        this.precioUnitarioSinIVA = precioUnitarioSinIVA;
        this.registroINVIMA = registroINVIMA;
        this.fabricante = fabricante;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitarioSinIVA() {
        return precioUnitarioSinIVA;
    }

    public void setPrecioUnitarioSinIVA(double precioUnitarioSinIVA) {
        this.precioUnitarioSinIVA = precioUnitarioSinIVA;
    }

    public String getRegistroINVIMA() {
        return registroINVIMA;
    }

    public void setRegistroINVIMA(String registroINVIMA) {
        this.registroINVIMA = registroINVIMA;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public abstract double calcularCostoConDescuento();
}
