package lista_faccat;



import java.util.Scanner;

public class Ex5Antecessor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ser lido o seu antecessor: ");

        int numero = sc.nextInt();
        System.out.println("O número antecessor de " + numero + " é: " + (numero - 1));

        sc.close();
    }

}
