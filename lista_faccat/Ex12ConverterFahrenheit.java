package lista_faccat;

import java.util.Scanner;

public class Ex12ConverterFahrenheit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit para ser convertida em Celsius: ");
        double F = sc.nextDouble();

        double C = (F - 32)/9 * 5;

        System.out.println(F + "F°" + "Convertido em celsius é: "+ C + "°");

        sc.close();
    }
}