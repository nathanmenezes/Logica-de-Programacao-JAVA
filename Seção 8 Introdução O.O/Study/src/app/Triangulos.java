package app;
import java.util.Scanner;
import entities.*;

public class Triangulos {
    public static void main(String[] args) throws Exception { //função main, função padrão, programa executavel

        Scanner sc = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo(); //instanciando do objeto
        y = new Triangulo();

        System.out.println("Digite as medida do triangulo X: ");

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        double areaX = x.area();

        System.out.println("Digite as medidas do triangulo Y: ");

        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        y.a = sc.nextDouble();

        double areaY = y.area();

        System.out.println("Triangulo X Area: " + areaX);
        System.out.println("Triangulo X Area: " + areaY);

        if(areaX > areaY){
            System.out.println("Maior é o X");
        }else{
            System.out.println("Maior é o Y");
        }


        sc.close();

    }

}
