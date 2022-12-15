package lista_faccat;

import java.util.Scanner;

public class Ex34TesteDeMesa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("X: ");
        int x = sc.nextInt();

        System.out.print("Y: ");
        int y = sc.nextInt();

        int z = (x*y) + 5;

        String resposta = "";

        if (z <= 0){
            resposta = "A";
        }else if(z <= 100){
            resposta = "B";
        }else{
            resposta = "C";
        }

        System.out.printf("Z: %d Resposta: %s", z,resposta);

        
        sc.close();

    }
}

/*

X     Y      Z      resp
_________________________|
3   |  2  |  11   |   B  |
150 |  3  |  455  |   C  |
7   | -1  |   -2  |   A  |
-2  |  5  |   -5  |   A  |
50  |  3  |  155  |   C  |

 */
