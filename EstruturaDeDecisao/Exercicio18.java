import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        //DECLARAÇÃO DE VARIÁVEIS
        byte d;
        byte m;
        int a;
        String data;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dia: ");
        d = sc.nextByte();
        System.out.print("Digite o mês: ");
        m = sc.nextByte();
        System.out.print("Digite o ano: ");
        a = sc.nextInt();
        if (d<0 || m<0 || a<0 || d>31 || m>12){
            data="inválida";
        } else {
            //PROCESSAMENTO
            if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
                data = "válida";
            } else if ((m==4 || m==6 || m==9 || m==11) && d<31) {
                data = "válida";
            } else if (((m==2 && d<29) || (((m==2) && d<30) && (((a%4)==0 && (a%100)!=0) || (a%400)==0)))) {
                data = "válida";
            } else {
                data = "inválida";
            }
        }
        sc.close();
        System.out.println("A data: "+d+"/"+m+"/"+a+" é uma data "+data);
    }
}