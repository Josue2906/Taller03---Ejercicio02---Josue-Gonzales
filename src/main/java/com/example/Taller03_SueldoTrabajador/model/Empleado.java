package com.example.Taller03_SueldoTrabajador.model;


public class Empleado {
    private double sueldoBase;
    private int horasExtra;

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    // Método para calcular el sueldo total a pagar
    public double calcularSueldoTotal() {
        double tarifaPorHora = sueldoBase / 160;
        return sueldoBase + (horasExtra * 8);  // 8 es el pago por hora extra
    }
}
