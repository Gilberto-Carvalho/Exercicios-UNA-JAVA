import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        double n=11;
        try (Scanner sc = new Scanner(System.in)){
            while (n>10 || n<0){
                System.out.print("Digite uma nota entre 0 e 10: ");
                n=sc.nextDouble();
            }
            System.out.print(n);
        }
    }
}
