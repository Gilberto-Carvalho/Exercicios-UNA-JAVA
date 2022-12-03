import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        double a, b, c, d;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite o valor de 'A': ");
            a = key.nextDouble();
            if (a==0){
                System.out.print("Esta não é uma equação do segundo grau.");
            } else {
                System.out.print("Digite o valor de 'B': ");
                b = key.nextDouble();
                System.out.print("Digite o valor de 'C': ");
                c = key.nextDouble();
                d = ((b*b)-(4*a*c));
                if (d<0){
                    System.out.print("A equação não possui raizes reais.");
                } else if (d==0) {
                    System.out.print("A equação possui apenas uma raiz real que é: x=" + ((b * (-1)) / (2* a)));
                } else {
                    System.out.println("A primeira raiz é: x'=" + (((b * (-1)) + (Math.pow(d, (1 / 2)))) / (2 * a)));
                    System.out.println("A segunda raiz é: x''=" + (((b * (-1)) - (Math.pow(d, (1 / 2)))) / (2 * a)));
                }
            }
        }
    }
}
