package udemy.exercicios4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n, i, fat;

        n = read.nextInt();
        fat = 1;

        for(i = n; i >= 1; i--) {
            fat = fat * i;
        }
        System.out.println(fat);

        read.close();
    }
}
