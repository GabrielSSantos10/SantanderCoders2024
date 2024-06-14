package IntroduçãoJava;

public class AulaFuncoes {
    public static void main(String[] args) {
        String nome = "Gabriel";
        saudacao(nome);

        int resultado = soma(5, 3);
        System.out.println(resultado);

    }

    public static void saudacao(String nomeParametro) {
        System.out.println("Hello," + nomeParametro);
    }

    public static int soma (int a, int b) {
        return a + b;
    }
}
