package lista_faccat;
import java.util.Scanner;

public class Ex6AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as dimensões do retangulo para calcular sua área.");
        System.out.print("Digite a base: ");
        float base = sc.nextFloat();
        System.out.print("Digite a altura: ");
        float altura = sc.nextFloat();

        System.out.println("A área desse retangulo é de: " + (base * altura) + " m²");

        sc.close();
    }
}
