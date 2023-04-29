import java.util.LinkedList;
import java.util.Queue;

public class AgenciaBancaria {

    public static void main(String[] args) {
        // Cria as filas de clientes
        Queue<String> filaNormal = new LinkedList<String>();
        Queue<String> filaPreferencial = new LinkedList<String>();

        // Adiciona clientes nas filas
        for(int i=1; i<=15; i++){
            filaNormal.add("normal " + i);
        }
        for(int i=1; i<=5; i++){
            filaPreferencial.add("preferencial " + i);
        }

        // Imprime as filas com os clientes
        System.out.println("Fila normal:");
        for(String cliente : filaNormal){
            System.out.println(cliente);
        }

        System.out.println("\nFila preferencial:");
        for(String cliente : filaPreferencial){
            System.out.println(cliente);
        }

        // Simula o atendimento dos clientes
        int numAtendidos = 0;
        while(numAtendidos < 20){
            // Chama três clientes normais e um preferencial
            for(int i=1; i<=3; i++){
                if(!filaNormal.isEmpty()){
                    String cliente = filaNormal.remove();
                    System.out.println("\nCliente chamado: " + cliente);
                    numAtendidos++;
                }
            }
            if(!filaPreferencial.isEmpty()){
                String cliente = filaPreferencial.remove();
                System.out.println("\nCliente chamado: " + cliente);
                numAtendidos++;
            }
        }
    }

}
