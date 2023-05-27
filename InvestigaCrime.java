package ExerciciosCondicionais;

import java.util.Scanner;

public class InvestigaCrime {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pontuacao = 0;

        //INSTRUÇÕES DO JOGO
        System.out.println("VAMOS INVESTIGAR UM CRIME!");
        System.out.println("RESPONDA AS PERGUNTAS COM S PARA SIM E N PARA NÃO.");
        System.out.println("-------------------------------------------------------");

        // PERGUNTA1
        System.out.println("Telefonou para a vítima?");
        String perg1 = entrada.next();

        if(perg1.equalsIgnoreCase("S")) {
            pontuacao += 1;
        } else if (perg1.equalsIgnoreCase("N")) {
            pontuacao += 0;
        }
        // PERGUNTA 2
        System.out.println("Esteve no local do crime?");
        String perg2 = entrada.next();

        if(perg2.equalsIgnoreCase("S")) {
            pontuacao += 1;
        } else if (perg2.equalsIgnoreCase("N")) {
            pontuacao += 0;
        }
        // PERGUNTA 3
        System.out.println("Mora perto da vítima?");
        String perg3 = entrada.next();

        if(perg3.equalsIgnoreCase("S")) {
            pontuacao += 1;
        } else if (perg3.equalsIgnoreCase("N")) {
            pontuacao += 0;
        }
        // PERGUNTA 4
        System.out.println("Devia para a vítima?");
        String perg4 = entrada.next();

        if(perg4.equalsIgnoreCase("S")) {
            pontuacao += 1;
        } else if (perg4.equalsIgnoreCase("N")) {
            pontuacao += 0;
        }
        // PERGUNTA 5
        System.out.println("Já trabalhou com a vítima?" );
        String perg5 = entrada.next();

        if(perg5.equalsIgnoreCase("S")) {
            pontuacao += 1;
        } else if (perg5.equalsIgnoreCase("N")) {
            pontuacao += 0;
        }

        // PONTUAÇÃO FINAL
        System.out.println("Você fez " + pontuacao + " pontos.");

        if (pontuacao == 2) {
            System.out.println("Você é suspeito(a)");
        } else if (pontuacao == 3 || pontuacao == 4) {
            System.out.println("Você é um cúmplice.");
        } else if (pontuacao == 5) {
            System.out.println("VOCÊ É O ASSASSINO!!!!");
        } else {
            System.out.println("Você é inocente.");
        }


    }
}
