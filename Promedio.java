/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedio;

/**
 *
 * @author al-ro
 */
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        int prom = (num1 + num2 + num3)/3;

        System.out.println("El promedio es: " + prom);
        
        scanner.close();
    }
}