package Questão7;
import java.util.Scanner;

public class TestePrincipal {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();
        int QuantidadeAlunos = 1;

        for (int Aluno = 1; Aluno <= QuantidadeAlunos; Aluno++) {
            System.out.printf("Digite os dados do aluno %d:\n ", Aluno);

            int matricula = -1;
            do {
                try {
                    System.out.print("Matricula: ");
                    matricula = Integer.parseInt(Teclado.nextLine());
                    if (matricula <= 0) {
                        System.out.println("Matricula invalida digite um número positivo");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada invalida matrícula deve ser um numero");
                }catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                }
            } while (matricula <= 0);

            double ira = -1;
            do {
                try {
                    System.out.print("IRA (entre 0 e 10): ");
                    ira = Double.parseDouble(Teclado.nextLine());
                    if (ira < 0 || ira > 10) {
                        System.out.println("IRA invalido digite um valor entre 0 e 10");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada invalida IRA deve ser um numero");
                }catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                }
            } while (ira < 0 || ira > 10);

            String nome = "";
            do {
                System.out.print("Nome: ");
                nome = Teclado.nextLine();
            } while (nome.trim().isEmpty());

            String curso = "";
            do {
                System.out.print("Curso: ");
                curso = Teclado.nextLine();
            } while (curso.trim().isEmpty());

            Aluno aluno = new Aluno(matricula, nome, ira, curso);
            cadastro.adicionarAluno(aluno);
        }

        System.out.println("\nLista de alunos:");
        cadastro.imprimirAlunos();

        System.out.println("\nLista de alunos ordenada por matricula:");
        cadastro.ordenarPorMatricula();
        cadastro.imprimirAlunos();
    }
}