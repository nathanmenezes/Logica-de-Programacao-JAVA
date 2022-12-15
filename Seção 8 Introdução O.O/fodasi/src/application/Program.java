package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Width: ");
        rectangle.width = sc.nextDouble();
        
        System.out.println("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle.Area());

        sc.close();
    }
}
