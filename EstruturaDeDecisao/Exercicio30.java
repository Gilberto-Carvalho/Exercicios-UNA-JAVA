import java.text.DecimalFormat;
import java.text.Format;

public class Exercicio30 {
    public static void main(String[] args) {
        double p1=8000, p2=200000, t1=0.03, t2=0.015;
        int a=0;
        DecimalFormat df = new DecimalFormat("###");
        while (p1<p2){
            p1=p1*(1+t1);
            p2=p2*(1+t2);
            a=a+1;
        }
        System.out.print("Em "+a+ " anos o primeiro país supera a população do segundo país.\nA população do do primeiro país é: "+df.format(p1)+" habitantes\n"+"A população do do segundo país é: "+df.format(p2)+" habitantes");
    }
}
