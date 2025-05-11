package Questão8;
import java.util.HashMap;
import java.util.Scanner;
import Questão7.Aluno;
public class TesteMapaAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Integer, Aluno> mapaAlunos = new HashMap<>();
        // creio que era pra ser a logica de buscar em um banco de dados, não acho que ia fazer sentido poder adcionar alunos nesse caso
        // eu espero que o enunciado tivesse errado e tivesse falando da questão 7
        Aluno aluno1 = new Aluno(2410339, "Gabriel Oliveira Da Silva", 10, "Engenharia da Comp");
        mapaAlunos.put(aluno1.getMatricula(), aluno1);
        Aluno aluno2 = new Aluno(2410449, "Clara", 9, "Engenharia da Comp");
        mapaAlunos.put(aluno2.getMatricula(), aluno2);
        Aluno aluno3 = new Aluno(2410559, "Mario", 9, "Engenharia da Comp");
        mapaAlunos.put(aluno3.getMatricula(), aluno3);
        Aluno aluno4 = new Aluno(2410669, "joão gui", 9, "Engenharia mecaninca");
        mapaAlunos.put(aluno4.getMatricula(), aluno4);
        Aluno aluno5 = new Aluno(2410779, "Carlos", 9, "Engenharia da Comp");
        mapaAlunos.put(aluno5.getMatricula(), aluno5);
        int matriculaBusca = -1;
        boolean matriculaValida = false;

        while (!matriculaValida) {
            try {
                System.out.print("Digite a matricula: ");
                matriculaBusca = teclado.nextInt();

                if (matriculaBusca <= 0) {
                    System.out.println("digite uma matrícula valida");
                } else {
                    matriculaValida = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: A matricula deve ser um numero valido");
            }catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        if (mapaAlunos.containsKey(matriculaBusca)) {
            Aluno alunoEncontrado = mapaAlunos.get(matriculaBusca);
            System.out.println("\nAluno encontrado:");
            System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
            System.out.println("Nome: " + alunoEncontrado.getNome());
            System.out.println("IRa: " + alunoEncontrado.getIra());
            System.out.println("Curso: " + alunoEncontrado.getCurso());
        } else {
            System.out.println("Aluno não encontrado");
        }
    }
}
