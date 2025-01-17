package HoraDeCodar.Exercicios;

import java.util.Scanner;

public class ParidadeComString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int número = scanner.nextInt();
        String resultado = " ";
        if (número % 2 == 0){
            resultado = "Par";
        } else {
            resultado = "ímpar";
        }
        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}
