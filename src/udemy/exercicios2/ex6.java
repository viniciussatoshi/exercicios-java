package udemy.exercicios2;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double value;

        value = read.nextDouble();

        if (value < 0 || value > 100) {
            System.out.println("Fora de intervalo");
        }
        else if (value <= 25) {
            System.out.printf("Intervalo [0,25]");
        }
        else if (value <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (value <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

        read.close();
    }
}
