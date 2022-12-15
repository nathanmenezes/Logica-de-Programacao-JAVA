package manzanoEnquanto;

import java.util.Scanner;

public class E06_PotenciaDesejada {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor que deseje ser a base: ");
		byte base = sc.nextByte();
		System.out.println("Informe o valor que deseje ser o expoente: ");
		byte expoente = sc.nextByte();
		
		int potencia = 1;
		byte contadora = 1;
		while (contadora<=expoente) {
			potencia = potencia*base;
			contadora++;
		}
		System.out.println(base+" ^ "+expoente+" = "+potencia);
		sc.close();
		
		
	}
	
}
