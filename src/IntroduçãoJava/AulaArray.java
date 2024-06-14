package IntroduçãoJava;

import java.util.Arrays;

public class AulaArray {
    public static void main(String[] args) {

        int [] numeros = new int[5];
        //Arrays trabalham com indicies indo de 0 a n-1 sendo N o números de espaços no array

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        // ----------------

        String [] letras = new String[5];

        letras[0] = "A";
        letras[1] = "D";
        letras[2] = "U";
        letras[3] = "Y";
        letras[4] = "Z";

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        // ---------------

        String [] letrasOutro = {"G", "A", "B", "R", "I", "E", "L"};

        System.out.println(Arrays.toString(letrasOutro));

        // ------------------

        int [] numerosOutro = {1, 3, 6, 8, 4};
        int maior = numerosOutro[0];
        int menor = numerosOutro[0];
        int media = 0;

        for (int i = 0; i < numerosOutro.length; i++){
            if (numerosOutro[i] > maior){
                maior = numerosOutro[i];
            }
            if (numerosOutro[i] < menor){
                menor = numerosOutro[i];
            }

            media += numerosOutro[i];
        }

        System.out.println(maior);
        System.out.println(menor);
        System.out.println(media/numerosOutro.length);



    }

}
