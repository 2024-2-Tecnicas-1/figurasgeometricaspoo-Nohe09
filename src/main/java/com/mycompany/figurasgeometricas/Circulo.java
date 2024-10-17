package com.mycompany.figurasgeometricas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nohel
 */
public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }

   
    public double obtenerArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
