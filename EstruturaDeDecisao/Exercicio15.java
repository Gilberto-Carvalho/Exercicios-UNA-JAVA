import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite o primeiro lado do triângulo: ");
        a = key.nextDouble();
        System.out.print("Digite o segundo lado do triângulo: ");
        b = key.nextDouble();
        System.out.print("Digite o terceiro lado do triângulo: ");
        c = key.nextDouble();
        if (a>0 && b>0 && c>0) {
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.print("Este é um triângulo ");
                if (a==b && b==c) {
                    System.out.print("equilátero.");
                } else if (a!=b && b!=c) {
                    System.out.print("escaleno");
                } else {
                    System.out.print("isóceles");
                }
            } else {
                System.out.print("Não é um triângulo!");
            }
        } else {
            System.out.print("Valor incorreto");
        }
        key.close();
    }
}
