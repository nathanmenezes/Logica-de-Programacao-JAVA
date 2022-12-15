package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Produtos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();

        Product[] vetor = new Product[n];

        for(int i =0; i < vetor.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Product(name, price);
        }

        double soma = 0;

        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i].getPrice();
        }

        double media = soma / n;

        System.out.printf("Preço Médio: %.2f%n", media);

        sc.close();

    }
}
