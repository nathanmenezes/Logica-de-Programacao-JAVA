package application;

import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Account acc;

        System.out.print("Insira o número da conta: ");
        String numeroConta = sc.nextLine();
        
        System.out.print("Insira o nome do titular da conta: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Deseja fazer um depósito inicial (1 - Sim /2 - Não)?");
        char decisao = sc.next().charAt(0);

        double valorOperacao;

        if(decisao == 's'){
            System.out.print("Insira o valor do depósito inicial: ");
            valorOperacao = sc.nextDouble();
            acc = new Account(numeroConta, nomeTitular, valorOperacao);
        }
        else{
            acc = new Account(numeroConta, nomeTitular);
        }

        System.out.println("Dados da Conta: \n" + acc);

        System.out.print("Insira o valor de depósito: ");
        valorOperacao = sc.nextDouble();
        acc.Deposito(valorOperacao);

        System.out.println("Dados da Conta Atualizado: \n" + acc);

        System.out.print("Insira o valor de saque: ");
        valorOperacao = sc.nextDouble();
        acc.Saque(valorOperacao);

        System.out.println("Dados da Conta Atualizado: \n" + acc);
        sc.close();
    }
}
