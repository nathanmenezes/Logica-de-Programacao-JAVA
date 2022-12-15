package manzanoEnquanto;

import java.util.Scanner;

public class E08_SomatorioMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte contadora = 1;
		byte valor;
		int soma = 0;
		
		while (contadora<=10) {
			System.out.println("Informe o "+contadora+"º valor: ");
			valor = sc.nextByte();
			soma += valor;
			contadora++;
		}
		System.out.println("A soma dos valores correspondentes é: "+soma);
		float media = soma/10;
		System.out.println("A média correspondente é: "+media);
		sc.close();
	}

}
