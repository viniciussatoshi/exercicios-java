package udemy.exercicios2;

import java.util.Scanner;
import java.util.Locale;

public class ex5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int cod, qtd;
        double total = 0;

        cod = read.nextInt();
        qtd = read.nextInt();

        if (cod == 1) {
            total = qtd * 4.0;
        }
        else if (cod == 2) {
            total = qtd * 4.5;
        }
        else if (cod == 3) {
            total = qtd * 5.0;
        }
        else if (cod == 4) {
            total = qtd * 2.0;
        }
        else {
            total = qtd * 1.5;
        }

        System.out.printf("Total: %.2f%n", total);

        read.close();
    }
}
