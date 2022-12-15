package lista_faccat;

import java.util.Scanner;

public class Ex31PodeFormarTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo");

        System.out.print("Lado A: " );
        double ladoA = sc.nextDouble();

        System.out.print("Lado B: " );
        double ladoB = sc.nextDouble();

        System.out.print("Lado C: " );
        double ladoC = sc.nextDouble();

        if(ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoB + ladoA)){
            System.out.println("Pode Formar um triangulo");
        }else{
            System.out.println("Não pode formar um triangulo");
        }

        sc.close();
    }
}
