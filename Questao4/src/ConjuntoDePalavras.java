import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> palavras;

    public ConjuntoDePalavras(String... palavras) {
        this.palavras = new HashSet<>();
        for (String palavra : palavras) {
            this.palavras.add(palavra);
        }
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasSeparadas = palavras.split(" ");
        for (String palavra : palavrasSeparadas) {
            if (!this.palavras.contains(palavra)) {
                return false;
            }
        }
        return true;
    }
}