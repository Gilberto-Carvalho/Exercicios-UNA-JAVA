import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double a, b, c;
        try (Scanner key = new Scanner (System.in)){
            System.out.print("Digite o primeiro numero: ");
            a = key.nextDouble();
            System.out.print("Digite o segundo numero: ");
            b = key.nextDouble();
            System.out.print("Digite o terceiro numero: ");
            c = key.nextDouble();
            System.out.print("O maior numero é: ");
            if ((a > b) && (a > c)){
                System.out.print(a);
            }
            else if ((b > c)){
                System.out.print(b);
            }
            else {
                System.out.print(c);
            }
        }
    }
}
