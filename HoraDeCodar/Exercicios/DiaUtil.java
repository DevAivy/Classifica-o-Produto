package HoraDeCodar.Exercicios;

import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7:");
        int numero = scanner.nextInt();
        switch (numero){
            case 1:
                System.out.println("Hoje é domingo");
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Hoje é Segunda-Feira");
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Hoje é Terça-Feira");
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Hoje é Quarta-Feira");
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Hoje é Quinta-Feira");
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Hoje é Sexta-Feira");
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Hoje é Sábado");
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Número Inválido");
                break;
        }
    }
}
