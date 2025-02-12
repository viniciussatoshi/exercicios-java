package udemy.exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n, i;
        double n1, n2, n3, media;

       n = read.nextInt();
       media = 0;

        for (i = 0; i < n; i++) {
            n1 = read.nextDouble();
            n2 = read.nextDouble();
            n3 = read.nextDouble();

            media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

            System.out.printf("MEDIA = %.1f%n", media);
        }

        read.close();
    }
}
