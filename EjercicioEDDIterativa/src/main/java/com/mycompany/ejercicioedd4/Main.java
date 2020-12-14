/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd4;

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
	int a,b;
	int r;
	int aux;
	
		
	
	System.out.print( "Introduzca entero positivo: ");
	a=teclado.nextInt();
	while( a<=0 ){
            System.out.println( "Error en la entrada.");
            System.out.print( "Introduzca entero positivo: ");
            a=teclado.nextInt();
	}
	System.out.print( "Introduzca entero positivo: ");
	b=teclado.nextInt();
	while( b<=0 ){
            System.out.println( "Error en la entrada.");
            System.out.print( "Introduzca entero positivo: ");
            b=teclado.nextInt();
	}
		
	if(a<b){
            aux=a;
            a=b;
            b=aux;
	}
		
	r=a%b;
	while(r!=0){
            a=b;
            b=r;
            r=a%b;
		}
		
	System.out.println("Máximo común divisor: "+b);
		
    }
    
}
