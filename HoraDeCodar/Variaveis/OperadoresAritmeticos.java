package HoraDeCodar.Variaveis;

// Adição +
// Subtração -
// Multiplicação *
// Divisão /
// Módulo %
// incremento ++ incrementar o valor de uma variavel em 1
// Decremento -- Decrementar o valor de uma variavel em 1
// Atribuição aditiva += Somar e Atribui o resultado a uma variavel
// Atribuição subtrativa -= Subtrai e atribui o resultado a uma variavel


public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int primario = 32;
        int secundario = 95;
        int terciario = 12;
        int perdiascontas = 23;
        int naosei = 64;
        System.out.println(primario + secundario);
        System.out.println(terciario - perdiascontas);
        System.out.println(naosei * primario);
        System.out.println(perdiascontas / terciario);
        System.out.println(perdiascontas % secundario);

        int x = 5;
        x++;
        x++;
        x++;
        x++;
        System.out.println(x);

        int y = 3;
        y--;
        y--;
        y--;
        y--;
        System.out.println(y);

        int a = 5;
        a+=5;
        System.out.println(a);

        int b = 5;
        b-=3;
        System.out.println(b);
    }
}
