package lista_faccat;

import java.util.Scanner;

public class Ex24VendedorComissao{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salario fixo e o valor das vendas efetuadas de um vendedor para calculo do salario total");

        System.out.print("Salário Fixo: ");
        double salario = sc.nextDouble();

        System.out.print("Valor total das vendas efetuadas: ");
        double totalVendas = sc.nextDouble();

        if(totalVendas > 1500){
            salario = salario + (1500 * 0.03) + (totalVendas - 1500) * 0.05;
        }else{
            salario = salario + (totalVendas * 0.03);
        }

        System.out.println("O salario total desse vendedor é de: " + salario);

        sc.close();
    }
}