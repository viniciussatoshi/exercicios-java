package udemy.exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double salary, imposto;

        salary = read.nextDouble();

        if (salary <= 2000.00) {
            imposto = 0;
        }
        else if (salary <= 3000.00) {
            imposto = (salary - 2000) * 0.08;
        }
        else if (salary <= 4500.0) {
            imposto = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

    }
}
