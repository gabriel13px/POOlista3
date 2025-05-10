package Questão2;

public class Quadrado implements AreaCalculavel {
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    @Override
    public double CalculoArea() {
        return lado * lado;
    }
    @Override
    public String toString() {
        return "Area do Quadrado de Lado: " + lado+" é " + CalculoArea();
    }
}
