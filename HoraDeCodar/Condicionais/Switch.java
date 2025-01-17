package HoraDeCodar.Condicionais;

// Switch: estrutura de controle que permite escolher entre varias opções com base no valor de uma expressão
// case: Define uma possivel opção ou caminho dentro do switch. Cada case é seguida por um valor especifico que é comparado com a expressão do switch;
// break: utilizado para encerrar a excução de um bloco case. Evita que o codigo caia nos casos seguintes
// Importante: Cada case deve terminar com um break (ou outro camando de desvio) para evitar a excução de outros casos
// Valores Exclusivos: os valores em case devem ser exclusivos e correspondentes ao tipo da expressão do switch;


import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int diaDaSemana = scanner.nextInt();

        switch(diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Número não encontrado!");
                break;
        }

    }
}
