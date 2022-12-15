package manzanoEnquanto;

import java.util.Scanner;

public class E09_AreaResidencia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char resposta = 'S';
		int area;
		int areaTotal = 0;
		while (resposta=='S') {
			System.out.println("Informe o nome do c�modo: ");
			String comodo = sc.next();
			System.out.println("Informe a base do"+comodo+" : ");
			byte base = sc.nextByte();
			System.out.println("Informe a altura do"+comodo+" : ");
			byte altura = sc.nextByte();
			area = base*altura;
			areaTotal += area;
			System.out.println("Possui mais algum c�modo?");
			resposta = sc.next().charAt(0);
		}
		System.out.println("A �rea total de sua resid�ncia �: "+areaTotal+"m�");
		sc.close();

	}

}
