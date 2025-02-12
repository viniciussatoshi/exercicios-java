package udemy.exercicios2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n;

        n = read.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

    }
}
