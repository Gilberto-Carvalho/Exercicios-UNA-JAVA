import java.util.Scanner;

/**
 * Exercicio1
 */
public class Exercicio1 {
    public static void main(String[] args) {
        double a, b;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite o primeiro numero: ");
            a = key.nextDouble();
            System.out.print("Digite o segundo numero: ");
            b = key.nextDouble();
            if (a > b){
                System.out.print("O maior numero é: " + a);
            }
            else{
                System.out.print("o maior numero é: " + b);
            }
        }
    }
}