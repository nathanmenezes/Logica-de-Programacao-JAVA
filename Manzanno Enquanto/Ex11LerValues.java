package manzanoEnquanto;

import java.util.Scanner;

public class E10_LeituraValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte valor = 0;
		byte maior = 0;
		byte menor = 127;
		while (valor >= 0) {
			System.out.println("Informe um valor: ");
			valor = sc.nextByte();
			if (maior<valor) {
				maior = valor;
			}
			if (valor<menor && valor>= 0) {
				menor = valor;
			}
			
		}
		System.out.println("Dos informados, o maior valor foi: "+maior);
		System.out.println("Dos informados, o menor valor foi: "+menor);
		sc.close();

	}

}
