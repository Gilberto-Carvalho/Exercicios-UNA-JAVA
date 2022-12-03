import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        String c;
        int l, v;
        DecimalFormat df = new DecimalFormat("R$ ###,###,###,##0.00");
        Scanner key = new Scanner(System.in);
        System.out.print("Qual combustivel foi colocado? 'A-álcool e G-gasolina'\n");
        c=key.next();
        if (c.equalsIgnoreCase("g") || c.equalsIgnoreCase("a")) {
            System.out.print("Quantos litros foi vendido? ");
            l = key.nextInt();
            if (l>0) {
                if (c.equalsIgnoreCase("g")){
                    if (l>20){
                        System.out.print("O valor a ser pago com o desconto de 6% é de: " + df.format((2.5*l)*0.94));
                    } else {
                        System.out.print("O valor a ser pago com o desconto de 4% é de: " + df.format((2.5*l)*0.96));
                    }
                } else {
                    if (l > 20) {
                        System.out.print("O valor a ser pago com o desconto de 5% é de: " + df.format((1.9*l)*0.95));
                    } else {
                        System.out.print("O valor a ser pago com o desconto de 3% é de: " + df.format((1.9*l)*0.97));
                    }
                }
            }
        } else {
            System.out.print("Combustivel inválido");
        }
        key.close();
    }
}
