package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá dos números y el programa dira cual es mayor o si son iguales");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca el primer número entero");
        //Guardamos en la variable el primer valor
        double num1 = sc.nextDouble();
        //Pedimos al usuario que introduzca el segundo número
        System.out.println("Introduzca el segundo número entero");
        // Guardamos en la variable num2 el valor introducido
        double num2 = sc.nextDouble();

        //Se hacen las comparaciones para indicar si es multiplo o no
        if (num1>num2) {
            System.out.println("El numero mayor es: "+num1);
        } else if (num2>num1) {
            System.out.println("El número mayor es: "+num2);
        } else if (num1==num2) {
            System.out.println("Los numeros son iguales");
        }
    }

}
