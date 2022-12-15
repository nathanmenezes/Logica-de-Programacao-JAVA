package application;

import java.util.Scanner;

import entities.Student;

public class Program{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("Digite seu nome: ");
        st.nome = sc.nextLine();

        System.out.print("Digite sua primeira nota: ");
        st.nota1 = sc.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        st.nota2 = sc.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        st.nota3 = sc.nextDouble();

        if(st.NotaFinal() >= 60){
            System.out.println("Nota Final: " + st.NotaFinal() + "\nPASSOU");
        }
        else{
            System.out.println("Nota Final: " + st.NotaFinal() + "\nFALHOU \nFaltando " + st.PontosFaltando() + " Pontos");
        }
        

        sc.close();
        

    }
}