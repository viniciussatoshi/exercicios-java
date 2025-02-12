package udemy.exercicios4;

import java.util.Scanner;
import java.util.Locale;

public class ex9 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n;
        double x, y, z;

        System.out.println("Quantos casos voce vai digitar? ");
        n = read.nextInt();

        for(int i = 0;i < n;i++) {
            System.out.println("Digite tres numeros: ");
            x = read.nextDouble();
            y = read.nextDouble();
            z = read.nextDouble();

            double media;

            media = (double) (x * 2 + (double) y * 3 + (double) z * 5) / 10;

            System.out.printf("MEDIA = %.1f%n", media);
        }
        read.close();
    }
}
