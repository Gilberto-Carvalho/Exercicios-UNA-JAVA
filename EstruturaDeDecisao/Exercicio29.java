import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        double a, b, c;
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o valor de 'A': ");
            a=sc.nextDouble();
            System.out.print("Digite o valor de 'B': ");
            b=sc.nextDouble();
            c=a;
            a=b;
            b=c;
            System.out.print("O valor de 'A' é: " +a+ "\nO valor de 'B' é: "+b);
        }
    }
}
