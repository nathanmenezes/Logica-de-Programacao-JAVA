package lista_faccat;

import java.util.Scanner;

public class Ex26QuantiaEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade atual, quantidade maxima e quantidade minima de um produto em estoque para verificar a possibilidade de compra");

        System.out.print("Quantia Atual: ");
        int quantiaAtual = sc.nextInt();

        System.out.print("Quantia Maxima: ");
        int quantiaMaxima = sc.nextInt();

        System.out.print("Quantia Minima: ");
        int quantiaMinima = sc.nextInt();

        double quantiaMedia = (quantiaMaxima + quantiaMinima)/2;

        if (quantiaAtual >= quantiaMedia) {
            System.out.println("Não Efetuar Compra");
        } else {
            System.out.println("Efetuar Compra");
        }

        sc.close();
    }
}
