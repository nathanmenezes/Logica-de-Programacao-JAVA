package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados: ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        String pares = "";
        int contagemPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                pares = vetor[i] + "";
                contagemPares++;
            }
        }

        System.out.println("Número de pares: ");
        System.out.println(pares);

        System.out.println("Quantidade de pares: " + contagemPares);



        sc.close();
    }
}
