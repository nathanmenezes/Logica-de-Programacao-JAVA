package lista_faccat;

import java.util.Scanner;

public class Ex19DoisValoresQualMaior{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores para ser verificado qual é o maior");

        System.out.print("Valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Valor 2: ");
        double valor2 = sc.nextDouble();

        if(valor1 > valor2){
            System.out.printf("O valor %.2f é maior que o valor %.2f", valor1, valor2);
        }else{
            System.out.printf("O valor %.2f é maior que o valor %.2f", valor2, valor1);
        }

        sc.close();
    }
}