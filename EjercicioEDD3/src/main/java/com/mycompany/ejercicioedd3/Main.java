/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

import java.util.Scanner;



/**
 *
 * @author danie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle triangleUser = new Triangle();
        System.out.println("¿Cual es la altura del triángulo?");
        Scanner reader = new Scanner(System.in);
        triangleUser.setHeight( reader.nextFloat());
        
        System.out.println("¿cual es la base del triángulo?");
        reader = new Scanner(System.in);
        triangleUser.setBase(reader.nextFloat());
        
        System.out.println("El area del triangulo introducido por el usuario es : " + triangleUser.calculateArea());
        
        Triangle triangleSystem = new Triangle();
        
        System.out.println("El área del triángulo del sistema es : "+ triangleSystem.calculateArea());
    }
    
}
 