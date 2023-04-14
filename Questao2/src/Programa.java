import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroAluno cadastro = new CadastroAluno();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a matricula do aluno " + i + ":");
            int matricula = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o nome do aluno " + i + ":");
            String nome = scanner.nextLine();
            System.out.println("Digite o IRA do aluno " + i + ":");
            double ira = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Digite o curso do aluno " + i + ":");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, ira, curso);
            cadastro.adicionarAluno(aluno);
        }

        cadastro.ordenarPorMatricula();
        cadastro.imprimir();
    }
}