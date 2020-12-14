/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 *
 * @author danie
 */
public class Triangle {
    private float base;
    private float heigt;

    public Triangle(float base, float heigt) {
        this.base = base;
        this.heigt = heigt;
    }

    public Triangle() {
    }

    
    
   public float calculateArea(){
        return base * heigt;
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeigt() {
        return heigt;
    }

    public void setHeigt(float heigt) {
        this.heigt = heigt;
    }

    void setHeight(float nextFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

