package Questão3;

public abstract class Conta {
    private double saldo;]
    public void Sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void Depositar(double valor) {
    saldo += valor;
    }
    public double ObterSaldo() {
    return saldo;
    }
}
