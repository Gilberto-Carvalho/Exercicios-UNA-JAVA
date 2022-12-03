import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        int a;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite um ano: ");
            a = key.nextInt();
            if (a<1582){
                System.out.println("O registro do ano bissexto como conhecemos hoje, começou em 1582 com o Papa Gregório; " +
                        "assim como o nome que utilizamos hoje, 'Calendário gregoriano'");
            }
            if (a<-50){
                System.out.print("O primeiro registro histórico de ano bissexto foi em meados de 50 a.C.");
            } else {
                if (a==0 || (a<0 && ((a * (-1))%4)==0)){
                    System.out.print("O ano '" + a + "' é um ano bissexto.");
                } else if (a>0 && a<100 && (a%4)==0) {
                    System.out.print("O ano '" + a + "' é um ano bissexto.");
                } else if (a>=100 && (((a%4)==0 && (a%100)!=0) || (a%400)==0)) {
                    System.out.print("O ano '" + a + "' é um ano bissexto.");
                } else {
                    System.out.print("O ano '" + a + "' não é um ano bissexto.");
                }
            }
        }
    }
}
