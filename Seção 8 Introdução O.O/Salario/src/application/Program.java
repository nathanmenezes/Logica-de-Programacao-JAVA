package application;

import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Digite os dados do funcionario para ajustar o salario: ");

        System.out.print("Nome: ");
        emp.nome = sc.nextLine();

        System.out.print("Salario Bruto: ");
        emp.salarioBruto = sc.nextDouble();

        System.out.print("Taxa: ");
        emp.taxa = sc.nextDouble();

        System.out.println("Empregado: " + emp);

        System.out.print("Qual a porcentagem de aumento de salario? ");
        double porcentagem = sc.nextDouble();
        emp.AumentoSalario(porcentagem);

        System.out.println("Atualizado: " + emp);

        sc.close();

    }
}