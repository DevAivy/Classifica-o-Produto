package HoraDeCodar.Condicionais;

// Problema com ==:
//                  Operador == compara as referencias da memoria, não o conteudo da string
//                  Pode retornar false mesmo que o conteudo das strings sejam iguais, se a referencia for diferente
//
// Uso do método equals():
//                  equals(): compara o conteudo da string, caractere por caractere
//                         É a maneira correta e segura de verificar se duas strings são iguais em valor
//
// equalsIgnoreCase():
//                   Variante do equals() que ignora diferenças entre maiúsculas e minúsculas

public class ComparacaoString {

    public static void main(String[] args) {

        String str = "java";
        String name = new String("JAVA");

        System.out.println(str = name);
        System.out.println(str.equals(name));
        System.out.println(str.equalsIgnoreCase(name));

    }
}
