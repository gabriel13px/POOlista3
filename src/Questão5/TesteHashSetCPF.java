package Questão5;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<Integer> cpfs = new HashSet<>();
        int quantidade = 10;
        int tentativas = 0;
        while (tentativas < quantidade) {
            try {
                System.out.printf("CPF %d: ", tentativas + 1);
                int cpf = teclado.nextInt();

                if (cpf < 0) {
                    throw new IllegalArgumentException("CPF não pode ser negativo");
                }

                cpfs.add(cpf);
                tentativas++;

            } catch (NumberFormatException e) {
                System.out.println("Cpf invalido, digite apenas numeros inteiros");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        System.out.println("\nCPFs:");
        for (Integer cpf : cpfs) {
            System.out.println(cpf);
        }
    }
}
