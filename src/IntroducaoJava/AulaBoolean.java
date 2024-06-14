package IntroducaoJava;

public class AulaBoolean {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        boolean vamosAPraiaAnd = fimDeSemana && fazendoSol;
        boolean vamosAPraiaOr = fimDeSemana || fazendoSol;

//        System.out.println(vamosAPraiaAnd);
//        System.out.println(vamosAPraiaOr);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de Semana";
        System.out.println(mensagem);

        /*
            Operador && (AND)
            true && true = true
            true && false = false
            false && true = false
            false && false = false
        */
        /*
            Operador || (OR)
            true || true = true
            true || false = true
            false || true = true
            false || false = false
       */

    }

}
