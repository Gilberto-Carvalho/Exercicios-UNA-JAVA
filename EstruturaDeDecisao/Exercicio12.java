import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        double s, h, v;
        DecimalFormat df = new DecimalFormat ("R$###,###,###,##0.00");
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Quantas horas você trabalhou no mês? ");
            h = sc.nextDouble();
            System.out.print("Qual o valor da sua hora? ");
            v = sc.nextDouble();
            s = h * v;
            System.out.println("+ SALÁRIO BRUTO: (" + df.format(v) + " * " + h + ") " + df.format(s));
            if (s>0 && s<=900){
                System.out.println("- IR (ISENTO): " + df.format(s * 0));
                System.out.println("- SINDICATO (3%): " + df.format(s * 0.03));
                System.out.println("- FGTS (11%): " + df.format(s * 0.11));
                System.out.println("TOTAL DE DESCONTOS: " + df.format(s * 0.14));
                System.out.println("SALÁRIO LÍQUIDO: " + df.format(s * 0.86));
            } else if (s>900 && s<=1500) {
                System.out.println("- IR (5%): " + df.format(s * 0.05));
                System.out.println("- SINDICATO (3%): " + df.format(s * 0.03));
                System.out.println("- FGTS (11%): " + df.format(s * 0.11));
                System.out.println("TOTAL DE DESCONTOS: " + df.format(s * 0.19));
                System.out.println("SALÁRIO LÍQUIDO: " + df.format(s * 0.81));
            } else if (s>1500 && s<=2500) {
                System.out.println("- IR (10%): " + df.format(s * 0.1));
                System.out.println("- SINDICATO (3%): " + df.format(s * 0.03));
                System.out.println("- FGTS (11%): " + df.format(s * 0.11));
                System.out.println("TOTAL DE DESCONTOS: " + df.format(s * 0.24));
                System.out.println("SALÁRIO LÍQUIDO: " + df.format(s * 0.76));
            } else if (s>2500) {
                System.out.println("- IR (20%): " + df.format(s * 0.2));
                System.out.println("- SINDICATO (3%): " + df.format(s * 0.03));
                System.out.println("- FGTS (11%): " + df.format(s * 0.11));
                System.out.println("TOTAL DE DESCONTOS: " + df.format(s * 0.34));
                System.out.println("SALÁRIO LÍQUIDO: " + df.format(s * 0.66));
            } else {
                System.out.print("Valor invalido.");
            }
        }
    }
}
