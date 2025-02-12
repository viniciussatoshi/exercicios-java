package udemy.exercicios4;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n, x;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = read.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x = read.nextInt();

            if(x % 2 != 0 && x < 0) {
                System.out.println("IMPAR NEGATIVO");
            }
            else if(x == 0) {
                System.out.println("NULO");
            }
            else if(x % 2 != 0 && x > 0) {
                System.out.println("IMPAR POSITIVO");
            }
            else if(x < 0 && x % 2 == 0) {
                System.out.println("PAR NEGATIVO");
            }
            else {
                System.out.println("PAR POSITIVO");
            }
        }
        read.close();
    }
}
