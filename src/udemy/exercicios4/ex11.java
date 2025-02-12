package udemy.exercicios4;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int x, y, soma = 0;

        System.out.println("Digite dois numeros: ");
        x = read.nextInt();
        y = read.nextInt();

        if (x > y) {
            int troca = x;
            x = y;
            y = troca;
        }

        for(int i = x + 1; i < y; i++) {
            if(i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println("SOMA DOS IMPARES = " + soma);

        read.close();
    }
}
