package udemy.exercicios4;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int x, i;

        x = read.nextInt();

        for (i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        read.close();
    }
}
