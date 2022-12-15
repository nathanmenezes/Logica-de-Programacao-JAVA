package lista_faccat;

import java.util.Scanner;

public class Ex27PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para verficar se é positivo, negativo ou zero");

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        String status = "";

        if(valor > 0){
            status = "Positivo";
        }else if(valor == 0){
            status = "Igual a Zero";
        }else{
            status = "Negativo";
        }

        System.out.println(status);

        sc.close();
    }
}
