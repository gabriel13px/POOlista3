package Questão7;
public class Aluno {
    private int matricula;
    private String nome;
    private double ira;
    private String curso;

    public Aluno(int matricula, String nome, double ira, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.ira = ira;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getIra() {
        return ira;
    }
    public String getCurso() {
        return curso;
    }
    //de onde que vem esse apostofo
    @Override
    public String toString() {
        return "Aluno: " + "matricula=" + matricula + ", nome='" + nome +  ", ira=" + ira + ", curso='" + curso;
    }
}