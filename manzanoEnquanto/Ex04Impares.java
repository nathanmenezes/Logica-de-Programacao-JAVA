package manzanoEnquanto;

public class E04_NumerosImpares {

	public static void main(String[] args) {
		
		byte contadora = 0;
		
		while (contadora<=20) {
			if(contadora%2==1) {
				System.out.println(contadora);
			}
			contadora++;
		}
		
	}

}
