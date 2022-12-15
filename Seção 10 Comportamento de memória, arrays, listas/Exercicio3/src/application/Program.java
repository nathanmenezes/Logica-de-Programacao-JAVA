package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        String nomes[] = new String[n];
        int idades[] = new int[n];
        double alturas[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "º Pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }


        int menor16 = 0;
        String menor16nomes = "";
        double somaAltura = 0;

        for (int i = 0; i < alturas.length; i++) {
            if(idades[i] < 16){
                menor16++;
                menor16nomes += nomes[i] + "\n";
            }
            somaAltura += alturas[i];
        }

        double mediaAlturas = somaAltura / n;

        menor16 = menor16 * 100 / n;

        System.out.printf("Altura média: %.2f%n", mediaAlturas);
        System.out.println("Pessoas com menos de 16 anos: " + menor16 + "%");
        System.out.println(menor16nomes);


        sc.close();
    }
}
