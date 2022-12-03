import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double a = 0, maior = 0, menor = 0;
        try (Scanner key = new Scanner(System.in)){
            for (int x=0; x<3; x++){
                System.out.print("Digite o " + (x+1) + "º numero: ");
                a = key.nextDouble();
                if (x == 0){
                    maior = a;
                    menor = a;
                }
                if (a > maior){
                    maior = a;
                }
                if (a < menor){
                    menor = a;
                }
            }
            System.out.print("O maior numero é: " + maior + "\nO menor numero é: " + menor);
        }
    }
}
