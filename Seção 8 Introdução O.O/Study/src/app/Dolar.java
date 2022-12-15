package app;
import java.util.*;

import entities.Conversor;

public class Dolar {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolarPrice = sc.nextDouble();

        System.out.print("How many dollar will be bought? ");
        double dolarAmmount = sc.nextDouble();

        double total = Conversor.dollarToReal(dolarPrice, dolarAmmount);

        System.out.println("Amount to be paid in reais: "+ total);


        sc.close();

    }
}
