package udemy.exercicios1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int A, B, C, D, dif;

        A = read.nextInt();
        B = read.nextInt();
        C = read.nextInt();
        D = read.nextInt();

        dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

        read.close();
    }
}
