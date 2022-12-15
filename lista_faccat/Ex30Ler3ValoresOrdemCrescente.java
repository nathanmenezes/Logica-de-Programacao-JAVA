package lista_faccat;

import java.util.Scanner;

public class Ex30Ler3ValoresOrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores para se escrito em ordem crescente: ");
        
        System.out.print("Valor 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Valor 2: ");
        double valor2 = sc.nextDouble();

        System.out.print("Valor 3: ");
        double valor3 = sc.nextDouble();

        double maior = 0, meio = 0, menor = 0;

        if(valor1 > valor2 & valor1 > valor3){
            maior = valor1;
            if(valor2 > valor3){
                meio = valor2;
                menor = valor3;
            }else{
                meio = valor3;
                menor = valor2;
            }
        }

        if(valor2 > valor1 & valor2 > valor3){
            maior = valor2;
            if(valor1 > valor3){
                meio = valor1;
                menor = valor3;
            }else{
                meio = valor3;
                menor = valor1;
            }
        }

        if(valor3 > valor2 & valor3 > valor1){
            maior = valor3;
            if(valor2 > valor1){
                meio = valor2;
                menor = valor1;
            }else{
                meio = valor1;
                menor = valor2;
            }
        }

        System.out.printf("Maior: %.2f%nMeio: %.2f%nMenor: %.2f", maior, meio, menor);

        sc.close();
    }
}
