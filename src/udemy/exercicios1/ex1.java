package udemy.exercicios1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n1, n2, soma;

        n1 = read.nextInt();
        n2 = read.nextInt();

        soma = n1 + n2;

        System.out.println("SOMA = " + soma);

        read.close();
    }
}
