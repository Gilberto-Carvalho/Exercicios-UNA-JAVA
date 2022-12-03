import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int a;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite o numero referente ao dia da semana: ");
        a = key.nextInt();
        key.close();
        if (a==1){
            System.out.print("Domingo");
        } else if (a==2) {
            System.out.print("Segunda");
        } else if (a==3) {
            System.out.print("Terça");
        } else if (a==4) {
            System.out.print("Quarta");
        } else if (a==5) {
            System.out.print("Quinta");
        } else if (a==6) {
            System.out.print("Sexta");
        } else if (a==7) {
            System.out.print("Sabado");
        } else {
            System.out.print("Valor incorreto!");
        }
    }
}
