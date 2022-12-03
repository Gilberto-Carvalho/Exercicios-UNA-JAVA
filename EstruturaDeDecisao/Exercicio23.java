import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        double s;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        s=key.nextDouble();
        if (s==0){
            System.out.print("O '0' numero é um numero nulo.");
        } else if (s<0) {
            if (Math.round(s)!=s){
                System.out.print("O numero " + s + " é um numero decimal negativo.");
            } else {
                System.out.print("O numero " + s + " é um numero inteiro negativo.");
            }
        } else {
            if (Math.round(s) != s) {
                System.out.print("O numero " + s + " é um numero decimal positivo.");
            } else {
                System.out.print("O numero " + s + " é um numero inteiro positivo.");
            }
        }
        key.close();
    }
}
