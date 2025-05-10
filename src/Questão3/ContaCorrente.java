package Questão3;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(double saldo) throws ValorInvalidoException {
        super(saldo);
    }
    @Override
    public double calcularTributos() {
        return super.saldo * 0.01;
    }
}
