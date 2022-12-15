package manzanoEnquanto;

public class E03_SomaPares {

	public static void main(String[] args) {
		
		short contadora = 1;
		int acumuladora = 0;
		
		while (contadora<=500) {	
			if (contadora%2==0) {
				acumuladora += contadora;
			}
			contadora++;
		}
		System.out.println("A soma dos valores pares de 1 ao 500 é: "+acumuladora);
	}

}
