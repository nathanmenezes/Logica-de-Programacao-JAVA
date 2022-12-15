package lista_faccat;

import java.util.Scanner;

public class Ex22JornadaTrabalho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas em um mês e o salário por hora para ser calculado o salario: ");

        System.out.print("Horas Trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Salario Hora: ");
        double salarioHora = sc.nextDouble();

        double totalSalario = 0;

        int horasTrab = horasTrabalhadas;

        if(horasTrabalhadas > 40){
            totalSalario = salarioHora * 40;

            horasTrabalhadas -= 40;

            totalSalario += ((salarioHora * 0.5) + salarioHora) * horasTrabalhadas;
        }else{
            totalSalario = salarioHora * horasTrabalhadas;
        }

        System.out.println("Em " + horasTrab + " horas trabalhadas o seu salario total foi de: " + totalSalario);

        sc.close();
    }
}