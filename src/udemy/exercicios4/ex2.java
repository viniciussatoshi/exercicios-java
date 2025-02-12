package udemy.exercicios4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n, i, x, dentro, fora;

        n = read.nextInt();
        dentro = 0;
        fora = 0;

        for (i = 0; i < n; i++) {
            x = read.nextInt();
            if (x >= 10 && x <= 20) {
                dentro = dentro + 1;
            }
            else {
                fora = fora + 1;
            }
        }

        System.out.println(dentro + " in");
        System.out.println(fora + " out");

        read.close();
    }
}
