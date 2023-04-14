import java.util.Stack;

public class Programa {
        public static void main(String[] args) {
            var pilha = new Stack<Circulo>();
            pilha.push(new Circulo(2.5));
            pilha.push(new Circulo(3.0));
            pilha.push(new Circulo(4.2));
            pilha.push(new Circulo(1.8));
            pilha.push(new Circulo(5.5));

            while (!pilha.isEmpty()) {
                Circulo c = pilha.pop();
                System.out.println("Área do círculo de raio " + c.getRaio() + ": " + c.calcularArea());
            }
        }
}
