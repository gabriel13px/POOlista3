package Questão3;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldo) throws ValorInvalidoException {
        if (saldo < 0) {
            throw new ValorInvalidoException("Saldo inicial não pode ser negativo");
        }
        this.saldo = saldo;
    }

    public void Sacar(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException("Valor de saque não pode ser negativo");
        }
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void Depositar(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException("Valor de depósito não pode ser negativo");
        }
        saldo += valor;
    }

    public double ObterSaldo() {
        return saldo;
    }
}
