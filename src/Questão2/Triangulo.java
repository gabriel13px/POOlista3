package Questão2;

public class Triangulo implements AreaCalculavel {
    private double base,altura;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public double CalculoArea() {
        return base*altura;
    }
    @Override
    public String toString() {
        return "Area do Triangulo de Base: " +base +" e Altura: " +altura +"é "+ CalculoArea();
    }
}
