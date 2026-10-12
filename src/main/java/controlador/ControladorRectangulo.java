/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Punto;
import modelo.Rectangulo;

public class ControladorRectangulo {

    private Rectangulo rectangulo;

    public String crearRectangulo(double x1, double y1, double x2, double y2) {
        if (x1 == x2 || y1 == y2) {
            return "Las esquinas deben ser opuestas (x y y diferentes)";
        }
        rectangulo = new Rectangulo(new Punto(x1, y1), new Punto(x2, y2));
        return "Rectangulo creado:\n" + rectangulo.toString();
    }
}
