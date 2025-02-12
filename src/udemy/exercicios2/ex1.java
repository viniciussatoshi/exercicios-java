package udemy.exercicios2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n;

        n = read.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }


    }
}
