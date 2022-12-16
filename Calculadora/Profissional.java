import java.text.DecimalFormat;
import java.util.Scanner;

public class Profissional {

    public static void main(String[] args) {
        DBConector dbConector = new DBConector();
        Telas telas = new Telas();
        ItemSistema itemSistema = new ItemSistema();
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        calculadora.Nome=sc.next();
        System.out.print("Qual o salário pretendido? ");
        calculadora.SalarioMensal=sc.nextDouble();
        System.out.print("Quantas horas de trabalho possíveis no dia? ");
        calculadora.fhd = sc.nextDouble();


        System.out.print("Ditite o tipo de tela: (1-Entrada 2-Consulta 3-Gravação) ");
        telas.tipo = sc.next();


        System.out.print("Qual a complexidade de 1 a 3 da tela de entrada e saida de dados ou digite 0 caso ela não exista? ");
        itemSistema.complexidadeEntSai = sc.nextInt();
        System.out.print("Qual a complexidade de 1 a 3 da tela de consulta ou digite 0 caso ela não exista? ");
        itemSistema.complexidadeCons = sc.nextInt();
        System.out.print("Qual a complexidade de 1 a 3 da tela de gravação ou digite 0 caso ela não exista? ");
        itemSistema.complexidadeGrav = sc.nextInt();
        DecimalFormat money = new DecimalFormat("R$###,###,###,##0.00");
        DecimalFormat time = new DecimalFormat("######0 horas");

        System.out.println("\nNome: " + calculadora.Nome);
        System.out.println("Salário Mensal Pretendido: " + money.format(calculadora.SalarioMensal));
        System.out.println("Horas Mês: " + time.format(calculadora.horasUteisMes()));
        System.out.println("Valor/Hora: " + money.format(calculadora.CalcularValorHora()));

        ItemSistema[] listaItenSistemas = new ItemSistema[3];

        ItemSistema tela1 = new ItemSistema();
        tela1.nomeItem = "Tela de operação";
        tela1.tipoItem = "Entrada e saida de dados";
        tela1.complexidadeEntSai = itemSistema.complexidadeEntSai;
        listaItenSistemas[0] = tela1;

        ItemSistema tela2 = new ItemSistema();
        tela2.nomeItem = "Tela de pesquisa";
        tela2.tipoItem = "Consulta de dados";
        tela2.complexidadeCons = itemSistema.complexidadeCons;
        listaItenSistemas[1] = tela2;

        ItemSistema tela3 = new ItemSistema();
        tela3.nomeItem = "Tela de cadastro";
        tela3.tipoItem = "Gravação de dados";
        tela3.complexidadeGrav = itemSistema.complexidadeGrav;
        listaItenSistemas[2] = tela3;

        System.out.println("Item 1 do orçamento: " + tela1.nomeItem);
        System.out.println("Tipo do Item: " + tela1.tipoItem);
        System.out.println("Complexidade do Item: " + tela1.complexidadeEntSai);
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela1.CalcularQuantidadeHorasEntSai()));
        System.out.println("Item 2 do orçamento: " + tela2.nomeItem);
        System.out.println("Tipo do Item: " + tela2.tipoItem);
        System.out.println("Complexidade do Item: " + tela2.complexidadeCons);
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela2.CalcularQantidadeHorasCons()));
        System.out.println("Item 3 do orçamento: " + tela3.nomeItem);
        System.out.println("Tipo do Item: " + tela3.tipoItem);
        System.out.println("Complexidade do Item: " + tela3.complexidadeGrav);
        System.out.println("Quantidade de Horas Previstas: " + time.format(tela3.CalcularQantidadeHorasGrav()));

        int totalHorasTelas = tela1.CalcularQuantidadeHorasEntSai()+tela2.CalcularQantidadeHorasCons()+tela3.CalcularQantidadeHorasGrav();
//        int numeroTela = 1;
//
//        for (ItemSistema item : listaItenSistemas) {
//            totalHorasTelas += item.CalcularQuantidadeHorasEntSai();
//            System.out.println("\nItem " + numeroTela + " do orçamento: " + item.nomeItem);
//            System.out.println("Tipo do Item: " + item.tipoItem);
//            System.out.println("Complexidade do Item: " + item.complexidadeEntSai);
//            System.out.println("Quantidade de Horas Previstas: " + time.format(item.CalcularQuantidadeHorasEntSai()));
//            numeroTela ++;
//        }


        double valorTotalSistema = calculadora.CalcularValorHora() * totalHorasTelas * 1.3;

        System.out.println("\nValor Total do Orçamento: " + money.format(valorTotalSistema));

    }
}
