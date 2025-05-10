package Questão6;
import java.util.HashSet;
import java.util.Set;
public class ConjuntodePalavras {
    private Set<String> palavrasConjunto;

    public ConjuntodePalavras(String palavras) throws ConjuntoVazioException {
        palavrasConjunto = new HashSet<>();
        String[] lista = palavras.split(" ");
        for (String palavra : lista) {
            SetPalavra(palavra);
        }
    }
    public ConjuntodePalavras() throws ConjuntoVazioException {
        palavrasConjunto = new HashSet<>();
    }
    public void SetPalavra(String palavra) {
        palavrasConjunto.add(palavra);
    }

    public boolean contemTodas(String palavras) throws ConjuntoVazioException {
        String[] lista = palavras.split(" ");
        for (String palavra : lista) {
            if (!palavrasConjunto.contains(palavra)) {
                return false;
            }
        }
        return true;
    }
}
