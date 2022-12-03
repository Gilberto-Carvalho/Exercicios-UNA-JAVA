import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        double a, b, s;
        int v;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite o valor da primeira variavel 'A': ");
        a=key.nextDouble();
        System.out.print("Digite o valor da segunda variavel 'b': ");
        b=key.nextDouble();
        System.out.print("Digite o numero referente a operação desejada: \n");
        System.out.print(" 1_ 'A'+'B'\n 2_ 'A'-'B'\n 3_ 'B'-'A'\n 4_ 'A'*'B'\n 5_ 'A'/'B'\n 6_ 'B'/'A'\n ");
        v=key.nextInt();
        if (v<1 || v>6){
            System.out.println("Operação incorreta");
        } else {
            if (v==1) {
                s=a+b;
            } else if (v==2) {
                s=a-b;
            } else if (v==3) {
                s=b-a;
            } else if (v==4) {
                s=a*b;
            } else if (v==5) {
                s=a/b;
            } else {
                s=b/a;
            }
            if (s == 0) {
                System.out.print("O '0' numero é um numero nulo.");
            } else if (s < 0) {
                if (s%2==0) {
                    if (Math.round(s)!=s) {
                        System.out.print("O numero " + s + " é um numero par, decimal e negativo.");
                    } else {
                        System.out.print("O numero " + s + " é um numero par, inteiro e negativo.");
                    }
                } else {
                    if (Math.round(s)!=s) {
                        System.out.print("O numero " + s + " é um numero impar, decimal e negativo.");
                    } else {
                        System.out.print("O numero " + s + " é um numero impar, inteiro e negativo.");
                    }
                }
            } else {
                if (s%2==0) {
                    if (Math.round(s)!=s) {
                        System.out.print("O numero " + s + " é um numero par, decimal e positivo.");
                    } else {
                        System.out.print("O numero " + s + " é um numero par, inteiro e positivo.");
                    }
                } else {
                    if (Math.round(s)!=s) {
                        System.out.print("O numero " + s + " é um numero impar, decimal e positivo.");
                    } else {
                        System.out.print("O numero " + s + " é um numero impar, inteiro e positivo.");
                    }
                }
            }
            key.close();
        }
    }
}
