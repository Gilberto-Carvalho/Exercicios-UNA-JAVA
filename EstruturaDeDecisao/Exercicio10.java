import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        char e;
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite M se você é do turno matutino, V se você for vespertino ou N se você for noturno: ");
            e = key.next().charAt(0);
            if (e=='M'){
                System.out.print("Bom dia!");
            } else if (e=='V') {
                System.out.print("Boa tarde!");
            } else if (e=='N') {
                System.out.print("Boa noite!");
            } else {
                System.out.print("Valor invalido!");
            }
        }
    }
}
