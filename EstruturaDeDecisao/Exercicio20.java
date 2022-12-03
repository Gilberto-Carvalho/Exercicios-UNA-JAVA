import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int b=3, x=0;
        double m=0;
        double[] a;
        a = new double[b];
        try (Scanner key = new Scanner(System.in)) {
            while (x < b) {
                System.out.print("Digite a " + (x + 1) + "º nota: ");
                a[x] = key.nextDouble();
                if (a[x] > 10 || a[x] < 0) {
                    x = b + 1;
                    System.out.println("Nota inválida.");
                } else {
                    x = x + 1;
                }
            }
            if (x > b) {
                System.out.println("Execute novamente o programa e digite notas válidas.");
            } else {
                x=0;
                while (x < b) {
                    m=m+a[x];
                    x=x+1;
                }
                m=m/b;
                if (m==10) {
                    System.out.print("Aprovado com Distinção.");
                } else if ((m<10) && (m>=7)) {
                    System.out.print("Aprovado.");
                } else {
                    System.out.print("Reprovado.");
                }
            }
        }
    }
}
