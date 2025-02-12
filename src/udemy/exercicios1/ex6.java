package udemy.exercicios1;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.pow;

public class ex6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        double A, B, C, areatr, areacir, areatrap, areaquad, arearet, pi = 3.14159;

        A = read.nextDouble();
        B = read.nextDouble();
        C = read.nextDouble();

        areatr = A * C / 2;
        areacir = pi * pow(C, 2);
        areatrap = (A + B) * C / 2;
        areaquad = pow(B, 2);
        arearet = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areatr);
        System.out.printf("CIRCULO: %.3f%n", areacir);
        System.out.printf("TRAPEZIO: %.3f%n", areatrap);
        System.out.printf("QUADRADO: %.3f%n", areaquad);
        System.out.printf("RETANGULO: %.3f%n", arearet);

        read.close();
    }
}
