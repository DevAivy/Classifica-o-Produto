package HoraDeCodar.Exercicios;

import java.util.Scanner;

public class ValidacaoLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuário:");
        String nomeUsuário = scanner.nextLine();

        System.out.println("Digite sua senha:");
        int senhaUsuário = scanner.nextInt();

        if (nomeUsuário.equalsIgnoreCase("Admin") && senhaUsuário == 1234) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso Negado!");
        }

        scanner.close();
    }
}
