package HoraDeCodar.Projetos;

import java.util.Scanner;

public class ClassificacaoProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String produtoN1 = "Teclado";
        String produtoN2 = "Mouse";
        String produtoN3 = "Monitor";

        double value = 0;

        System.out.println("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        if (produtoN1.equalsIgnoreCase(produto) ||
            produtoN2.equalsIgnoreCase(produto) ||
            produtoN3.equalsIgnoreCase(produto)) {

            System.out.println("Produto já existe. Quer atualizar o preço? (Sim/Não)");

            String reply = scanner.nextLine();

            if (reply.equalsIgnoreCase("Sim")) {

                System.out.println("Insira um novo preço: ");
                value = scanner.nextDouble();

            } else {
                System.out.println("Preço não atualizado! ");
                scanner.close();
                return;
            }


        } else {
            System.out.println("Insira o preço do produto: ");
            value = scanner.nextDouble();
        }

        // Classificação de preço
        if (value < 50){
            System.out.println("Classificação: barato ");
        } else if (value >= 50 && value <= 100) {
            System.out.println("Classificação: moderado ");
        } else {
            System.out.println("Classificação: caro ");
        }

        System.out.println("Produto: " + produto + ". Preço: " + value);

        scanner.close();
    }
}
