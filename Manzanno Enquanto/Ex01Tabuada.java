package manzanoEnquanto;

import java.util.Scanner;

public class Ex01Tabuada {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número para mostrar a tabuada: ");
    int numero = sc.nextInt();
    int acumuladora;
    int contadora = 1;
    while (contadora <= 10) {
      acumuladora = numero * contadora;
      System.out.println(numero + " x " + contadora + " = " + acumuladora);
      contadora++;
    }
    sc.close();
  }
}
