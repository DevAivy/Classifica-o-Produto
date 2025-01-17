package HoraDeCodar.Projetos;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em KG: ");

        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em Metros: ");

        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Sua Classificação é: " + imc + " Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Sua Classificação é: " + imc + " Você está com peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sua Classificação é: " + imc + " Você está com sobrepeso.");
        } else {
            System.out.println("Sua Classificação é: " + imc + " Você está com obesidade.");
        }
        scanner.close();
    }
}
