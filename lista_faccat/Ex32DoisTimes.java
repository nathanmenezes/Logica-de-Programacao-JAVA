package lista_faccat;

import java.util.Scanner;

public class Ex32DoisTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor.");

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = sc.nextLine();

        System.out.print("Digite o número de gols do time " + time1 + ": ");
        int time1Gols = sc.nextInt();

        System.out.print("Digite o nome do segundo time: ");
        sc.nextLine();
        String time2 = sc.nextLine();

        System.out.print("Digite o número de gols do time " + time2 + ": ");
        int time2Gols = sc.nextInt();

        if(time1Gols > time2Gols){
            System.out.printf("O time vencedor foi o %s com um saldo de %d gols", time1, time1Gols);
        }else if(time2Gols > time1Gols){
            System.out.printf("O time vencedor foi o %s com um saldo de %d gols", time2, time2Gols);
        }else{
            System.out.println("EMPATE!");
        }

        sc.close();
    }
}
