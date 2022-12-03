import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int s, ce, ci, de, cin, um;
        DecimalFormat df = new DecimalFormat("##0.00");
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite um valor inteiro entre 10,00 a 600,00 reias para ser sacado: ");
            s=key.nextInt();
            if (s<10 || s>600){
                System.out.print("Valor inválido");
            } else {
                ce=s/100;
                ci=(s%100)/50;
                de=((s%100)%50)/10;
                cin=(((s%100)%50)%10)/5;
                um=((((s%100)%50)%10)%5);
                System.out.println("Para sacar o valor de " + df.format(s) + " reais, o caixa emitirá: ");
                if (ce>0){
                    if (ce==1){
                        System.out.println(ce + " nota de cem reais");
                    } else {
                        System.out.println(ce + " notas de cem reais");
                    }
                } if (ci>0){
                    if (ci==1){
                        System.out.println(ci + " nota de cinquenta reais");
                    } else {
                        System.out.println(ci + " notas de cinquenta reais");
                    }
                }if (de>0){
                    if (de==1){
                        System.out.println(de + " nota de dez reais");
                    } else {
                        System.out.println(de + " notas de dez reais");
                    }
                }if (cin>0){
                    if (cin==1){
                        System.out.println(cin + " nota de cinco reais");
                    } else {
                        System.out.println(cin + " notas de cinco reais");
                    }
                }if (um>0){
                    if (um==1){
                        System.out.println(um + " nota de um real");
                    } else {
                        System.out.println(um + " notas de um real");
                    }
                }
            }
        }
    }
}
