import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        int n=0, u=0, d=0, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo até 1000: ");
        n=sc.nextShort();
        if (n>=1000 && n<0){
            System.out.print("O numero " + n + " não atende as condições propostas.");
        } else if (n>=0 && n<10){
            u=n;
            d=0;
            c=0;
        } else if (n>=10 && n<100) {
            u=(n%10);
            d=(n/10);
            c=0;
        }else {
            u=((n%100)%10);
            d=((n%100)/10);
            c=(n/100);
        }
        if (n==0){
            System.out.print("O numero " + n + " não possui unidades, desenas ou centenas; pois o mesmo é um numero nulo.");
        } else if (u==1 && d==1 && c==1) {
            System.out.print(n + "= " + c + " centena, " + d + " desena e " + u + " unidade");
        } else if (u==1 && d==0 && c==1) {
            System.out.print(n + "= " + c + " centena e " + u + " unidade");
        } else if (u==1 && d==1 && c==0) {
            System.out.print(n + "= " + d + " desena e " + u + " unidade");
        } else if (u==0 && d==1 && c==1) {
            System.out.print(n + "= " + c + " centena e " + d + " desena");
        }else if (u==0 && d==0 && c==1) {
            System.out.print(n + "= " + c + " centena");
        }else if (u==0 && d==1 && c==0) {
            System.out.print(n + "= " + d + " desena");
        }else if (u==1 && d==0 && c==0) {
            System.out.print(n + "= " + u + " unidade");
        } else if (u>1 && d>1 && c>1) {
            System.out.print(n + "= " + c + " centenas, " + d + " desenas e " + u + " unidades");
        } else if (u==1 && d>1 && c>1) {
            System.out.print(n + "= " + c + " centenas, " + d + " desenas e " + u + " unidade");
        } else if (u>1 && d==1 && c>1) {
            System.out.print(n + "= " + c + " centenas, " + d + " desena e " + u + " unidades");
        } else if (u>1 && d>1 && c==1) {
            System.out.print(n + "= " + c + " centena, " + d + " desenas e " + u + " unidades");
        } else if (u==1 && d==1 && c>1) {
            System.out.print(n + "= " + c + " centenas, " + d + " desena e " + u + " unidade");
        } else if (u>1 && d==1 && c==1) {
            System.out.print(n + "= " + c + " centena, " + d + " desena e " + u + " unidades");
        } else if (u==1 && d>1 && c==1) {
            System.out.print(n + "= " + c + " centena, " + d + " desenas e " + u + " unidade");
        } else if (u>1 && d==0 && c>1) {
            System.out.print(n + "= " + c + " centenas e " + u + " unidades");
        } else if (u>1 && d>1 && c==0) {
            System.out.print(n + "= " + d + " desenas e " + u + " unidades");
        } else if (u==0 && d>1 && c>1) {
            System.out.print(n + "= " + c + " centenas e " + d + " desenas");
        }else if (u==0 && d==0 && c>1) {
            System.out.print(n + "= " + c + " centenas");
        }else if (u==0 && d>1 && c==0) {
            System.out.print(n + "= " + d + " desenas");
        }else if (u>1 && d==0 && c==0) {
            System.out.print(n + "= " + u + " unidades");
        } else if (u>1 && d==0 && c==1) {
            System.out.print(n + "= " + c + " centena e " + u + " unidades");
        } else if (u>1 && d==1 && c==0) {
            System.out.print(n + "= " + d + " desena e " + u + " unidades");
        } else if (u==0 && d==1 && c>1) {
            System.out.print(n + "= " + c + " centenas e " + d + " desena");
        } else if (u==1 && d==0 && c>1) {
            System.out.print(n + "= " + c + " centenas e " + u + " unidade");
        } else if (u==1 && d>1 && c==0) {
            System.out.print(n + "= " + d + " desenas e " + u + " unidade");
        } else if (u==0 && d>1 && c==1) {
            System.out.print(n + "= " + c + " centena e " + d + " desenas");
        }
    }
}
