package udemy.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int number, hour;
        double value, salary;

        number = read.nextInt();
        hour = read.nextInt();
        value = read.nextDouble();

        salary = hour * value;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        read.close();
    }
}
