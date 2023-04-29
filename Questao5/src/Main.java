import ProcessoJudicial.ProcessoJudiciario;
import java.util.Scanner;
import java.util.Stack;

public class GerenciadorDeProcessosJudiciarios {

    public static void main(String[] args) {
        Stack<ProcessoJudiciario> pilhaDeProcessos = new Stack<>();

public class GerenciadorDeProcessosJudiciarios {

    public static void main(String[] args) {
        Stack<ProcessoJudiciario> pilhaDeProcessos = new Stack<>();

        // Inclusão dos 10 processos judiciários na pilha
        pilhaProcessos.push(new ProcessoJudicial(1, "Processo 1", "Réu 1", "Solicitante 1"));
        pilhaProcessos.push(new ProcessoJudicial(2, "Processo 2", "Réu 2", "Solicitante 2"));
        pilhaProcessos.push(new ProcessoJudicial(3, "Processo 3", "Réu 3", "Solicitante 3"));
        pilhaProcessos.push(new ProcessoJudicial(4, "Processo 4", "Réu 4", "Solicitante 4"));
        pilhaProcessos.push(new ProcessoJudicial(5, "Processo 5", "Réu 5", "Solicitante 5"));
        pilhaProcessos.push(new ProcessoJudicial(6, "Processo 6", "Réu 6", "Solicitante 6"));
        pilhaProcessos.push(new ProcessoJudicial(7, "Processo 7", "Réu 7", "Solicitante 7"));
        pilhaProcessos.push(new ProcessoJudicial(8, "Processo 8", "Réu 8", "Solicitante 8"));
        pilhaProcessos.push(new ProcessoJudicial(9, "Processo 9", "Réu 9", "Solicitante 9"));
        pilhaProcessos.push(new ProcessoJudicial(10, "Processo 10", "Réu 10", "Solicitante 10"));

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Exibir lista de processos");
            System.out.println("2 - Priorizar um processo");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Lista de processos:");
                    for (ProcessoJudiciario processo : pilhaDeProcessos) {
                        System.out.println(processo);
                    }
                    break;
                case 2:
                    System.out.println("Selecione o número do processo a ser priorizado:");
                    int numeroPrioridade = scanner.nextInt();
                    Stack<ProcessoJudiciario> pilhaTemporaria = new Stack<>();
                    while (!pilhaDeProcessos.isEmpty()) {
                        ProcessoJudiciario processo = pilhaDeProcessos.pop();
                        if (processo.getNumero() == numeroPrioridade) {
                            System.out.println("Processo " + processo.getNumero() + " priorizado.");
                        } else {
                            pilhaTemporaria.push(processo);
                        }
                    }
                    while (!pilhaTemporaria.isEmpty()) {
                        pilhaDeProcessos.push(pilhaTemporaria.pop());
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }

}