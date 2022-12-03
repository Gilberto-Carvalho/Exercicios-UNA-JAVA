import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        String nome, sexo="2", civil="2";
        byte validacaos=0, validacaoc=0;
        int idade;
        double salario;
        DecimalFormat df = new DecimalFormat("R$ ###,###,###,##0.00");
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite seu nome: ");
            nome= key.next();
            if (nome.length()<=3){
                System.out.print("Nome inválido.");
            } else {
                System.out.print("Digite sua idade: ");
                idade= key.nextInt();
                if (idade<0 || idade>150){
                    System.out.print("Idade inválida.");
                } else {
                    System.out.print("Digite seu salário: ");
                    salario= key.nextDouble();
                    if (salario<0){
                        System.out.print("Salário inválido.");
                    } else {
                        while (validacaos!=1) {
                            System.out.print("Digite seu sexo 'F-Feminino ou M-Masculino': ");
                            sexo = key.next();
                            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                                validacaos = 1;
                            } else {
                                System.out.println("Sexo inválido.");
                            }
                        } while (validacaoc!=1) {
                            System.out.print("Digite seu estado civil 'S-Solteiro(a), C-Casado(a), V-Viuvo(a) ou D-Divorciado(a)': ");
                            civil = key.next();
                            if (civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v") || civil.equalsIgnoreCase("d")) {
                                validacaoc = 1;
                            } else {
                                System.out.println("Estado civil inválido.");
                            }
                        }
                        System.out.print("Nome: " +nome.toUpperCase() +"\nIdade: "+ idade +" anos\nSalário: "+ df.format(salario) +"\nSexo: "+ sexo.toUpperCase() +"\nEstado civil: "+ civil.toUpperCase());
                    }
                }
            }
        }
    }
}
