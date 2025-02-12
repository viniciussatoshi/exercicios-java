package udemy.exercicios2;

import java.util.Scanner;


public class ex3 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int A, B;

        A = read.nextInt();
        B = read.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }
    }
}
