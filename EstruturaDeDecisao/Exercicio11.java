import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double s;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Qual o seu salário? ");
            s = key.nextDouble();
            DecimalFormat df = new DecimalFormat("R$###,###,##0.00");
            if (s<=280 && s>0){
                System.out.println("Seu salário era: " + df.format(s));
                System.out.println("O percentual de aumento será de 20%");
                System.out.println("O valor do aumento será de: " + df.format(s*0.2));
                System.out.println("O seu novo salário será de: " + df.format(s*1.2));
            } else if (s<=700 && s>280) {
                System.out.println("Seu salário era: " + df.format(s));
                System.out.println("O percentual de aumento será de 15%");
                System.out.println("O valor do aumento será de: " + df.format(s*0.15));
                System.out.println("O seu novo salário será de: " + df.format(s*1.15));
            } else if (s<=1500 && s>700) {
                System.out.println("Seu salário era: " + df.format(s));
                System.out.println("O percentual de aumento será de 10%");
                System.out.println("O valor do aumento será de: " + df.format(s*0.1));
                System.out.println("O seu novo salário será de: " + df.format(s*1.1));
            } else if (s>1500) {
                System.out.println("Seu salário era: " + df.format(s));
                System.out.println("O percentual de aumento será de 5%");
                System.out.println("O valor do aumento será de: " + df.format(s*0.05));
                System.out.println("O seu novo salário será de: " + df.format(s*1.05));
            } else {
                System.out.print("Valor inválido!");
            }
        }
    }
}
