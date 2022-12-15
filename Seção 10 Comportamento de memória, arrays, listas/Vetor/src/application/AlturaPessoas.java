package application;

import java.util.Locale;
import java.util.Scanner;

public class AlturaPessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // criação da variavel 'n' que representa o tamanho do vetor
        double[] vetor = new double[n]; // criação do array

        for(int i = 0; i < n; i++){
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;

        for(int i = 0; i < n; i++){
            soma += vetor[i];
        }

        double media = soma / n;

        System.out.printf("Altura Média: %.2f%n", media);


        sc.close();

    }
}
