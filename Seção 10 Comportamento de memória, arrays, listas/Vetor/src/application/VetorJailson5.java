package application;

import java.util.Scanner;

public class VetorJailson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite quantas escolhes você quer fazer: ");
        int n = sc.nextInt();

        boolean[] vetor = new boolean[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a escolha " + (i+1) + ": ");
            vetor[i] = sc.nextBoolean();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: %s \n", (i+1) , vetor[i]);
        }

        sc.close();
    }
}
