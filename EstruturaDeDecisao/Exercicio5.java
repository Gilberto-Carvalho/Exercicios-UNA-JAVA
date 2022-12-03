import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double a, b;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite a primeira nota: ");
            a = key.nextDouble();
            System.out.print("Digite a segunda nota: ");
            b = key.nextDouble();
            if ((a >= 0) && (a <= 10) && (b >= 0) && (b <= 10)){
                if (((a + b) / 2) == 10){
                    System.out.print("Aprovado com Distinção.");
                }
                else if ((((a + b) / 2) < 10) && (((a + b) / 2) >= 7)){
                    System.out.print("Aprovado.");
                }
                else{
                    System.out.print("Reprovado.");
                }
            }
            else{
                System.out.print("Dados incorretos.");
            }
        }
    }
}
