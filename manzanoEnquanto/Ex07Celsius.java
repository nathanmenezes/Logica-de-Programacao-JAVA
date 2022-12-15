package manzanoEnquanto;

public class E07_ConversaoCelsius {

	public static void main(String[] args) {
		
		byte contadora = 1;
		byte celsius = 10;
		float fahrenheit;
		while (contadora <= 10) {
			fahrenheit = (9*celsius+160)/5;
			System.out.println("A temperatura "+celsius+"ºC pode ser convertida em: "+fahrenheit+"ºF");
			celsius += 10;
			contadora++;
		}

	}

}
