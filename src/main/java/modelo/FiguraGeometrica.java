/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public abstract class FiguraGeometrica {

    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract double calcularArea();

    public abstract void mover(double dx, double dy);

    @Override
    public String toString() {
        return "Figura: " + nombre;
    }
}