import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        try (Scanner key = new Scanner(System.in)){
            int[] lista = new int[3];
            for (int x=0; x<lista.length; x++){
                System.out.print("Digite o " + (x+1) + "º numero: ");
                lista[x] = key.nextInt();
            }
            Arrays.sort(lista);
            System.out.print("A lista em ordem decrescente fica: \n");
            for (int y=0; y<lista.length; y++){
                System.out.println((y + 1) + "º - " + lista[(lista.length - 1 - y)]);
            }
        }
    }
}
