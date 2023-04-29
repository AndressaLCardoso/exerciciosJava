 public class Jogador {
    private String nome;
    private int valor;
public Jogador(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
        }

public String getNome() {
        return nome;
        }

public int getValor() {
        return valor;
        }

@Override
public String toString() {
        return "Jogador [nome=" + nome + ", valor=" + valor + "]";
        }
        }