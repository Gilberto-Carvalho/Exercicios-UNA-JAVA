import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1Prova {
    public static void main(String[] args) {
        String nome="", peso="", agua="";
        int t1;
        double kg,l,qia,qai;
        t1=0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat dl = new DecimalFormat("#0.00 litros");
        DecimalFormat dk = new DecimalFormat("####0.00 quilos");
        while (t1==0) {
            System.out.print("Digite seu nome sem acentos: ");
            nome=sc.next();
            nome=nome.toUpperCase();
            if (nome.matches("^[A-z]+$")) {
                t1=1;
            } else {
                System.out.println("Nome inválido; digite um nome válido, sem acentos.");
            }
        }
        t1=0;
        while (t1==0) {
            System.out.print("Digite seu peso em kg: ");
            peso=sc.next();
            if (peso.matches("^[0-9]{1,3}[.]?[0-9]{1,2}$")){
                t1=1;
            } else {
                System.out.println("Valor inválido para o peso; digite um valor válido. (ex. 54,83kg fica 54.83)");
            }
        }
        t1=0;
        while (t1==0) {
            System.out.print("Digite quantos litros de água você bebeu hoje: ");
            agua=sc.next();
            if (agua.matches("^[0-9]{0,2}[.]?[0-9]{1,2}$")){
                t1=1;
            } else {
                System.out.println("Valor inválido para o litros de água; digite um valor válido. (ex. 4,53 litros fica 4.53)");
            }
        }
        kg=Double.parseDouble(peso);
        l=Double.parseDouble(agua);
        qia=(kg*35)/1000;
        qai=qia-l;
        System.out.println("\n\nSeu nome é: "+nome);
        System.out.println("Seu peso é: "+dk.format(kg));
        System.out.println("Você ingeriu "+dl.format(l)+" de água.");
        System.out.println("Você deve ingerir "+dl.format(qai)+" de água.");
        if (qai<0) {
            System.out.print("Parabéns, você atingiu a meta de hidratação diária!");
        } else {
            System.out.print("Continue focado em se hidratar por hoje, ainda faltam "+dl.format(qai)+"! Você consegue!");
        }
    }
}
