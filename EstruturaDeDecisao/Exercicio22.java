import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        long n;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo: ");
        n=key.nextLong();
        if (n<0){
            System.out.print("Numero inválido.");
        } else {
            if (n%2==0 || n==0) {
                System.out.print("O numero " + n + " é par.");
            } else {
                System.out.print("O numero " + n + " é impar.");
            }
        }
    }
}
