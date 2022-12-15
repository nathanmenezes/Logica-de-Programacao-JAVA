package manzanoEnquanto;

public class E07_Fibonacci {

	public static void main(String[] args) {
		
		int antecessor = 0;
		int sucessor = 1;
		int soma;
		byte contadora = 1;
		
		System.out.print("0, 1, ");
		while (contadora<=15) {
			soma = antecessor+sucessor;
			antecessor = sucessor;
			sucessor = soma;
			System.out.print(soma+", ");
			contadora++;
		}

	}

}
