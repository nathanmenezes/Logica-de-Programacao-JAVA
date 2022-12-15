package lista_faccat;


import java.util.Scanner;

public class Ex25DebitoCredito {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número da conta do cliente, saldo, debito e crédito para verificar o saldo atual");

    System.out.print("Número da Conta: ");
    String nConta = sc.nextLine();

    System.out.print("Digite o saldo da conta: ");
    double saldo = sc.nextDouble();

    System.out.print("Digite o debito da conta: ");
    double debito = sc.nextDouble();

    System.out.print("Digite o crédito da conta: ");
    double credito = sc.nextDouble();

    saldo = saldo - debito + credito;

    String status = "";

    if (saldo > 0) {
        status = "saldo positivo";
    } else if (saldo < 0) {
        status = "saldo negativo";
    } else {
        status = "saldo igual a zero";
    }

    System.out.printf("A conta %s tem o %s R$ %.2f", nConta, status, saldo);

    sc.close();
    }
}
