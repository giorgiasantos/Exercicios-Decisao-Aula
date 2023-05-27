package ExerciciosCondicionais;

import java.util.Scanner;

public class PostoDeCombustiveis {
    public static void main(String[] args) {
        double valorAlcool = 1.9;
        double valorGasolina = 2.5;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos litros deseja abastecer? ");
        double litros = entrada.nextDouble();
        System.out.println("Digite G para gasolina ou A para álcool: ");
        String tipoCombustivel = entrada.next();

                if (tipoCombustivel.equalsIgnoreCase("G")) {
                    if(litros <= 20) {
                        double valorSemDesconto = litros * valorGasolina;
                        double desconto = valorSemDesconto * 0.04;
                        double valorComDesconto = (valorSemDesconto - desconto);
                        System.out.println("De R$ " + valorSemDesconto);
                        System.out.println("Por R$ " + valorComDesconto);
                    }else if (litros > 20) {
                        double valorSemDesconto = litros * valorGasolina;
                        double desconto = valorSemDesconto * 0.06;
                        double valorComDesconto = (valorSemDesconto - desconto);
                        System.out.println("De R$ " + valorSemDesconto);
                        System.out.println("Por R$ " + valorComDesconto);
                    }
                }else if (tipoCombustivel.equalsIgnoreCase("A")) {
                    if (litros <= 20) {
                        double valorSemDesconto = litros * valorGasolina;
                        double desconto = valorSemDesconto * 0.03;
                        double valorComDesconto = (valorSemDesconto - desconto);
                        System.out.println("De R$ " + valorSemDesconto);
                        System.out.println("Por R$ " + valorComDesconto);
                    } else if (litros > 20) {
                        double valorSemDesconto = litros * valorAlcool;
                        double desconto = valorSemDesconto * 0.05;
                        double valorComDesconto = (valorSemDesconto - desconto);
                        System.out.println("De R$ " + valorSemDesconto);
                        System.out.println("Por R$ " + valorComDesconto);
                    }
                }
        }


    }

