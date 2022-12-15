package manzanoEnquanto;

public class Ex02Soma100 {

	public static void main(String[] args) {
		
		byte contadora = 1;
		int acumuladora = 0;
		
		while (contadora<=100) {
			acumuladora+=contadora;
			contadora++;
		}
		System.out.println("O total da soma obtida �: "+acumuladora);
	}

}
