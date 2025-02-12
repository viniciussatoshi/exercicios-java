package udemy.exercicios4;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n, i;
        double n1, n2, result;

        n = read.nextInt();
        result = 0;

        for (i = 0; i < n; i++) {

                n1 = read.nextDouble();
                n2 = read.nextDouble();

                if (n2 == 0) {
                    System.out.println("divisao impossivel");
                }
                else {
                    result = (double) n1 / n2;
                    System.out.printf("%.1f%n", result);
                }
        }

        read.close();
    }
}
