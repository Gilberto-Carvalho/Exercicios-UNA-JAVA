import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double a = 0, r = 0, menor = 0;
        try (Scanner key = new Scanner(System.in)){
            for (int x=1; x<4; x++){
                System.out.print("Digite o valor do " + x + "º produto: ");
                a = key.nextDouble();
                if (x == 1){
                    menor = a;
                    r = x;
                }
                if (a < menor){
                    menor = a;
                    r = x;
                }
            }
            System.out.print("Você deve comprar o " + r + "º produto");
        }
    }
}
