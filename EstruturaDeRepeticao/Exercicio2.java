import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        String usuario="a", senha="a";
        try (Scanner sc = new Scanner(System.in)){
            while (usuario.equalsIgnoreCase(senha)){
                System.out.print("Digite o seu usuario: ");
                usuario=sc.next();
                System.out.print("Digite o sua senha: ");
                senha=sc.next();
            }
            System.out.println("Usuario: " + usuario);
            System.out.println("Senha: " + senha);
        }
    }
}
