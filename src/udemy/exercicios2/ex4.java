package udemy.exercicios2;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int hi, hf, duracao;

        hi = read.nextInt();
        hf = read.nextInt();

        if (hf > hi) {
            duracao = hf - hi;
        }
        else {
             duracao = (24 - hi) + hf;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        read.close();
    }
}
