import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        String a, b, c, d, e;
        int s=0;
        Scanner key = new Scanner(System.in);
        System.out.print("Telefonou para a vítima? ");
        a= key.next();
        System.out.print("Esteve no local do crime? ");
        b= key.next();
        System.out.print("Mora perto da vítima? ");
        c= key.next();
        System.out.print("Devia para a vítima? ");
        d= key.next();
        System.out.print("Já trabalhou com a vítima? ");
        e= key.next();
        if (a.equalsIgnoreCase("sim")){
            s=s+1;
        }
        if (b.equalsIgnoreCase("sim")){
            s=s+1;
        }
        if (c.equalsIgnoreCase("sim")){
            s=s+1;
        }
        if (d.equalsIgnoreCase("sim")){
            s=s+1;
        }
        if (e.equalsIgnoreCase("sim")){
            s=s+1;
        }
        if (s<2){
            System.out.print("Inocente");
        } else if (s<3) {
            System.out.print("Suspeita");
        } else if (s<5) {
            System.out.print("Cúmplice");
        } else {
            System.out.print("Assassino");
        }
        key.close();
    }
}
