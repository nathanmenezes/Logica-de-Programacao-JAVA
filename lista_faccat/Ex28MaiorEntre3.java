package lista_faccat;

import java.util.Scanner;

public class Ex28MaiorEntre3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores para verficar qual é o maior");

        System.out.print("Valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Valor 2: ");
        double valor2 = sc.nextDouble();

        System.out.print("Valor 3: ");
        double valor3 = sc.nextDouble();

        double maior = 0;

        if (valor1 > valor2 & valor1 > valor3) {
            maior = valor1;
        }else if(valor2 > valor1 & valor2 > valor3){
            maior = valor2;
        }else{
            maior = valor3;
        }

        System.out.println("O maior número é o: " + maior);

        sc.close();
    }
}
