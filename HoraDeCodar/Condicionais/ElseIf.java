package HoraDeCodar.Condicionais;

// A estrutura condicional if/else permite ao programa avaliar uma expressão
// como sendo verdadeira ou falsa e
// de acordo com o resultado dessa verificação, executar uma ou outra rotina.

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String receptor = scanner.nextLine();
        if (receptor.equals("Carol")){
            System.out.println("Você é o amor da minha vida!");
        } else {
            System.out.println("Você é uma piranha");
        }
        scanner.close();
    }
}
