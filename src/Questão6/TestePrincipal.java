package Questão6;
import java.util.Scanner;
public class TestePrincipal {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       try {
           System.out.println("Digite palavras para formar o conjunto separadas por espaço:");
           String entradaConjunto = teclado.nextLine();

           if (entradaConjunto == null || entradaConjunto.trim().isEmpty()) {
               throw new ConjuntoVazioException("O conjunto de palavras não pode estar vazio");
           }

           ConjuntodePalavras conjunto = new ConjuntodePalavras(entradaConjunto);

           System.out.println("Digite as palavras a serem verificadas separadas por espaço:");
           String entradaVerificar = teclado.nextLine();

           if (entradaVerificar == null || entradaVerificar.trim().isEmpty()) {
               throw new ConjuntoVazioException("A string de verificação não pode estar vazia");
           }

           if (conjunto.contemTodas(entradaVerificar)) {
               System.out.println("Todas as palavras estão no conjunto");
           } else {
               System.out.println("Nem todas as palavras estão no conjunto");
           }

       } catch (ConjuntoVazioException e) {
           System.out.println("Erro: " + e.getMessage());
       } catch (Exception e) {
           System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
       }

   }
}
