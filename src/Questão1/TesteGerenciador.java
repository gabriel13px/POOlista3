package Questão1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TesteGerenciador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Digite a renda: ");
                double renda = teclado.nextDouble();

                ContaCorrente conta = new ContaCorrente(renda);
                gerenciador.adicionar(conta);

                System.out.printf("Imposto da conta: R$ %.2f\n", conta.getValorImposto());

                int resposta = -1;
                while (resposta != 0 && resposta != 1) {
                    try {
                        System.out.print("Deseja adicionar outra conta? 1 - Sim / 0 - Não: ");
                        resposta = teclado.nextInt();
                        if (resposta != 0 && resposta != 1) {
                            System.out.println("Opção invalida Digite 1 - Sim / 0 - Não");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Erro: Digite apenas 1 ou 0.");
                        teclado.nextLine();
                    }
                }

                if (resposta == 0) {
                    continuar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Digite um valor numérico!");
                teclado.nextLine();

            } catch (NumeroNegativoException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.printf("\nTotal de imposto a pagar: R$ %.2f\n", gerenciador.getTotalTributos());
    }
}