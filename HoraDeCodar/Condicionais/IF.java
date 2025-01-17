package HoraDeCodar.Condicionais;

// é uma instrução condicional que permite que você execute um bloco de código somente
// se uma condição especificada for avaliada como verdadeira.

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        // IF Condição ternaria

        // Condição x < 5 ? EXPRESSÃO SE FOR TRUE "Ok" : EXPRESSÃO SE FOR False "Não Ok"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println(resultado);

    }
}
