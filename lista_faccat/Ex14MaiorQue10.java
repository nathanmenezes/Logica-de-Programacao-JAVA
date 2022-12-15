package lista_faccat;

import java.util.Scanner;

public class Ex14MaiorQue10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor para veficar se é menor ou maior que 10: ");
        double valor = sc.nextDouble();

        if(valor > 10){
            System.out.println("É maior que 10");
        }else if(valor < 10){
            System.out.println("É menor que 10");
        }else{
            System.out.println("Igual a 10");
        }

        sc.close();

    }
}
