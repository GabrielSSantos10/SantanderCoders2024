package IntroducaoJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class AulaManipulacaoStringDatas {
    public static void main(String[] args) {
        // Nosso objetivo: Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Gabriel";
        /*
        System.out.println(nome.toUpperCase()); // Coloca o texto da variável em maiúsculas
        System.out.println(nome.toLowerCase()); // Coloca o texto da variável em minúsculas
        System.out.println(nome.length()); // Conta quantas caracteres tem na string

        String nomeOutro = "Jessé";

        System.out.println(nome.equals(nomeOutro)); // Compara se é igual as strings
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); // Compara se é igual as strings mas ignora o case sensite
        */
        LocalDate hoje = LocalDate.now(); //LocalDate é uma biblioteca que configura para pegar as informações de data regional
        // e o .now para pegar as informações de hoje

        LocalDateTime agora = LocalDateTime.now(); //LocalDateTime é uma biblioteca que configura para pegar as horas regional
        // e o .now para pegar as informações atuais
        /*
        System.out.println(hoje); //mostra a data de hoje no padrão ISO 8601 (ANO-MÊS-DIA)
        System.out.println(hoje.getDayOfWeek()); //mostra o dia (Ex: Friday)

        System.out.println(agora); //mostra a data e hora no padrão ISO 8601 (hora-minuto-segundo-milessimos)
        System.out.println(agora.getHour()); //mostra somente a hora (Ex: 12)
        */
        Locale brasil = new Locale("pt", "BR"); //pega as informações de localidade para tradução

        /*
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); // getDisplayName configura o stilo do texto
        // e a linguagem que vai ser exibido
        /*

         */
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil); // transformar essa informação em uma string

        //Condicional para dizer se é de tarde, de manhã ou de noite
        String saudacao = "";
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }

        //printf monta a mensagem e depois pega os valores
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase()); // %s é para dizer que é uma variável do tipo string
        // e %n é para quebrar linha

    }

}
