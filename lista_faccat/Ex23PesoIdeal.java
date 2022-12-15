package lista_faccat;

import java.util.Scanner;

public class Ex23PesoIdeal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DIgite seu nome, sexo e altura para ser calculado seu peso ideal");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sexo: (M/F) ");
        String sexo = sc.nextLine();

        System.out.print("Altura (Em metros): ");
        double altura = sc.nextDouble();

        double pesoIdeal = 0;

        switch (sexo) {
            case "M":
                pesoIdeal = (72.7 * altura) - 58;
                System.out.printf("%s o seu peso ideal é de: %.2f KG", nome,pesoIdeal);
                break;
            case "F":
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.printf("%s o seu peso ideal é de: %.2f KG", nome,pesoIdeal);
                break;
            default:
                System.out.println("Digite um sexo valido!");
        }

        

        sc.close();
    }
}