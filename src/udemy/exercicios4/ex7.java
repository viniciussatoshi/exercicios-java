package udemy.exercicios4;

import java.util.Scanner;
import static java.lang.Math.pow;

public class ex7 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n, i, quad, cubo;

        n = read.nextInt();

        for(i = 1; i <= n; i++) {
            quad = (int) pow(i, 2);
            cubo = (int) pow(i, 3);
            System.out.println(i + " " + quad + " " + cubo);
        }
        read.close();
    }
}
