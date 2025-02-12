package udemy.exercicios3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int x, y;

        x = read.nextInt();
        y = read.nextInt();

        while (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                }
                else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                }
                else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                }
                else {
                    System.out.println("quarto");
                }
                x = read.nextInt();
                y = read.nextInt();
        }
        read.close();
    }
}
