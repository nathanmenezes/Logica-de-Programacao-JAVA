package lista_faccat;
import java.util.Scanner;

public class Ex16MacasDuzia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de maçãs a ser compradas para calculo do total da compra: ");
        double quantiaMaca = sc.nextDouble();
        double total = 0;

        if(quantiaMaca >= 12){
            total = quantiaMaca * 1;
        }else{
            total = quantiaMaca * 1.30;
        }

        System.out.printf("%.0f Maçãs da o total de: R$ %.2f", quantiaMaca, total);

        sc.close();
    }
}
