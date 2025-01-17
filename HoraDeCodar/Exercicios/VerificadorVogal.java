package HoraDeCodar.Exercicios;

import java.util.Scanner;

public class VerificadorVogal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letral");

        // char ta sendo usado para que ele pegue somente 1 caractere e não der erro ao digitar 2 caractes como AS
        char letra = scanner.nextLine().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }

    }
}
