package HoraDeCodar.Exercicios;

import java.util.Scanner;

public class VCP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        int valorDoProduto = scanner.nextInt();

        if (valorDoProduto <= 49){
            System.out.println("Barato");
        } else if (valorDoProduto <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }
        scanner.close();
    }
}
