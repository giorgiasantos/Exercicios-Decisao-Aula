package ExerciciosCondicionais;

import java.util.Scanner;

public class ExercicioExemplo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua primeira nota: ");
        double notaUm = entrada.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        double notaDois = entrada.nextDouble();
        double mediaFinal = (notaUm + notaDois) / 2;

        if (mediaFinal >= 7 && mediaFinal < 10) {
            System.out.println("Você foi aprovado!");
        } else if (mediaFinal == 10) {
            System.out.println("Você foi aprovado com honras!");
        } else {
            System.out.println("Você foi reprovado.");
        }


    }
}
