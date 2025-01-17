package HoraDeCodar.Variaveis;

// var: permite ao compilador inferir o tipo de variavel com base no valor atribuido;
// Reduz a necessidade de escrever tipos longos e complexos, aumentando a legibilidade de codigo
// Tipo estatico: Embora o tipo seja inferido, ele é fixo  apos a atribuição e não pode ser alterado
// Regras: Deve ser inicializado no momento da declaração, e não pode ser usado para variaveis nao inicializadas;
// Boas Praticas: útil para tipos complexos ou quando o tipo é obvio a parti do contexto;

public class VAR {
    public static void main(String[] args) {

        var z = 10;
        z = 5;
        z = 2;
        // z = "Texto" NÃO PODE, não pode alterar alterar o tipo
        System.out.println(z);

        var text = "Bonitão";
        text = "Lindão";
        System.out.println(text);

    }
}
