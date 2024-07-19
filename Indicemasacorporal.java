/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.indicemasacorporal;

/**
 *
 * @author al-ro
 */
import java.util.Scanner;

public class Indicemasacorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double kg = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = kg / (altura * altura);

        System.out.println("Su indice de masa corporal es: " + imc);

        scanner.close();
    }
}

