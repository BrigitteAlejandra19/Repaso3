package com.company;

public class Bono {


    public static Double calcularBono(Empleado empleado) {

        Double sueldo = empleado.getSueldo();

        Double bonoAntiguedad = bonoAntiguedad(empleado.getAntiguedad(), sueldo);
        Double bonoSueldo = bonoSueldo(sueldo);

        if (bonoSueldo > bonoAntiguedad) {
            return bonoSueldo;
        } else
            return bonoAntiguedad;

    }


    public static double bonoSueldo(Double sueldo) {


        /*Ahora bien, el bono por concepto de sueldo, si éste es menor a $1000, se da 25% de éste,
                cuando éste es mayor a $1000, pero menor o igual a $3500, se otorga 15% de su sueldo, para más de $3500, un 10%.*/
        if (sueldo <= 1000) {
            return sueldo * 0.25;
        } else if (sueldo <= 3500) {
            return sueldo * 0.15;
        } else return sueldo * 0.10;

    }


    public static Double bonoAntiguedad(Integer antiguedad, Double sueldo) {

        /*Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
cuando es de 5 años o más, 30 %.*/

        if (antiguedad > 2 && antiguedad <= 5) {
            return sueldo * 0.20;
        } else if (antiguedad > 5) {
            return sueldo * 0.30;
        } else return 0.00;
    }
}
