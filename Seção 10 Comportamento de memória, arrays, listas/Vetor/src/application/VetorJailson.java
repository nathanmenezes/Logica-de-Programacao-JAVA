package application;

import java.util.Scanner;

public class VetorJailson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor da posição " + i + " do vetor: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: %d \n", i , vetor[i]);
        }

        sc.close();
    }
}
