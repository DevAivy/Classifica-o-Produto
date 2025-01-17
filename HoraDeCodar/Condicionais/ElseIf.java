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
        if (receptor.equals("Cxxl")){
            System.out.println("Vxxxx!");
        } else {
            System.out.println("xxxx");
        }
        scanner.close();
    }
}
