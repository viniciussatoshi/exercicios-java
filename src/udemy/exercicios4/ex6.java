package udemy.exercicios4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n, i;

        n = read.nextInt();

        for(i = 1;i <= n;i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        read.close();
    }
}
