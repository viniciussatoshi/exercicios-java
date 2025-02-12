package udemy.exercicios1;
import java.util.Scanner;
import java.util.Locale;

import static java.lang.Math.pow;


public class ex2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double area, raio;

        raio = read.nextDouble();

        area = 3.14159 * pow(raio, 2);

        System.out.printf("A = %.4f%n", area);

        read.close();
    }
}
