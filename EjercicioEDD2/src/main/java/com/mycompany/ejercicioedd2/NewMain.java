/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd2;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class NewMain {

        private static int age;
        private static float averageMark;
        private static String name;
        
        private static String questionAge = "Indique su edad a continuacion";
        private static String questionAvegareMark = "Indique su nota media a continuación";
        private static String questionName = "Indique su nombre a continuación";
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(questionAge);
        Scanner reader = new Scanner(System.in);
        age = reader.nextInt();
        
        System.out.println(questionAvegareMark);
        reader = new Scanner(System.in);
        averageMark = reader.nextFloat();
        
        System.out.println(questionName);
        reader = new Scanner(System.in);
        name = reader.nextLine();
        
        System.out.println("Los datos introducidos son:\n -Nombre: " + name + "\n -Nota media" + averageMark + "\n -edad: " + age + "");
       
    }
    
    
}



