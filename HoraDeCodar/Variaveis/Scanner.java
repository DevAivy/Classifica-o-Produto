package HoraDeCodar.Variaveis;

// A classe scanner é utlizada para ler a entrada de dados de usuario via console/terminal
// Parte do pacote java.util: Para usar o scanner, é necessario importar a classe do pacote java.util
// Scanner pode ler diferentes tipos de dados, como int, double, string, etc;
// Métodos comuns: nextLine(): Lê uma linha inteira do texto
//                 nextInt(): Lê um valor inteiro
//                 nextDouble(): Lê um valor decimal (Ponto Flutuante)
//                 next(): Lê uma unica palavra

// Problema nextLine(): Ao usar o nextLine() apos um nextInt ou nextDouble
// nextLine() captura caractere Enter Remanescente, resultando em uma leitura vazia
// Isso faz o programa parecer "Pular" a entrada de texto
// Solução: Adicionar nextLine() após a leitura dos numeros;

public class Scanner {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite seu nome: ");
        // Vai receber o valor escrito no terminal
        String nome = scanner.nextLine();
        // Exibe o valor
        System.out.println("Olá, " + nome + "!");

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Sua idade é: " + idade);

        scanner.close();

    }
}
