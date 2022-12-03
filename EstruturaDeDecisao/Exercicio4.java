import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite uma letra: ");
            char l = key.nextLine().charAt(0);
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
                System.out.print("A letra '" + l + "' é uma vogal.");
            }
            else {
                System.out.print("A letra '" + l + "' é uma consoante.");
            }
        }
    }
}
