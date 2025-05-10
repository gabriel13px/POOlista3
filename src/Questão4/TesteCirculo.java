package Questão4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TesteCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Circulo> circulos = new ArrayList<>();
        int quantidade = 5;
        int contador = 0;
        while (contador < quantidade) {
            try {
                System.out.print("Digite o raio do círculo " + (contador + 1) + ": ");
                double raio = scanner.nextDouble();

                if (raio < 0) {
                    throw new IllegalArgumentException("Raio não pode ser negativo.");
                }

                Circulo circulo = new Circulo(raio);
                circulos.add(circulo);
                contador++;

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        int numero = 1;
        for (Circulo circulo : circulos) {
            System.out.printf("Círculo %d: raio = %.2f, área = %.2f%n", numero++, circulo.getRaio(), circulo.calcularArea());
        }

    }
}