/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author nohel
 */
public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2, String nombre, String color) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

  
    public double obtenerArea() {
        return lado1 * lado2;
    }


    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
