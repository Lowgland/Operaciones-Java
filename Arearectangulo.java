/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearectangulo;

import java.util.Scanner;
/**
 *
 * @author al-ro
 */

public class Arearectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer lado del rectangulo: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingrese el segundo lado del rectangulo: ");
        int lado2 = scanner.nextInt();

        int area = lado1 * lado2;

        System.out.println("El rectangulo tiene: " + area + " metros cuadrados. ");
        
        scanner.close();
    }
}

