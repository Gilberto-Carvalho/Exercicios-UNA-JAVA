import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        String carne, pagamento;
        double kg, total, totalb=0, desconto, valor;
        DecimalFormat va = new DecimalFormat("R$ ###,###,##0.00");
        DecimalFormat pe = new DecimalFormat("###,##0.00 Kg");
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Digite a carne comprada conforme relação abaixo:\n FD_File Duplo\n A_Alcatra\n P_Picanha\n ");
            carne=key.next();
            if (carne.equalsIgnoreCase("FD") || carne.equalsIgnoreCase("A") ||carne.equalsIgnoreCase("P")){
                System.out.print("Digite o peso em 'Kg' da carne comprada:\n ");
                kg=key.nextDouble();
                if (kg>0){
                    System.out.print("Digite a forma de pagamento conforme relação abaixo:\n D_Dinheiro\n CT_Cartão Tabajara\n CC_Cartão de Credito\n CD_Cartão de debito\n PIX\n ");
                    pagamento=key.next();
                    if (pagamento.equalsIgnoreCase("D") || pagamento.equalsIgnoreCase("CT") || pagamento.equalsIgnoreCase("CC") || pagamento.equalsIgnoreCase("CD") || pagamento.equalsIgnoreCase("PIX")){
                       if (carne.equalsIgnoreCase("FD")){
                           if (kg>5){
                               total=kg*5.8;
                           } else {
                               totalb=kg*4.9;
                               total=kg*5.8;
                           }
                       } else if (carne.equalsIgnoreCase("A")) {
                           if (kg>5){
                               total=kg*6.8;
                           } else {
                               totalb=kg*5.9;
                               total=kg*6.8;
                           }
                       } else {
                           if (kg>5){
                               total=kg*7.8;
                           } else {
                               totalb=kg*6.9;
                               total=kg*7.8;
                           }
                       }
                       if(totalb!=0) {
                           if (pagamento.equalsIgnoreCase("CT")) {
                               valor = totalb * 0.95;
                           } else {
                               valor = totalb;
                           }
                       } else {
                           if (pagamento.equalsIgnoreCase("CT")) {
                               valor = total * 0.95;
                           } else {
                               valor = total;
                           }
                       }
                       desconto=valor-total;
                       System.out.print("\n\nCUPOM FISCAL\nCarne_ " +carne+ "\nQuantidade_ " +pe.format(kg)+ "\nPreço total_ " +va.format(total)+ "\nTipo de pagamento_ " +pagamento+ "\nValor do desconto_ " +va.format(desconto)+ "\nValor a pagar_ " +va.format(total-desconto));
                    }
                }
            } else {
                System.out.print("Opção inválida.");
            }
            key.close();
        }
    }
}
