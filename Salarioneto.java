/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarioneto;
import java.util.Scanner;
/**
 *
 * @author al-ro
 */
public class Salarioneto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su salario bruto mensual: ");
        double salB = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de impuestos: ");
        double por = scanner.nextDouble();

        System.out.print("Ingrese las deducciones adicionales: ");
        double dedu = scanner.nextDouble();

        double impuesto = salB * (por / 100);

        double salN = salB - impuesto - dedu;

        System.out.println("Su salario neto es: " + salN);

        scanner.close();
    }
}
