package lista_faccat;

import java.util.Scanner;

public class Ex17MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as duas notas da avaliação para descobrir se o aluno foi aprovado ou reprovado");

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;

        if(media >= 6){
            System.out.printf("O aluno foi APROVADO e ficou com média: %.2f", media);
        }else{
            System.out.printf("O aluno foi REPROVADO e ficou com média: %.2f", media);
        }

        sc.close();
    }
}
