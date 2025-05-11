package Questão3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteTributavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe o saldo inicial da Conta Corrente: ");
            double saldoInicial = scanner.nextDouble();
            ContaCorrente conta = new ContaCorrente(saldoInicial);

            System.out.print("Informe o valor para saque: ");
            double valorSaque = scanner.nextDouble();
            conta.Sacar(valorSaque);

            System.out.print("Informe o valor para deposito: ");
            double valorDeposito = scanner.nextDouble();
            conta.Depositar(valorDeposito);

            System.out.println("Saldo atual: " + conta.ObterSaldo());
            System.out.println("Tributo da Conta Corrente: " + conta.calcularTributos());

            SeguroDeVida seguro = new SeguroDeVida();
            System.out.println("Tributo do Seguro de Vida: " + seguro.calcularTributos());

        } catch (ValorInvalidoException e) {
            System.out.println("Erro de valor: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida digite apenas números");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
