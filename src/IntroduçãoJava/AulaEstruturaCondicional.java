package IntroduçãoJava;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AulaEstruturaCondicional {
    public static void main(String[] args) {

        //int nota = -1;
        int nota = 100;
        String graduacao;

        // Se nota maior que 70, então aprovado
        //if-else
        if (nota >= 60){
            System.out.println(" - - Aluno aprovado! - - ");
        } else {
            System.out.println(" - - Não aprovado! - - ");
        }

        // A 80, B 70, C 60, D0
        //if-else if

        if (nota >= 80){
            // System.out.println("Graduação A");
            // graduacao = "Graduação A";
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            // System.out.println("Graduação B");
            // graduacao = "Graduação B";
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            // System.out.println("Graduação C");
            // graduacao = "Graduação C";
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            // System.out.println("Graduação D");
            // graduacao = "Graduação D";
            graduacao = "D";
        } else{
            graduacao = "";
        }

        // System.out.println(graduacao);

        switch (graduacao) {
            case "A" :
            case "B" :
                System.out.println("Aluno aprovado!");
                break;
            case "C" :
            case "D" :
                System.out.println("Aluno reprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
        }



    }

}
