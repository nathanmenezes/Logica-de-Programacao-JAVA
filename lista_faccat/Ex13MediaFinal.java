package lista_faccat;

import java.util.Scanner;

public class Ex13MediaFinal {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

    System.out.println("Digite as três notas para calcular a media final");

    System.out.print("Nota 1:");
    double n1 = sc.nextDouble();

    System.out.print("Nota 2:");
    double n2 = sc.nextDouble();

    System.out.print("Nota 3:");
    double n3 = sc.nextDouble();

    double mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

    System.out.println("A média final é de: " + mediaFinal);

    sc.close();
  }
}
