package lista_faccat;

import java.util.Scanner;

public class Ex33Ler3ValoresImprimirMensagem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ler dois valores e imprimir uma das três mensagens a seguir: ");
        System.out.println("Números iguais, caso os números sejam iguais ");
        System.out.println("Primeiro é maior, caso o primeiro seja maior que o segundo; ");
        System.out.println("Segundo maior, caso o segundo seja maior que o primeiro.");

        System.out.print("Valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Valor 2: ");
        double valor2 = sc.nextDouble();

        if(valor1 > valor2){
            System.out.println("Primeiro é maior que o segundo: ");
        }else if(valor2 > valor1){
            System.out.println("Segundo é maior que o primeiro");
        }else{
            System.out.println("Números Iguais");
        }

        sc.close();

    }
}
