package lista_faccat;

import java.util.Scanner;

public class Ex18PodeVotar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano atual e a data de nascimento para descobrir se pode ou não votar");

        System.out.print("Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Ano Atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if(idade >= 16){
            System.out.println("Essa pessoa possui "+ idade +" anos de idade e já pode votar");
        }else{
            System.out.println("Essa pessoa possui "+ idade +" anos de idade e não pode votar");
        }

        sc.close();
    }
}
