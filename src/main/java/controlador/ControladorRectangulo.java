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
      public String calcularAreaPerimetro() {
        if (rectangulo == null) {
            return "Primero cree el rectangulo";
        }
        return "Area: " + rectangulo.calcularArea() + "\nPerimetro: " + rectangulo.calcularPerimetro();
    }
      public String verificarPunto(double px, double py) {
        if (rectangulo == null) {
            return "Primero cree el rectangulo";
        }
        double x1 = rectangulo.getEsquina1().getX();
        double y1 = rectangulo.getEsquina1().getY();
        double x2 = rectangulo.getEsquina2().getX();
        double y2 = rectangulo.getEsquina2().getY();

        double xMin = Math.min(x1, x2);
        double xMax = Math.max(x1, x2);
        double yMin = Math.min(y1, y2);
        double yMax = Math.max(y1, y2);

        if (px >= xMin && px <= xMax && py >= yMin && py <= yMax) {
            return "El punto (" + px + ", " + py + ") SI esta dentro del rectangulo";
        } else {
            return "El punto (" + px + ", " + py + ") NO esta dentro del rectangulo";
        }
    }
}
