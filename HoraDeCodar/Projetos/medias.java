package HoraDeCodar.Projetos;

// Obter o nome do aluno e mais 3 notas
// Exibir mensagem com o nome e média final
// Se a nota for maior do que 7 vai esta como aprovado

import java.util.Scanner;

public class medias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nomeAluno = scanner.nextLine();

        System.out.println("Quanto você tirou na primeira prova? ");
        int primeiraNota = scanner.nextInt();

        System.out.println("Quanto você tirou na segunda prova? ");
        int segundaNota = scanner.nextInt();
        System.out.println("Quanto você tirou na terceira prova? ");
        int terceiraNota = scanner.nextInt();
        int media = (primeiraNota + segundaNota + terceiraNota) / 3;
        System.out.println("Olá: " + nomeAluno + ", sua média é: " + media);

        if(media >= 7) {
            System.out.println("Parabéns você foi aprovado!");

        } else {
            System.out.println("Você é burro(a)!");

        }

        scanner.close();

    }
}
