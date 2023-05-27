package ExerciciosCondicionais;

import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULE A SUA FOLHA DE PAGAMENTO");
        System.out.println("-------------------------------------------");

        System.out.println("Digite quantas horas você trabalha por mês: ");
        double horasTrabalhadas = entrada.nextDouble();
        System.out.println("Quanto você recebe por hora trabalhada?");
        double valorHora = entrada.nextDouble();

        System.out.println("SUA FOLHA DE PAGAMENTO EM DETALHES: ");
        System.out.println("-------------------------------------------");

        double salarioBruto = horasTrabalhadas * valorHora;
        System.out.println("SALÁRIO BRUTO = R$ " + salarioBruto);
        double inss = (10 * salarioBruto) /100;
        System.out.println("INSS = R$ " + inss);
        double fgts = (11 * salarioBruto) / 100;
        System.out.println("FGTS = R$ " + fgts);

        if(salarioBruto <= 900) {
            double impostoDeRenda = 0;
            System.out.println("IR = Isenção");
            System.out.println("TOTAL DE DESCONTOS = R$ " + inss);
            double salarioLiquido = salarioBruto - inss;
            System.out.println("SALÁRIO LÍQUIDO = R$ "+ salarioLiquido);
        }else if(salarioBruto <= 1500) {
            double impostoDeRenda = (5 * salarioBruto) / 100;
            System.out.println("IR = R$" + impostoDeRenda);
            double totalDescontos = impostoDeRenda + inss;
            System.out.println("TOTAL DE DESCONTOS = R$ " + totalDescontos);
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("SALÁRIO LÍQUIDO = R$ "+ salarioLiquido);
        }else if(salarioBruto <= 2500) {
            double impostoDeRenda = (10 * salarioBruto) / 100;
            System.out.println("IR = R$" + impostoDeRenda);
            double totalDescontos = impostoDeRenda + inss;
            System.out.println("TOTAL DE DESCONTOS = R$ " + totalDescontos);
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("SALÁRIO LÍQUIDO = R$ "+ salarioLiquido);
        }else {
            double impostoDeRenda = (20 * salarioBruto) / 100;
            System.out.println("IR = R$" + impostoDeRenda);
            double totalDescontos = impostoDeRenda + inss;
            System.out.println("TOTAL DE DESCONTOS = R$ " + totalDescontos);
            double salarioLiquido = salarioBruto - totalDescontos;
            System.out.println("SALÁRIO LÍQUIDO = R$ "+ salarioLiquido);
        }

    }
}
