package lista_faccat;

import java.util.Scanner;

public class Ex7IdadeEmDias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade em anos, meses e dias para ela ser exibida apenas em dias: ");
        System.out.print("Anos: ");
        int ano = sc.nextInt();
        System.out.print("Mês: ");
        int mes = sc.nextInt();
        System.out.print("Dias: ");
        int dia = sc.nextInt();

        ano = ano * 365;

        mes = mes * 30;

        System.out.println("Sua idade expressa somente em dias é de: " + (ano + mes + dia));

        sc.close();
    }

}
