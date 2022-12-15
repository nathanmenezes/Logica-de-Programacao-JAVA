package lista_faccat;

import java.util.Scanner;

public class Ex11SalarioVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos, o valor total, salario fixo e o valor que o vendedor recebe por cada carro vendido.");

        System.out.print("Número de Carros Vendidos: ");
        int nCarros = sc.nextInt();

        System.out.print("Valor total de vendas: ");
        double totalVendas = sc.nextDouble();

        System.out.print("Salario fixo: ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Valor por carro vendido: ");
        double carroVendido = sc.nextDouble();

        double resultado = salarioFixo + (nCarros * carroVendido) + (totalVendas * 0.05);

        System.out.println("O salário total desse funcionario é de: " + resultado);

        sc.close();
    }
}
