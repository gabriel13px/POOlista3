package Questão7;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {
    private List<Aluno> listaAlunos;

    public CadastroAluno() {
        listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void ordenarPorMatricula() {
        for (int PosicaoAtual = 0; PosicaoAtual < listaAlunos.size() - 1; PosicaoAtual++) {
            for (int PosicaoComparada = 0; PosicaoComparada < listaAlunos.size() - PosicaoAtual - 1; PosicaoComparada++) {
                Aluno alunoAtual = listaAlunos.get(PosicaoComparada);
                Aluno proximoAluno = listaAlunos.get(PosicaoComparada + 1);
                if (alunoAtual.getMatricula() > proximoAluno.getMatricula()) {
                    listaAlunos.set(PosicaoComparada, proximoAluno);
                    listaAlunos.set(PosicaoComparada + 1, alunoAtual);
                }
            }
        }
    }
    public void imprimirAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println(aluno);
        }
    }
}