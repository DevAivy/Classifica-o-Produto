package HoraDeCodar.Exercicios;

import java.util.Scanner;

public class VerificacaoIntervalo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        if (numero <= 10 && numero >= 20); {
            System.out.println("Dentro do Intervalo!");
        }
        scanner.close();
    }
}
