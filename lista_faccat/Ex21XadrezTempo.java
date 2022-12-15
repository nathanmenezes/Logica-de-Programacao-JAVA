package lista_faccat;

import java.util.Scanner;

public class Ex21XadrezTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora e inicio e de fim de um jogo de xadrez para calcular o tempo total do jogo");

        System.out.print("Hora Inicio: ");
        int horaInicio = sc.nextInt();

        System.out.print("Hora Fim: ");
        int horaFim = sc.nextInt();

        int duracao = horaFim - horaInicio;

        if(duracao < 0){
            duracao += 24;
        }

        System.out.println(duracao);

        sc.close();
    }
}
