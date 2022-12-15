package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados: ");
        int n = sc.nextInt();

        double vetor[] = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }


        double maior = vetor[0];
        double posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("O maior número é o: %.0f%n", maior);
        System.out.printf("Posição do Maior: %.0f%n", posicao);

        sc.close();
    }
}
