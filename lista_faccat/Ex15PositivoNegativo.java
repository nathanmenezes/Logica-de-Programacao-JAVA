package lista_faccat;

import java.util.Scanner;

public class Ex15PositivoNegativo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para veficar se é positivo ou negativo: ");
        double valor = sc.nextDouble();

        if(valor >= 0){
            System.out.println("Número Positivo!");
        }else{
            System.out.println("Número Negativo!");
        }

        sc.close();
    }
}