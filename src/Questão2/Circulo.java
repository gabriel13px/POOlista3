package Questão2;

public class Circulo implements AreaCalculavel{
    private double Raio;
    public Circulo(double raio){
        this.Raio = raio;
    }
    public double getRaio(){
        return Raio;
    }
    @Override
    public double CalculoArea() {
        return 3.14 * Math.pow(Raio, 2);

    }
    @Override
    public String toString() {
        return "Area do Circulo de Raio: " + Raio+" é " + CalculoArea();
    }
}
