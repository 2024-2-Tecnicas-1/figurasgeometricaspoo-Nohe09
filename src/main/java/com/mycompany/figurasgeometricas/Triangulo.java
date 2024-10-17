/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurasgeometricas;

/**
 *
 * @author nohel
 */
public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    
    public double obtenerPerimetro() {
        
        return base + altura + Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
    }
}
