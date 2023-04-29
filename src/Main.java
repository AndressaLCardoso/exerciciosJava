import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Criar a lista de jogadores usando LinkedList
        LinkedList<Jogador> listaJogadores = new LinkedList<>();

        // Instanciar a lista com os 11 jogadores
        listaJogadores.add(new Jogador("Jogador1", 10));
        listaJogadores.add(new Jogador("Jogador2", 5));
        listaJogadores.add(new Jogador("Jogador3", 7));
        listaJogadores.add(new Jogador("Jogador4", 10));
        listaJogadores.add(new Jogador("Jogador5", 3));
        listaJogadores.add(new Jogador("Jogador6", 7));
        listaJogadores.add(new Jogador("Jogador7", 9));
        listaJogadores.add(new Jogador("Jogador8", 4));
        listaJogadores.add(new Jogador("Jogador9", 2));
        listaJogadores.add(new Jogador("Jogador10", 1));


        // Mesmo objeto adicionado mais de uma vez;
        removerObjetosRepetidos(listaJogadores);

        // Mais de um objeto com valores iguais;
        removerObjetosIguais(listaJogadores);

        // Remover objetos em posições diferentes na lista;
        removerObjetosPosicoes(listaJogadores);

        // Ordenar a lista usando a classe Comparator (criar um método para ordenação)
        ordenarLista(listaJogadores);
    }

    // Remover objetos repetidos na lista
    private static void removerObjetosRepetidos(LinkedList<Jogador> lista) {
        Iterator<Jogador> iterator = lista.iterator();
        while(iterator.hasNext()) {
            Jogador jogador = iterator.next();
            if(Collections.frequency(lista, jogador) > 1) {
                iterator.remove();
            }
        }
    }

    // Remover objetos com valores iguais na lista
    private static void removerObjetosIguais(LinkedList<Jogador> lista) {
        Iterator<Jogador> iterator = lista.iterator();
        while(iterator.hasNext()) {
            Jogador jogador = iterator.next();
            if(Collections.frequency(lista, jogador) > 1) {
                iterator.remove();
            }
        }
    }

    // Remover objetos em posições diferentes na lista
    private static void removerObjetosPosicoes(LinkedList<Jogador> lista) {
        lista.removeFirst(); // Remove o primeiro jogador da lista
        lista.removeLast(); // Remove o último jogador da lista
        lista.remove(2); // Remove o terceiro jogador da lista
    }

    // Ordenar a lista usando a classe Comparator
    private static void ordenarLista(LinkedList<Jogador> lista) {
        Comparator<Jogador> comparator = new Comparator<Jogador>() {
            @Override
            public int compare(Jogador jogador1, Jogador jogador2) {
                if(jogador1.getValor() > jogador2.getValor()) {
                    return -1;
                } else if(jogador1.getValor() < jogador2.getValor()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(lista, comparator);
    }
}