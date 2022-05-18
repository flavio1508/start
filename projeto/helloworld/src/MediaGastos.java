import java.util.Scanner;

public class MediaGastos {
    public static void main(String[] args) {
        double despesadomes, mediamensal,
        despesatotal = 0 ;
        Scanner leitor = new Scanner(System.in);
       
            for (int i = 1; i <= 12; i++) { 
           System.out.println("informe despesa mes :" + i);
           despesadomes = leitor.nextDouble();
           despesatotal = (despesatotal + despesadomes);  
        }
        mediamensal = despesatotal / 12;
            System.out.println("o valor da despesa total e" + despesatotal);
            System.out.println("o valor é" + String.format("%.2f", mediamensal)); 
    }  
}  