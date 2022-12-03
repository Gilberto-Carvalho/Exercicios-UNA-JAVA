import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        double a;
        try (Scanner k = new Scanner(System.in)){
            System.out.print("Digite um numero: ");
            a = k.nextDouble();
            if (a < 0){
                System.out.print("O numero " + a + " é negativo.");
            }
            else if (a > 0){
                System.out.print("O numero " + a + " é positivo.");
            }
            else{
                System.out.print("O numero " + a + " é neutro.");
            }
        }
    }
}
