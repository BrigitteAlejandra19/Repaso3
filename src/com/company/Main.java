package com.company;

public class Main {

    public static void main(String[] args) {

/*CONSIGNA:
Cierta empresa proporciona un bono mensual a sus trabajadores,
el cual puede ser por su antigüedad o bien por el monto de su sueldo (el que sea mayor),
de la siguiente forma:
Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
cuando es de 5 años o más, 30 %.
Ahora bien, el bono por concepto de sueldo, si éste es menor a $1000, se da 25% de éste,
cuando éste es mayor a $1000, pero menor o igual a $3500, se otorga 15% de su sueldo, para más de $3500, un 10%./*
 */

        Empleado empleado1 = new Empleado(1,5000.00);
        Empleado empleado2 = new Empleado(5,1000.00);


        System.out.println("El bono es: " + Bono.
                calcularBono(empleado1));

        System.out.println("El bono es: " + Bono.calcularBono(empleado2));
    }



}
