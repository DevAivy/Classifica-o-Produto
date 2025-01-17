package HoraDeCodar.Variaveis;

// final: Define uma variavel como constante, impedindo que seu valor seja alterado após inicialização
// Uma vez atribuido o valor não pode ser modificado
// Boas praticas:  Usado para valors que não devem mudar durante a excução do programa, como PI ou taxas de juros
// Convenção de nomes: Constantes geralemente são nomeadas em letras maiusculas, com palavras separadas por sublinhados (_);

public class Constantes {

    public static void main(String[] args) {

        final int DIAS_DA_SEMANA = 7;
        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

    }
}
