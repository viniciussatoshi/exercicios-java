package udemy.exercicios3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int senha;
         senha = read.nextInt();

         while (senha != 2002) {
             System.out.println("Senha invalida");
             senha = read.nextInt();
         }
            System.out.println("Acesso Permitido");

        read.close();
    }
}
