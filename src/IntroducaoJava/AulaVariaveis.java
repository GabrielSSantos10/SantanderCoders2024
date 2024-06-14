public class AulaVariaveis {
    public static void main(String[] args) {
        //------------String-------------
        String nome = "Let's Code";
        nome = "Jessé";
        nome = "Brasil";
        System.out.println("Olá, " + nome);

        //-------------Interger------------

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        //int divisao = a / b; Vai dar errado por que está inteiro
        float divisao = (float) a / b; //Usar um cast para transformar as variáveis a e b em float

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);


    }

}
