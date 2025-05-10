package Questão4;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public Circulo(Circulo c) {
        this.raio = c.raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }
}