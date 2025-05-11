package Questão1;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos = 0;
    public GerenciadorDeImpostoDeRenda() {
        totalTributos = 0;
    }
    public void adicionar(Tributavel t) {
        totalTributos += t.getValorImposto();
    }

    public double getTotalTributos() {
        return totalTributos;
    }
}