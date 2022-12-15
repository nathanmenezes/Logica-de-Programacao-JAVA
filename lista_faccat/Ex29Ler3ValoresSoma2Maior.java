package lista_faccat;

import java.util.Scanner;

public class Ex29Ler3ValoresSoma2Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores para ser somado os dois maiores");

        System.out.print("Valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Valor 2: ");
        double valor2 = sc.nextDouble();

        System.out.print("Valor 3: ");
        double valor3 = sc.nextDouble();

        double soma = 0;

        if(valor1 > valor2 & valor1 > valor3){
            if(valor2 > valor3){
                soma = valor1 + valor2;
            }else{
                soma = valor1 + valor3;
            }
        }

        if(valor2 > valor1 & valor2 > valor3){
            if(valor1 > valor3){
                soma = valor1 + valor2;
            }else{
                soma = valor2 + valor3;
            }
        }

        if(valor3 > valor2 & valor3 > valor1){
            if(valor1 > valor2){
                soma = valor3 + valor1;
            }else{
                soma = valor2 + valor3;
            }
        }

        System.out.println("A soma dos dois maiores é de: " + soma);

        sc.close();
    }
}
