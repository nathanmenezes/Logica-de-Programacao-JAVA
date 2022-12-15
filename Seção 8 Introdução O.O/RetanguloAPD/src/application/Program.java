package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");

        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
