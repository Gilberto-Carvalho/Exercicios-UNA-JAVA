import java.util.Scanner;
public class UsaElevador {



    public static void main(String[] args) {

        //Construindo um objeto

        //Instanciando a classe Elevador

        Elevador e=new Elevador();

        e.setMarca("Otis");

        e.transportar(1500);

        System.out.println("Passageiros: "+e.getPassageiros());

        System.out.println("Carga: "+e.getCarga());

    }

}
//
//public class Entrada {
//    public static void main(String[] args) {
//        int i=-1;
//        String a="10",b="20";
//        System.out.println(a+b);
//        Scanner sc = new Scanner(System.in);
//        Calculadora calculadora= new Calculadora();
//        Profissional profissional = new Profissional();
//        ItemSistema itemSistema = new ItemSistema();
//        System.out.print("Qual o seu nome? ");
//        calculadora.Nome= sc.next();
//        System.out.print("Qual o seu sálario mensal? ");
//        calculadora.SalarioMensal = sc.nextDouble();
//        System.out.println("Qual a complexidade? ");
//        itemSistema.complexidade = sc.nextInt();
//    }

