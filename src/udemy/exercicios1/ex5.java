package udemy.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double value1, value2, total;

        cod1 = read.nextInt();
        num1 = read.nextInt();
        value1 = read.nextDouble();

        cod2 = read.nextInt();
        num2 = read.nextInt();
        value2 = read.nextDouble();

        total = num1 * value1 + num2 * value2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        read.close();
    }
}
