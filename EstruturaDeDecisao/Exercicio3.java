import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite 'm' se você for do sexo masculino, ou 'f' se você for do sexo feminino: ");
            char s = key.next().charAt(0);
            if (Character.compare(s, 'm') == 0){
                System.out.print("Seu sexo é masculino.");
            }
            else if (Character.compare(s, 'f') == 0){
                System.out.print("Seu sexo é feminino.");
            }
            else{
                System.out.print("Sexo inválido.");
            }
        }
    }
}
