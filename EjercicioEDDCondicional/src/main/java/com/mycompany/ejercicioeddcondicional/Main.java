/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioeddcondicional;

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
        Scanner teclado=new Scanner(System.in);
	int n1;
	int n2;
	int n3;
		
	System.out.println("Introzca un numero ");
	n1=teclado.nextInt();
		
	System.out.println("Introduzca un numero ");
	n2=teclado.nextInt();
		
	System.out.println("Introduzca un numero ");
	n3=teclado.nextInt();
		
	if ((n1==n2)&&(n2==n3)){
            System.out.print("Son iguales");
	}
		
	else{
            if ((n1==n2)||(n1==n3)||(n2==n3)){
		System.out.print("Hay dos iguales");
		}
       	    else{
		System.out.print("Son distintos");
            }
	}
    }
    
}
