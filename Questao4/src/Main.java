public class Main {
    public static void main(String[] args) {
        ConjuntoDePalavras conjunto = new ConjuntoDePalavras("Java", "programação", "IntelliJ", "IDE");
        String palavras = "programação Java IDE";
        boolean contemTodas = conjunto.contemTodas(palavras);
        System.out.println(contemTodas); // imprime "true"
    }
}


