package lista_faccat;

import java.util.Scanner;

public class Ex10CustoCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo de fabrica de um carro para calcular o custo final");

        System.out.print("Custo Frabrica: ");
        double custo = sc.nextDouble();

        custo = custo + (custo * 0.28) + (custo * 0.45);

        System.out.println("O custo final do veículo é de: " + custo);

        sc.close();

    }
}