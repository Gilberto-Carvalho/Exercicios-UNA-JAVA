import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        double v, vma, vmo, mo, ma;
        DecimalFormat df = new DecimalFormat("R$ ###,###,###,##0.00");
        try (Scanner key = new Scanner(System.in)){
            System.out.print("Quantos Kg de morango? ");
            mo= key.nextDouble();
            System.out.print("Quantos Kg de maça? ");
            ma= key.nextDouble();
            if (ma<0 || mo<0){
                System.out.print("Peso inválido.");
            } else {
                if (ma>5){
                    vma=ma*1.5;
                } else {
                    vma=ma*1.8;
                }
                if (mo>5){
                    vmo=mo*2.2;
                } else {
                    vmo=mo*2.5;
                }
                v=vma+vmo;
                if (v>25 || (ma+mo)>8) {
                    v=v*0.9;
                }
                System.out.print("O valor a ser pago será de: " + df.format(v));
            }
        }
    }
}
