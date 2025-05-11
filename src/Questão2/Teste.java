package Questão2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;

        while (true) {
            try {
                System.out.print("Quantidade de formas: ");
                quantidade = scanner.nextInt();
                if (quantidade <= 0) {
                    System.out.println("A quantidade deve ser maior que 0");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida digite um numero inteiro");
                scanner.nextLine();
            }
        }
        AreaCalculavel[] formas = new AreaCalculavel[quantidade];
        for (int i = 0; i < quantidade; i++) {
            while (true) {
                try {
                    System.out.println("\nEscolha a forma " + (i + 1) + ":");
                    System.out.println("1-Quadrado");
                    System.out.println("2-Retangulo");
                    System.out.println("3-Circulo");
                    System.out.println("4-Triangulo");
                    System.out.print("Opção: ");
                    int opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.print("Digite o lado do quadrado: ");
                            double lado = scanner.nextDouble();
                            formas[i] = new Quadrado(lado);
                            break;
                        case 2:
                            System.out.print("Digite a base do retangulo: ");
                            double baseR = scanner.nextDouble();
                            System.out.print("Digite altura do retangulo: ");
                            double alturaR = scanner.nextDouble();
                            formas[i] = new Retangulo(baseR, alturaR);
                            break;
                        case 3:
                            System.out.print("Digite o raio: ");
                            double raio = scanner.nextDouble();
                            formas[i] = new Circulo(raio);
                            break;
                        case 4:
                            System.out.print("Digite a base:");
                            double BaseTriangulo = scanner.nextDouble();
                            System.out.print("Digite a altura: ");
                            double AlturaTriangulo = scanner.nextDouble();
                            formas[i] = new Triangulo(BaseTriangulo, AlturaTriangulo);
                            break;
                        default:
                            System.out.println("Opçao inválida, escoha novamente");
                            continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida use apenas numeros");
                    scanner.nextLine();
                }
            }
        }

        for (AreaCalculavel forma : formas) {
            System.out.println(forma.toString());
        }
    }
}