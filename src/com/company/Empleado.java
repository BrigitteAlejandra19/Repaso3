package com.company;

public class Empleado {

    private Integer antiguedad;
    private Double sueldo;

    public Empleado(Integer antiguedad, Double sueldo) {
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public Double getSueldo() {
        return sueldo;
    }
}
