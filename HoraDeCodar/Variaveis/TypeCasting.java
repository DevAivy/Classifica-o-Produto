package HoraDeCodar.Variaveis;

// Casting implícito (Widening): Converte automaticamente tipos menores para tipos Maiores
// Casting Explícito (narrowing): Necessario quando se converte tipos maiores para tipos menores por exemplo, double e int podendo resultar em perda de dados
// Para realizar o casting explícito é necessario especificar o tipo de destino entre parênteses
public class TypeCasting {

    public static void main(String[] args) {

        // Implícito Widening
        int numero = 42;
        long numeroLong = numero;
        System.out.println(numeroLong);

        double numeroDuble = numero;
        System.out.println(numeroDuble);

        // Explícito narrwoing
        double valorDouble = 3.1415;
        // int valorInt = valorDouble (NÃO PODE)
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

        // casting char para int
        char letra = 'A';
        int codigoAscii = (int) letra;
        System.out.println(codigoAscii);

    }
}
