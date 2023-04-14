import java.util.*;

public class CadastroAluno {
    private Queue<Aluno> filaAlunos;

    public CadastroAluno() {
        filaAlunos = new LinkedList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        filaAlunos.add(aluno);
    }

    public void ordenarPorMatricula() {
        List<Aluno> listaAlunos = new ArrayList<Aluno>(filaAlunos);
        Collections.sort(listaAlunos, new Comparator<Aluno>() {
            public int compare(Aluno a1, Aluno a2) {
                return Integer.compare(a1.getMatricula(), a2.getMatricula());
            }
        });
        filaAlunos = new LinkedList<Aluno>(listaAlunos);
    }

    public void imprimir() {
        for (Aluno aluno : filaAlunos) {
            System.out.println(aluno);
        }
    }
}
