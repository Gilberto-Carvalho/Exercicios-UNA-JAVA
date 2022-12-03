import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        a=key.nextDouble();
        System.out.print("Digite a segunda nota: ");
        b=key.nextDouble();
        c=((a+b)/2);
        if (a<0 || a>10 || b<0 || b>10){
            System.out.print("Valor incorreto");
        } else {
            System.out.print("Sua media foi: ");
            if (c > 9 && c <= 10) {
                System.out.print("'A'");
            } else if (c > 7.5 && c <= 9) {
                System.out.print("'B'");
            } else if (c > 6 && c <= 7.5) {
                System.out.print("'C'");
            } else if (c > 4 && c <= 6) {
                System.out.print("'D'");
            } else if (c >= 0 && c <= 4) {
                System.out.print("'E'");
            } else {
                System.out.print("Valor incorreto!");
            }
            if (c>6 && c<=10){
                System.out.print(" e você está APROVADO");
            } else {
                System.out.print(" e você está REPROVADO");
            }
        }
        key.close();
    }
}
