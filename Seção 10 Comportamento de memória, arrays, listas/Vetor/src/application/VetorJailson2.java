package application;

import java.util.Scanner;

public class VetorJailson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();

        String[] vetor = new String[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome da pessoa " + i + ": ");
            vetor[i] = sc.nextLine();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: %s \n", i , vetor[i]);
        }

        sc.close();
    }
}
