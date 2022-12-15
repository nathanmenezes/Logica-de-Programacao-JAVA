package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que você deseja digitar: ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números Negativos: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        
        

        sc.close();
    }
}
