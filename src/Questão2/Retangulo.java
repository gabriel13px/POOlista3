package Questão2;

public class Retangulo implements AreaCalculavel {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalculoArea() {
        return base * altura;
    }
    @Override
    public String toString() {
        return "Area do Retangulo de Base: " +base+" e Altura: " +altura +" é "+ CalculoArea();
    }
}
