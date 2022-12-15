package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que você deseja digitar: ");
        int n = sc.nextInt();

        double vetor[] = new double[n]; // Instancia o array e informa o tamanho
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        double soma = 0;
        String lista = "";

        for (int i = 0; i < vetor.length; i++) {
            lista += vetor[i] + " ";
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.println("Valores: " + lista);
        System.out.println("Soma: " + soma);
        System.out.printf("Media: %.2f%n", media);



        sc.close();
    }
}
