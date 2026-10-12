/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Rectangulo extends FiguraGeometrica {

    private Punto esquina1;
    private Punto esquina2;

    public Rectangulo(Punto esquina1, Punto esquina2) {
        super("Rectangulo");
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
    }

    public Punto getEsquina1() { return esquina1; }
    public Punto getEsquina2() { return esquina2; }

    public double getBase() {
        return Math.abs(esquina2.getX() - esquina1.getX());
    }

    public double getAltura() {
        return Math.abs(esquina2.getY() - esquina1.getY());
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    public double calcularPerimetro() {
        return 2 * (getBase() + getAltura());
    }

    @Override
    public void mover(double dx, double dy) {
        esquina1.mover(dx, dy);
        esquina2.mover(dx, dy);
    }

    @Override
    public String toString() {
        return super.toString() + " | Esquina 1: " + esquina1 + " | Esquina 2: " + esquina2
                + " | Base: " + getBase() + " | Altura: " + getAltura();
    }
}